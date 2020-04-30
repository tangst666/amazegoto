// Copyright 2018 The Feed Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.libraries.feed.common.concurrent;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IntDef;
import android.support.annotation.VisibleForTesting;
import com.google.android.libraries.feed.common.logging.Dumpable;
import com.google.android.libraries.feed.common.logging.Dumper;
import com.google.android.libraries.feed.common.logging.Logger;
import com.google.android.libraries.feed.common.logging.StringFormattingUtils;
import com.google.android.libraries.feed.common.time.Clock;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.concurrent.GuardedBy;

/**
 * This class is responsible for running tasks on the Feed single-threaded Executor. The primary job
 * of this class is to run high priority tasks and to delay certain task until other complete. When
 * we are delaying tasks, they will be added to a set of queues and will run in order within the
 * task priority. There are three priorities of tasks defined:
 *
 * <ol>
 *   <li>Initialization, HEAD_INVALIDATE, HEAD_RESET - These tasks will be placed on the Executor
 *       when they are received.
 *   <li>USER_FACING - These tasks are high priority, running after the immediate tasks.
 *   <li>BACKGROUND - These are low priority tasks which run after all other tasks finish.
 * </ol>
 *
 * <p>The {@code TaskQueue} start in initialization mode. All tasks will be delayed until we
 * initialization is completed. The {@link #initialize(Runnable)} method is run to initialize the
 * FeedSessionManager. We also enter delayed mode when we either reset the $HEAD or invalidate the
 * $HEAD. For HEAD_RESET, we are making a request which will complete. Once it's complete, we will
 * process any delayed tasks. HEAD_INVALIDATE simply clears the contents of $HEAD. The expectation
 * is a future HEAD_RESET will populate $HEAD. Once the delay is cleared, we will run the
 * USER_FACING tasks followed by the BACKGROUND tasks. Once all of these tasks have run, we will run
 * tasks immediately until we either have a task which is of type HEAD_INVALIDATE or HEAD_RESET.
 */
public class TaskQueue implements Dumpable {
  private static final String TAG = "TaskQueue";

  /**
   * Once we delay the queue, if we are not making any progress after the initial {@code
   * #STARVATION_TIMEOUT_MS}, we will start running tasks. {@link #STARVATION_CHECK_MS} is the
   * amount of time until we check for starvation. Checking for starvation is done on the main
   * thread. Starvation checks are started when we initially delay the queue and only runs while the
   * queue is delayed.
   */
  private static final long STARVATION_TIMEOUT_MS = TimeUnit.SECONDS.toMillis(15);

  private static final long STARVATION_CHECK_MS = TimeUnit.SECONDS.toMillis(6);

  /** TaskType identifies the type of task being run and implicitly the priority of the task */
  @IntDef({
    TaskType.UNKNOWN,
    TaskType.IMMEDIATE,
    TaskType.HEAD_INVALIDATE,
    TaskType.HEAD_RESET,
    TaskType.USER_FACING,
    TaskType.BACKGROUND,
  })
  public @interface TaskType {
    // Unknown task priority, shouldn't be used, this will be treated as a background task
    int UNKNOWN = 0;
    // Runs immediately.  IMMEDIATE tasks will wait for initialization to be finished
    int IMMEDIATE = 1;
    // Runs immediately, $HEAD is invalidated (cleared) and delay tasks until HEAD_RESET
    int HEAD_INVALIDATE = 2;
    // Runs immediately, indicates the task will create a new $HEAD instance.
    // Once finished, start running other tasks until the delayed tasks are all run.
    int HEAD_RESET = 3;
    // User facing task which should run at a higher priority than Background.
    int USER_FACING = 4;
    // Background tasks run at the lowest priority
    int BACKGROUND = 5;
  }

  private final Object lock = new Object();

  @GuardedBy("lock")
  private final Queue<TaskWrapper> immediateTasks = new ArrayDeque<>();

  @GuardedBy("lock")
  private final Queue<TaskWrapper> userTasks = new ArrayDeque<>();

  @GuardedBy("lock")
  private final Queue<TaskWrapper> backgroundTasks = new ArrayDeque<>();

  @GuardedBy("lock")
  private boolean waitingForHeadReset = false;

  @GuardedBy("lock")
  private boolean initialized = false;

  /** Track the time the last task finished. Used for Starvation checks. */
  private final AtomicLong lastTaskFinished = new AtomicLong();

