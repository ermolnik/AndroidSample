@file:Suppress("SpellCheckingInspection")
plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-android-extensions")
  id("kotlin-kapt")
}

android {
  compileSdkVersion(ApplicationConfig.compileSdk)
  buildToolsVersion(ApplicationConfig.buildToolsVersion)

  defaultConfig {
    applicationId = ApplicationConfig.id
    minSdkVersion(ApplicationConfig.minSdk)
    targetSdkVersion(ApplicationConfig.targetSdk)
    versionCode = ApplicationConfig.versionCode
    versionName = ApplicationConfig.versionName
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }
  dataBinding {
    isEnabled = true
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.72")
  implementation("androidx.appcompat:appcompat:1.1.0")
  implementation("androidx.core:core-ktx:1.2.0")
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")

  implementation(Dagger.dagger)
  kapt(Dagger.daggerCompiler)
  implementation(Dagger.daggerAndroid)
  implementation(Dagger.daggerAndroidSupport)
  kapt(Dagger.daggerAndroidProcessor)


  testImplementation("junit:junit:4.13")
  androidTestImplementation("androidx.test.ext:junit:1.1.1")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
  implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
  implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")
  implementation("androidx.fragment:fragment:1.2.4")
  implementation(project(":core:base"))
  implementation(project(":features:main"))
  implementation(project(":features:settings"))
}
