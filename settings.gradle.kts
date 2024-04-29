pluginManagement {
    includeBuild("build-logic")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Place-Android"
include(":app")
include(":data")
include(":domain")
include(":navigation")
include(":core:kotlin")
include(":core:designsystem")
include(":feature:home")
include(":feature:around")
