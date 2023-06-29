plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.cocoapods) apply false
    alias(libs.plugins.org.jetbrains.kotlin.jvm) apply false
}
