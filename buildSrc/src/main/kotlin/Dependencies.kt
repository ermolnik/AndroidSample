object ApplicationConfig {
    const val id = "ru.mts.idatchik"
    const val buildToolsVersion = "29.0.2"
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 9
    const val versionName = "0.0.9"
}

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.6.1"
        const val kotlin = "1.3.70"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gmsGraglePlugin = "com.google.gms.google-services"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "android"
    const val kotlinAndroidExtensions = "android.extensions"
    const val kotlinKapt = "kapt"

}

object Versions {
    const val gradle = "3.6.1"
    const val ktlint = "7.1.0"
    const val appcompat = "1.2.0-alpha01"
    const val design = "1.2.0-alpha03"
    const val cardview = "1.0.0"
    const val recyclerview = "1.2.0-alpha01"
    const val paging = "2.1.1"
    const val room = "2.2.3"
    const val kotlin = "1.3.70"
    const val timber = "4.7.1"
    const val retrofit = "2.7.0"
    const val loggingInterceptor = "4.2.2"
    const val glide = "4.10.0"
    const val lifecycle = "2.1.0"
    const val junit = "4.12"
    const val mockito = "2.28.2"
    const val dagger = "2.23.1"
    const val constraintLayout = "1.1.3"
    const val espresso = "3.3.0-alpha03"
    const val testRunner = "1.3.0-alpha03"
    const val jacoco = "0.8.5"

    const val rxJava = "2.2.9"
    const val rxAndroid = "2.1.1"
    const val rxKotlin = "2.3.0"

    const val okHttp = "4.2.1"
    const val stetho = "1.5.0"
}

object CommonLibraries {
    const val recycleAnimations = "jp.wasabeef:recyclerview-animators:3.0.0"
    const val yoda = "net.danlew:android.joda:2.10.1.2"
    const val charts = "com.github.PhilJay:MPAndroidChart:v3.1.0"
    const val timePickee = "com.wdullaer:materialdatetimepicker:4.2.3"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:4.10.0"
    const val glideCompiler = "com.github.bumptech.glide:compiler:4.10.0"
}

object AndroidXLibraries {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val design = "com.google.android.material:material:${Versions.design}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val constraintLayoutSolver =
        "androidx.constraintlayout:constraintlayout-solver:${Versions.constraintLayout}"
    const val core = "androidx.core:core:1.0.1"
    const val fragment = "androidx.fragment:fragment:1.0.0"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.0.1"
    const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.0.0"
    const val supportVectorDrawableAnimated = "com.android.support:animated-vector-drawable:1.0.0"
}

object Timber {
    const val timber = "com.jakewharton.timber:timber:4.7.1"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifecycle}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val espresso_runner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testCore = "androidx.test:core:1.2.0"
    const val jUnitExt = "androidx.test.ext:junit:1.1.1"
    const val testRules = "androidx.test:rules:1.2.0"
    const val orchestrator = "androidx.test:orchestrator:1.2.0"
}

object Rx {
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val rxJavaRetrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:2.8.5"
}

object Dagger {
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerAndroidProcessor =
        "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object OkHttp {
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
}

object Room {
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomRxAdapter = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomTesting = "androidx.room:room-testing:${Versions.room}"
}

object Stetho {
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
}

object Kotlin {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlinKtx = "androidx.core:core-ktx:1.2.0"
}

object Firebase {
    const val analytics = "com.google.firebase:firebase-analytics:17.2.3"
    const val iid = "com.google.firebase:firebase-iid:20.1.1"
    const val messaging = "com.google.firebase:firebase-messaging:20.1.2"
    const val core = "com.google.firebase:firebase-core:17.2.2"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.10.1"
}

object Yandex {
    const val metrica = "com.yandex.android:mobmetricalib:3.8.0"
    const val installReferrer = "com.android.installreferrer:installreferrer:1.1.1"
}

object Cicerone {
    const val cicerone = "ru.terrakok.cicerone:cicerone:3.0.0"
}