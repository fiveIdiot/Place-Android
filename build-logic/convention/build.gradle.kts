import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("AndroidApplication") {
            id = "com.place.android.application"
            implementationClass = "com.place.convention.AndroidApplicationConventionPlugin"
        }
        register("AndroidLibrary") {
            id = "com.place.android.library"
            implementationClass = "com.place.convention.AndroidLibraryConventionPlugin"
        }
        register("AndroidApplicationCompose") {
            id = "com.place.android.application.compose"
            implementationClass = "com.place.convention.AndroidApplicationComposeConventionPlugin"
        }
        register("AndroidLibraryCompose") {
            id = "com.place.android.library.compose"
            implementationClass = "com.place.convention.AndroidLibraryComposeConventionPlugin"
        }
        register("AndroidHilt") {
            id = "com.place.android.hilt"
            implementationClass = "com.place.convention.AndroidHiltConventionPlugin"
        }
    }
}