# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# APK size overhead
# https://developer.android.com/jetpack/compose/tooling/tracing#apk_size_overhead
-assumenosideeffects public class androidx.compose.runtime.ComposerKt {

   boolean isTraceInProgress();

   void traceEventStart(int,int,int,java.lang.String);

   void traceEventStart(int,java.lang.String);

   void traceEventEnd();

}
