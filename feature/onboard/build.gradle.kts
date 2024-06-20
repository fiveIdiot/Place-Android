plugins {
    id("com.place.android.library")
    id("com.place.android.library.compose")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.place.onboard"
}

dependencies {
    implementation(project(":core:designsystem"))

    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.navigation.compose)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    // kakao
    implementation(libs.kakao.sdk.v2.user)

    // firebase
    implementation(platform(libs.google.firebase.bom))
    implementation(libs.google.firebase.analytics)
}