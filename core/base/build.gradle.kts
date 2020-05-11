plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinAndroidExtension)
    kotlin(Plugins.kotlinKapt)
}

val javaVersion: JavaVersion by extra { JavaVersion.VERSION_1_8 }

android {
    compileSdkVersion(ApplicationConfig.compileSdk)
    defaultConfig {
        minSdkVersion(ApplicationConfig.minSdk)
        targetSdkVersion(ApplicationConfig.targetSdk)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    sourceSets {
        Main.create(this)
        TTest.create(this)
        AndroidTest.create(this)
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
        unitTests.isIncludeAndroidResources = true
        animationsDisabled = true
    }

    dataBinding {
        isEnabled = true
    }

    compileOptions {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

//    lintOptions.setDefaults(file("lint.xml"))
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Kotlin.kotlin)
    implementation(Kotlin.kotlinReflect)
    implementation(Kotlin.kotlinKtx)

    implementation(AndroidXLibraries.design)
    kapt(AndroidXLibraries.androidAnnotation)

    implementation(Coroutines.coroutinesAndroid)
    implementation(Coroutines.coroutinesCore)

    implementation(LifeCycle.lifecycleExtensions)

    implementation(Timber.timber)

    implementation(Glide.glide)
    implementation(Glide.glideOkhttp)
    kapt(Glide.glideCompiler)

    implementation(Dagger.daggerAndroidSupport)
    
    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.jUnitExt)
    androidTestImplementation(TestLibraries.espresso)

    implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
    implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")
    implementation("androidx.fragment:fragment:1.2.4")
}
