package com.place.convention

import com.android.build.api.dsl.ApplicationExtension
import com.place.convention.project.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                defaultConfig.applicationId = "com.place.android"

                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 34

                defaultConfig.testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                defaultConfig.vectorDrawables {
                    useSupportLibrary = true
                }
            }
        }
    }
}