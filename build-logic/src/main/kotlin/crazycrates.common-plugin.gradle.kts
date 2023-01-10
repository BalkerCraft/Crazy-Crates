plugins {
    `java-library`
}

repositories {
    maven("https://repo.crazycrew.us/plugins/")

    maven("https://repo.triumphteam.dev/snapshots/")

    maven("https://libraries.minecraft.net/")

    maven("https://jitpack.io/")

    mavenCentral()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(project.extra["java_version"].toString()))
}

tasks {
    compileJava {
        options.release.set(project.extra["java_version"].toString().toInt())
    }
}