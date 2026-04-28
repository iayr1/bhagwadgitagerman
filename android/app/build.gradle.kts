plugins {
    id("com.android.application")
    id("kotlin-android")

    // Flutter Gradle Plugin (must come after Android & Kotlin)
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.connectonmap.gitagerman"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        // Unique application ID
        applicationId = "com.connectonmap.gitagerman"

        // SDK configurations
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion

        // Versioning
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // ⚠️ Replace with your release signing config before Play Store upload
            signingConfig = signingConfigs.getByName("debug")

            // Optional optimizations (recommended later)
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

    // Optional: helps avoid duplicate META-INF issues
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

flutter {
    source = "../.."
}