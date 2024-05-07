package com.place.android.navigation

import androidx.annotation.DrawableRes
import com.place.designsystem.R

enum class BottomNavTabs(
    @DrawableRes
    val icon: Int,
    val title: String,
) {
    HOME(R.drawable.ic_home_large, "홈"),
    AROUND(R.drawable.ic_pin_large, "내 주변"),
    WRITE(R.drawable.ic_pen_large, "작성"),
    MARKET(R.drawable.ic_shoppingbag_large, "상점"),
    PROFILE(R.drawable.ic_people_large, "프로필");
}