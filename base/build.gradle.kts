plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinAndroidExtension)
    kotlin(Plugins.kotlinKapt)
}

//val javaVersion: JavaVersion by extra { JavaVersion.VERSION_1_8 }

android {
    compileSdkVersion(ApplicationConfig.compileSdk)
    defaultConfig {
        minSdkVersion(ApplicationConfig.minSdk)
        targetSdkVersion(ApplicationConfig.targetSdk)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

//    sourceSets {
//        Main.create(this)
//        TTest.create(this)
//        AndroidTest.create(this)
//    }

    testOptions {
        unitTests.isReturnDefaultValues = true
        unitTests.isIncludeAndroidResources = true
        animationsDisabled = true
    }

    dataBinding {
        isEnabled = true
    }

//    compileOptions {
//        sourceCompatibility = javaVersion
//        targetCompatibility = javaVersion
//    }

//    lintOptions.setDefaults(file("lint.xml"))
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Kotlin.kotlin)
    implementation(Kotlin.kotlinReflect)
    implementation(Kotlin.kotlinKtx)
//    implementation(Dependencies.material)

//    implementation(Dependencies.coroutines_core)
//    api(Dependencies.coroutines_android)
//
//    implementation(Dependencies.lifecycle_extensions)
//
//    implementation(Dependencies.timberkt)
//
//    implementation(Dependencies.glide)
//    implementation(Dependencies.glide_okhttp)
//    kapt(Dependencies.glide_compiler)
//    kapt(Dependencies.android_annotation)
//
//    api(Dependencies.dagger_android_support)

    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
