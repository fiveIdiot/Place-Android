package com.place.android.application

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PlaceApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, getString(com.place.onboard.R.string.kakao_native_key))
    }
}