  private final Executor executor;
  private final Clock clock;
  private final boolean checkStarvation;
  private final Handler mainThreadHandler;

  // counters used for dump
  private int taskCount = 0;
  private int immediateRunCount = 0;
  private int delayedRunCount = 0;
  private int immediateTaskCount = 0;
  private int headInvalidateTaskCount = 0;
  private int headResetTaskCount = 0;
  private int userFacingTaskCount = 0;
  private int backgroundTaskCount = 0;
  private int maxImmediateTasks = 0;
  private int maxUserFacingTasks = 0;
  private int maxBackgroundTasks = 0;

  /**
   * @param checkStarvation This should be set to {@code false} in tests to disable Starvation
   *     checks during tests. Starvation checks on the Main Thread Executor (used by tests) will
   *     result in an infinite loop if the queue is ever delayed.
   */
  public TaskQueue(Executor executor, Clock clock, boolean checkStarvation) {
    this.executor = executor;
    this.clock = clock;
    this.checkStarvation = checkStarvation;
    mainThreadHandler = new Handler(Looper.getMainLooper());
  }

  /** Returns {@code true} if we are delaying for a request */
  public boolean isMakingRequest() {
    synchronized (lock) {
      return waitingForHeadReset;
    }
  }

  /**
   * This method will reset the task queue. This means we will delay all tasks created until the
   * {@link #initialize(Runnable)} task is called again. Also any currently delayed tasks will be
   * removed from the Queue and not run.
   */
  public void reset() {
    synchronized (lock) {
      waitingForHeadReset = false;
      initialized = false;

      // clear all delayed tasks
      immediateTasks.clear();
      userTasks.clear();
      backgroundTasks.clear();

      // Since we are delaying thing, start the starvation checker
      startStarvationCheck();
    }
  }

  /**
   * Called to initialize the {@link
   * com.google.android.libraries.feed.feedsessionmanager.FeedSessionManager}. This needs to be the
   * first task run, all other tasks are delayed until initialization finishes.
   */
  public void initialize(Runnable runnable) {
    new InitializationTaskWrapper(runnable).runTask();
  }

  /** Execute a Task on the Executor. */
  public void execute(String task, @TaskType int taskType, Runnable runnable) {
    execute(task, taskType, runnable, null, 0);
  }

  /** Execute a task providing a timeout task. */
  public void execute(
      String task,
      @TaskType int taskType,
      Runnable runnable,
      /*@Nullable*/ Runnable timeOutRunnable,
      long timeoutMillis) {

    Logger.i(
        TAG,
        " - task[%s - d: %s, b: %s, t: %s]: %s",
        taskType,
        isDelayed(),
        hasBacklog(),
        timeOutRunnable != null,
        task);
    countTask(taskType);
    boolean queueTask = isDelayed();
    TaskWrapper taskWrapper = getTaskWrapper(task, taskType, runnable);
    if (timeOutRunnable != null) {
      taskWrapper =
          new TimeoutTaskWrapper(task, taskType, taskWrapper, timeOutRunnable)
              .startTimeout(timeoutMillis);
    }
    scheduleTask(queueTask, taskWrapper, taskType);
  }

  @VisibleForTesting
  void startStarvationCheck() {
    if (!checkStarvation) {
      return;
    }
    if (isDelayed()) {
      Logger.i(TAG, " * Starting starvation checks");
      mainThreadHandler.postDelayed(new StarvationChecker(), STARVATION_CHECK_MS);
    }
  }

  private class StarvationChecker implements Runnable {
    @Override
    public void run() {
      if (!isDelayed()) {
        Logger.i(TAG, " * Starvation checks being turned off");
        // Quick out, we are not delaying things, this stops starvation checking
        return;
      }
      long lastTask = lastTaskFinished.get();
      Logger.i(
          TAG, " * Starvation Check, last task %s", StringFormattingUtils.formatLogDate(lastTask));
      if (clock.currentTimeMillis() > lastTask + STARVATION_TIMEOUT_MS) {
        Logger.e(TAG, "Starvation check failed, stopping the delay and running tasks");
        // Reset the delay since things aren't being run
        synchronized (lock) {
          if (waitingForHeadReset) {
            waitingForHeadReset = false;
          }
          if (!initialized) {
            initialized = true;
          }
        }
        executeNextTask();
      } else {
        mainThreadHandler.postDelayed(this, STARVATION_CHECK_MS);
      }
    }
  }

