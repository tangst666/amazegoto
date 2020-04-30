-optimizationpasses 5  #指定代码的压缩级别 0 - 7
-dontusemixedcaseclassnames  #是否使用大小写混合
-dontskipnonpubliclibraryclasses  #如果应用程序引入的有jar包，并且想混淆jar包里面的class
-dontoptimize   #优化  不优化输入的类文件
-dontpreverify  #混淆时是否做预校验（可去掉加快混淆速度）
-verbose #混淆时是否记录日志（混淆后生产映射文件 map 类名 -> 转化后类名的映射
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*  #混淆采用的算法
-keepattributes SourceFile,LineNumberTable # 并保留源文件名为"Proguard"字符串，而非原始的类名 并保留行号
#-ignorewarning  #忽略警告

-keep public class * extends android.app.Activity      # 保持不被混淆的类
-keep public class * extends android.app.Fragment
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.db
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class com.android.vending.licensing.ILicensingService

-keepclasseswithmembernames class * {   # 保持 native 方法不被混淆
   public static native <methods>;
}
-keep class * implements android.os.Parcelable {    # 保持 Parcelable 不被混淆（aidl文件不能去混淆）
    public static final android.os.Parcelable$Creator *;
}
-keepclassmembers public class * extends android.view.View {    #自定义View不被混淆
   void set*(***);
    *** get*();
}
-keepclasseswithmembers class * {   #自定义View不被混淆
    public <init>(android.content.Context, android.util.AttributeSet);
}
-keepclasseswithmembers class * {   #自定义View不被混淆
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

#####################################
######### 主程序不能混淆的代码 #########
#####################################
-dontwarn org.chromium.**
-keep class org.chromium.** { *; }

-dontwarn com.google.**
-keep class com.google.** { *; }

-dontwarn android.support.**
-keep class android.support.** { *; }

-dontwarn javax.annotation.**
-keep class javax.annotation.** { *; }

-dontwarn jp.tomorrowkey.**
-keep class jp.tomorrowkey.** { *; }

-dontwarn j.**
-keep class j.** { *; }


#不混淆泛型、反射、注解、内部类、异常
-keepattributes Signature,*Annotation*,InnerClasses,Exceptions
-keep class * extends java.lang.annotation.Annotation { *; }

#第三方jar包
-keep class android.support.** { *; }
-keep interface android.support.** { *; }
-keep public class * extends android.support.**
-keep class javax.inject.** {*;}

-keepclasseswithmembernames class * {
    @butterknife.InjectView *;
}
-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}
-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}

#R文件
-keep public class **.R$*{
      public static final int *;
}

#enum
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class com.umeng.** {*;}

-keepclassmembers class * {
   public <init> (org.json.JSONObject);
}

#生成mapping文件
-printmapping mapping.txt

#支付宝
#-libraryjars libs/alipaySDK-20170309.jar