plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.example.calculator"
        minSdkVersion(26)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    // Core Libraries
    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Coroutines.android)

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.Layout.constraintLayout)

    implementation(Libs.Material.core)

    // Navigation
    implementation(Libs.AndroidX.Navigation.fragment)
    implementation(Libs.AndroidX.Navigation.uiKtx)

    // Room
    implementation(Libs.AndroidX.Room.runtime)
    kapt(Libs.AndroidX.Room.compiler)
    implementation(Libs.AndroidX.Room.ktx)

    // RecyclerView
    implementation(Libs.AndroidX.RecyclerView.core)

    // Lifecycle
    implementation(Libs.AndroidX.Lifecycle.runtimeKtx)
    implementation(Libs.AndroidX.Lifecycle.viewModelKtx)
    implementation(Libs.AndroidX.Lifecycle.liveDataKtx)
    implementation(Libs.AndroidX.Lifecycle.extensions)

    // Hilt
    implementation(Libs.Hilt.core)
    kapt(Libs.Hilt.compiler)
    implementation(Libs.AndroidX.Hilt.compiler)
    implementation(Libs.AndroidX.Hilt.lifecycleViewModel)

    // Debug
    implementation(Libs.Debug.timber)

    // Test
    testImplementation(Libs.Test.junit)
    androidTestImplementation(Libs.AndroidX.Test.Ext.junit)
    androidTestImplementation(Libs.AndroidX.Test.core)
    androidTestImplementation(Libs.AndroidX.Test.espressoCore)
    androidTestImplementation(Libs.AndroidX.Test.rules)
    androidTestImplementation(Libs.Coroutines.test)
}

//dependencies {
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
//}
