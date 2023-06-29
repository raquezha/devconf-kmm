@file:Suppress("UNUSED_VARIABLE")

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.cocoapods)
    alias(libs.plugins.compose)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
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
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions.freeCompilerArgs.add("-Xerror-tolerance-policy=SYNTAX")
            }
        }
    }

    cocoapods {
        summary = "Shared code for DevConf App"
        homepage = "http://"
        version = "1.0.0"
        ios.deploymentTarget = "16.4"
        podfile = project.file("../app-ios/Podfile")
        framework {
            baseName = "shared"
            /**
             * needed because running ios breaks the shit out the project
             * https://github.com/JetBrains/compose-multiplatform/issues/3212#issuecomment-1567292725
             * related issue: https://github.com/JetBrains/compose-multiplatform/issues/3126#issuecomment-1536530975
             */
            isStatic = true
        }
        extraSpecAttributes["resources"] = "['src/commonMain/resources/**', 'src/iosMain/resources/**']"
    }

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
        kotlin {
            jvmToolchain(17)
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":feature:compose"))
                implementation(libs.ballast.core)
                implementation(libs.ballast.navigation)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting
        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by getting {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "net.raquezha.devconf"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
