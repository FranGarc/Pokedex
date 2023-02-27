plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.franciscogarciagarzon.pokedex"
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        applicationId = "com.franciscogarciagarzon.pokedex"
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Config.Java.javaVersion
        targetCompatibility = Config.Java.javaVersion
    }
    kotlinOptions {
        jvmTarget = Config.Java.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.Androidx.core)
    implementation(Dependencies.Androidx.lifecycle)
    implementation(Dependencies.Androidx.activityCompose)
    implementation(Dependencies.Androidx.Compose.ui)
    implementation(Dependencies.Androidx.Compose.preview)
    implementation(Dependencies.Androidx.Compose.material3)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.Androidx.junit)
    androidTestImplementation(Dependencies.Test.Androidx.espresso)
    androidTestImplementation(Dependencies.Test.Androidx.Compose.junit4)
    debugImplementation(Dependencies.Test.Androidx.Compose.tooling)
    debugImplementation(Dependencies.Test.Androidx.Compose.testManifest)
}