  private void scheduleTask(boolean queueTask, TaskWrapper taskWrapper, @TaskType int taskType) {
    if (queueTask || hasBacklog()) {
      delayedRunCount++;
      queueTask(taskWrapper, taskType);
    } else {
      immediateRunCount++;
      taskWrapper.runTask();
    }
  }

  private TaskWrapper getTaskWrapper(String task, @TaskType int taskType, Runnable runnable) {
    if (taskType == TaskType.HEAD_RESET) {
      return new HeadResetTaskWrapper(task, taskType, runnable);
    }
    if (taskType == TaskType.HEAD_INVALIDATE) {
      return new HeadInvalidateTaskWrapper(task, taskType, runnable);
    }
    return new TaskWrapper(task, taskType, runnable);
  }

  private void queueTask(TaskWrapper taskWrapper, @TaskType int taskType) {
    synchronized (lock) {
      if (taskType == TaskType.HEAD_INVALIDATE
          || taskType == TaskType.HEAD_RESET
          || taskType == TaskType.IMMEDIATE) {
        immediateTasks.add(taskWrapper);
        maxImmediateTasks = Math.max(immediateTasks.size(), maxImmediateTasks);
        if (taskType == TaskType.HEAD_RESET || initialized) {
          // HEAD_RESET is executed immediately, HEAD_INVALIDATE and IMMEDIATE are executed after
          // initialization has completed
          executeNextTask();
        }
      } else if (taskType == TaskType.USER_FACING) {
        userTasks.add(taskWrapper);
        maxUserFacingTasks = Math.max(userTasks.size(), maxUserFacingTasks);
      } else {
        backgroundTasks.add(taskWrapper);
        maxBackgroundTasks = Math.max(backgroundTasks.size(), maxBackgroundTasks);
      }
    }
  }

  private void countTask(@TaskType int taskType) {
    taskCount++;
    if (taskType == TaskType.IMMEDIATE) {
      immediateTaskCount++;
    } else if (taskType == TaskType.HEAD_INVALIDATE) {
      headInvalidateTaskCount++;
    } else if (taskType == TaskType.HEAD_RESET) {
      headResetTaskCount++;
    } else if (taskType == TaskType.USER_FACING) {
      userFacingTaskCount++;
    } else if (taskType == TaskType.BACKGROUND) {
      backgroundTaskCount++;
    }
  }

  /** Indicates that tasks are being delayed until a response is processed */
  @VisibleForTesting
  public boolean isDelayed() {
    synchronized (lock) {
      return !initialized || waitingForHeadReset;
    }
  }

  @VisibleForTesting
  boolean hasBacklog() {
    synchronized (lock) {
      return !backgroundTasks.isEmpty() || !userTasks.isEmpty() || !immediateTasks.isEmpty();
    }
  }

  private void executeNextTask() {
    lastTaskFinished.set(clock.currentTimeMillis());
    synchronized (lock) {
      TaskWrapper task = null;
      if (!immediateTasks.isEmpty()) {
        task = immediateTasks.remove();
      } else if (!userTasks.isEmpty() && !isDelayed()) {
        task = userTasks.remove();
      } else if (!backgroundTasks.isEmpty() && !isDelayed()) {
        task = backgroundTasks.remove();
      }
      if (task != null) {
        task.runTask();
      }
    }
  }

  /**
   * This class wraps the Runnable as a Runnable. It provides common handling of all tasks. This is
   * the default which supports the basic Task, subclasses will manage state changes.
   */
  private class TaskWrapper implements Runnable {
    protected final String task;
    final int taskType;
    protected final Runnable runnable;

    TaskWrapper(String task, @TaskType int taskType, Runnable runnable) {
      this.task = task;
      this.taskType = taskType;
      this.runnable = runnable;
    }

    /** This will run the task on the {@link Executor}. */
    void runTask() {
      Logger.i(TAG, "Execute task [%s - d: %s]: %s", taskType, isDelayed(), task);
      executor.execute(this);
    }

    /** Run the task (Runnable) then trigger execution of the next task. */
    @Override
    public void run() {
      runnable.run();
      executeNextTask();
    }
  }

