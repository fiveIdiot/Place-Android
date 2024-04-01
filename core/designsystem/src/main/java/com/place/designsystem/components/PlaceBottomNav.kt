package com.place.designsystem.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.place.designsystem.R
import com.place.designsystem.theme.PlaceTheme

enum class BottomNavTabs(
    @DrawableRes
    val icon: Int,
    val title: String,
    val routes: String,
) {
    HOME(R.drawable.ic_home_large, "홈", "HOME"),
    MYPLACE(R.drawable.ic_pin_large, "내 주변", "MYPLACE"),
    WRITE(R.drawable.ic_pen_large, "작성", "WRITE"),
    SHOP(R.drawable.ic_shoppingbag_large, "상점", "SHOP"),
    PROFILE(R.drawable.ic_people_large, "프로필", "PROFILE")
}

@Composable
fun PlaceBottomNav(
    tabs: List<BottomNavTabs>,
    currentTab: BottomNavTabs,
    onTabSelected: (tab: BottomNavTabs) -> Unit
) {
    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                .border(
                    width = 2.dp,
                    brush = Brush.verticalGradient(
                        listOf(
                            colors.grey2,
                            colors.grey2,
                            colors.grey1,
                            colors.grey1,
                            colors.grey1,
                            colors.grey1,
                            colors.grey1
                        )
                    ),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
                )
                .background(color = colors.grey1)
                .padding(
                    start = 32.dp,
                    end = 32.dp,
                    top = (13.5).dp,
                    bottom = (8.5).dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            tabs.forEach {
                Column(
                    modifier = Modifier.clickable {
                        onTabSelected(it)
                    },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = it.icon),
                        tint = if (currentTab == it) colors.white else colors.grey3,
                        contentDescription = "bottom nav ${it.title} icon",
                    )
                    Text(
                        text = it.title,
                        style = typography.caption2,
                        color = if (currentTab == it) colors.white else colors.grey3
                    )
                }
            }
        }
    }
}