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

package com.google.android.libraries.feed.basicstream.internal;

import com.google.android.libraries.feed.api.stream.ContentChangedListener;
import java.util.HashSet;

/**
 * {@link ContentChangedListener} used to notify any number of listeners when content is changed.
 */
public class StreamContentChangedListener implements ContentChangedListener {

  private final HashSet<ContentChangedListener> listeners = new HashSet<>();

  public void addContentChangedListener(ContentChangedListener listener) {
    listeners.add(listener);
  }

  public void removeContentChangedListener(ContentChangedListener listener) {
    listeners.remove(listener);
  }

  @Override
  public void onContentChanged() {
    for (ContentChangedListener listener : listeners) {
      listener.onContentChanged();
    }
  }
}
