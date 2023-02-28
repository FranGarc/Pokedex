import org.gradle.api.JavaVersion

object Config {
    const val compileSdkVersion = 33
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 33
    const val versionCode = 1
    const val versionName = "1.0"

    object Java {
        val javaVersion = JavaVersion.VERSION_1_8
        const val jvmTarget = "1.8"
    }
}