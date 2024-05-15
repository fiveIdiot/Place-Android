plugins {
    id("com.place.android.library")
    id("com.place.android.hilt")
}

android {
    namespace = "com.place.data"
}

dependencies {

    implementation(libs.ktor.client.auth)
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.logging)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
}