  /**
   * Initialization will flip the {@link #initialized} state to {@code true} when the initialization
   * task completes.
   */
  private class InitializationTaskWrapper extends TaskWrapper {
    InitializationTaskWrapper(Runnable runnable) {
      super("initializationTask", TaskType.IMMEDIATE, runnable);
    }

    @Override
    public void run() {
      runnable.run();
      synchronized (lock) {
        initialized = true;
      }
      executeNextTask();
    }
  }

  /**
   * HeadReset will run a task which resets $HEAD. It clears the {@link #waitingForHeadReset} state.
   */
  private class HeadResetTaskWrapper extends TaskWrapper {
    HeadResetTaskWrapper(String task, @TaskType int taskType, Runnable runnable) {
      super(task, taskType, runnable);
    }

    @Override
    public void run() {
      runnable.run();
      synchronized (lock) {
        waitingForHeadReset = false;
      }
      executeNextTask();
    }
  }

  /**
   * HeadInvalidate is a task which marks the current head as invalid. The TaskQueue will then be
   * delayed until {@link HeadResetTaskWrapper} has completed. This will set the {@link
   * #waitingForHeadReset}. In addition starvation checks will be started.
   */
  private class HeadInvalidateTaskWrapper extends TaskWrapper {
    HeadInvalidateTaskWrapper(String task, @TaskType int taskType, Runnable runnable) {
      super(task, taskType, runnable);
      synchronized (lock) {
        waitingForHeadReset = true;
      }
    }

    @Override
    public void run() {
      runnable.run();
      startStarvationCheck();
      executeNextTask();
    }
  }

  /**
   * Runs a Task which has a timeout. The timeout task (Runnable) will run if the primary task is
   * not started before the timeout millis.
   */
  private class TimeoutTaskWrapper extends TaskWrapper {
    private final Runnable timeoutRunnable;
    private final AtomicBoolean started = new AtomicBoolean(false);

    TimeoutTaskWrapper(
        String task, @TaskType int taskType, Runnable taskRunnable, Runnable timeoutRunnable) {
      super(task, taskType, taskRunnable);
      this.timeoutRunnable = timeoutRunnable;
    }

    /**
     * Start the timeout period. If we reach the timeout before the Task is run, the {@link
     * #timeoutRunnable} will run.
     */
    private TimeoutTaskWrapper startTimeout(long timeoutMillis) {
      mainThreadHandler.postDelayed(this::runTimeoutCallback, timeoutMillis);
      return this;
    }

    @Override
    void runTask() {
      Logger.i(TAG, "Execute task [%s - %s]: %s", taskType, isDelayed(), task);
      started.set(true);
      super.runTask();
    }

    private void runTimeoutCallback() {
      if (started.get()) {
        return;
      }
      Logger.i(TAG, "Execute Timeout [%s]: %s", taskType, task);
      executor.execute(timeoutRunnable);
    }
  }

  @Override
  public void dump(Dumper dumper) {
    dumper.title(TAG);
    dumper.forKey("tasks").value(taskCount);
    dumper.forKey("immediateRun").value(immediateRunCount).compactPrevious();
    dumper.forKey("delayedRun").value(delayedRunCount).compactPrevious();

    dumper.forKey("immediateTasks").value(immediateTaskCount);
    dumper.forKey("headInvalidateTasks").value(headInvalidateTaskCount).compactPrevious();
    dumper.forKey("headResetTasks").value(headResetTaskCount).compactPrevious();
    dumper.forKey("userFacingTasks").value(userFacingTaskCount).compactPrevious();
    dumper.forKey("backgroundTasks").value(backgroundTaskCount).compactPrevious();

    dumper.forKey("maxImmediateQueue").value(maxImmediateTasks);
    dumper.forKey("maxUserFacingQueue").value(maxUserFacingTasks).compactPrevious();
    dumper.forKey("maxBackgroundQueue").value(maxBackgroundTasks).compactPrevious();
  }

  /**
   * When running on a single thread in tests, it is possible that we set waitingForHeadReset after
   * the task that would have cleared it is run. This only happens in tests since we use Direct
   * Executors which can cause Tasks to run in a nested way not done when a SingleThreaded Executor
   * is used. This method will reset the TaskQueue and run the queued tasks.
   *
   * <p>This can only be called from tests. Never call this from on test code.
   */
  @VisibleForTesting
  public void runTasksForTest() {
    synchronized (lock) {
      waitingForHeadReset = false;
    }
    executeNextTask();
  }
}
