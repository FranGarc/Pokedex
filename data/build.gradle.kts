plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = Config.Java.javaVersion
    targetCompatibility = Config.Java.javaVersion
}

dependencies {


    // DI
    implementation(Dependencies.Google.Dagger.core)
    //
    implementation(Dependencies.Google.gson)


}