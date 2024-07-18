package com.place.android.navigation

import androidx.annotation.DrawableRes
import com.place.designsystem.R

enum class BottomNavTabs(
    @DrawableRes
    val icon: Int,
    val title: String,
) {
    HOME(R.drawable.ic_home_fill, "홈"),
    AROUND(R.drawable.ic_pin, "내 주변"),
    WRITE(R.drawable.ic_pen, "작성"),
    MARKET(R.drawable.ic_shoppingbag, "상점"),
    PROFILE(R.drawable.ic_people_fill, "프로필");
}