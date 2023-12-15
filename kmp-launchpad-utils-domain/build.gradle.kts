plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kt.lint.gradle)
    `maven-publish`
}

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget {
        publishAllLibraryVariants()
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "domain"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {}
        commonTest.dependencies {}
        androidMain.dependencies {}
        iosMain.dependencies {}
    }
}

android {
    namespace = "com.bottlerocketstudios.launchpadutilsdomain"
    compileSdk = libs.versions.compile.sdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.min.sdk.get().toInt()
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
    ignoreFailures.set(true)
}

group = extra["publishing.group"] as String
version = libs.versions.launchpad.utils.domain.get()

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/BottleRocketStudios/KMP-LaunchPad-Utils-Domain")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: System.getenv("LOCAL_GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN") ?: System.getenv("LOCAL_GITHUB_TOKEN")
            }
        }
    }
}
