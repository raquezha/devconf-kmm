import com.android.build.gradle.internal.ide.kmp.KotlinAndroidSourceSetMarker.Companion.android

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose)
}


@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
    }
    js(IR) {
        moduleName = project.name
        browser {
            commonWebpackConfig {
                outputFileName = "$moduleName.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        named("androidMain") {
            dependencies {
                api(compose.preview)
                api(compose.uiTooling)
            }
        }
        named("commonMain") {
            dependencies {
                implementation(libs.androidx.core)
                implementation(libs.androidx.core.ktx)
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.material3)
                api(compose.materialIconsExtended)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                api(compose.components.resources)
                api(compose.animation)
                api(compose.animationGraphics)
                api(compose.ui)
            }
        }
    }
}


android {
    namespace = "net.raquezha.devconf.${project.name}"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
