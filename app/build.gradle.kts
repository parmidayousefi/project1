pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.google.gms.google-services")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
dependencies {
    classpath("com.google.gms:google-services:4.3.15")
}
}



