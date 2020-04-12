@file:Suppress("SpellCheckingInspection")

plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-android-extensions")
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

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.71")
  implementation("androidx.appcompat:appcompat:1.1.0")
  implementation("androidx.core:core-ktx:1.2.0")
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  testImplementation("junit:junit:4.13")
  androidTestImplementation("androidx.test.ext:junit:1.1.1")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
