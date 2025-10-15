rootProject.name = "openai-kotlin"
includeBuild("build-support")

include(":openai-core")
include(":openai-client")
include(":openai-client-bom")

include(":sample:jvm")
include(":sample:js")

val isCiBuild = System.getenv("CI")?.toBoolean() == true || System.getenv("JITPACK")?.toBoolean() == true
if (isCiBuild) {
    logger.lifecycle("Skipping :sample:native configuration for CI builds")
} else {
    include(":sample:native")
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
