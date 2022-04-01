object Build {
    private const val gradleBuildTools = "7.1.2"
    const val buildTools = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    const val kaptGradlePlugin = "org.jetbrains.kotlin.kapt:${Kotlin.version}"

    private const val jitpackGradleBuildVersion = "2.1"

    const val jitpackGradlePlugin =
        "com.github.dcendents:android-maven-gradle-plugin:${jitpackGradleBuildVersion}"


}
