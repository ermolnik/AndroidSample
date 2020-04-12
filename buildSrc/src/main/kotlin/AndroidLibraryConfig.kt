import org.gradle.api.Action
import com.android.build.gradle.LibraryExtension as AndroidLibraryExtension

fun AndroidLibraryExtension.setDefaults() {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(ProjectVersions.androidSdk)
        versionCode = 1
        versionName = "0.0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    sourceSets.getByName("main") {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        res.srcDir("src/androidMain/res")
    }
    // TODO replace with https://issuetracker.google.com/issues/72050365 once released.
    libraryVariants.all(Action {
        generateBuildConfigProvider.configure {
            enabled = false
        }
    })
}
