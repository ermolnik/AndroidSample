@file:Suppress("SpellCheckingInspection")

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        jcenter()
        maven (url = "https://jitpack.io")
        maven (url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.3")
        classpath("com.android.tools.build:gradle:3.6.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$Versions.kotlin")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.1.1")
        classpath("org.jacoco:org.jacoco.core:0.8.5")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


allprojects {

    repositories {
        google()
        maven (url = "https://jitpack.io")
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
