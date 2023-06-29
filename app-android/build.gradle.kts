plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.compose)
    alias(libs.plugins.relay)
}

android {
    namespace = "net.raquezha.devconf.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "net.raquezha.devconf.android"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        /**
         * Compose Compiler 1.4.6 is compatible with Kotlin 1.8.20
         * Compose Compiler 1.4.7 is compatible with Kotlin 1.8.21
         * Can't upgrade to Kotlin 1.8.21 because where using compose plugin 1.4.0
         * which is compatible only with kotlin  1.8.20
         */
        kotlinCompilerExtensionVersion = "1.4.6"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            @Suppress("UnstableApiUsage")
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )

        }
    }
    lint {
        checkReleaseBuilds = false
        checkDependencies = true
        abortOnError = true
        warningsAsErrors = false
        ignoreWarnings = false
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":shared"))

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material3)
    implementation(libs.compose.activity)

    debugImplementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.ui.tooling.preview)
}
