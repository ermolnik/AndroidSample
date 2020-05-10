@file:Suppress("SpellCheckingInspection")
buildscript {

    repositories {
        google()
        jcenter()
        maven (url = "https://jitpack.io")
        maven (url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.3")
        classpath("com.android.tools.build:gradle:3.6.3")
        classpath(kotlin("gradle-plugin", version = Versions.kotlin))
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.8.0")
        classpath("org.jacoco:org.jacoco.core:0.8.5")
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
