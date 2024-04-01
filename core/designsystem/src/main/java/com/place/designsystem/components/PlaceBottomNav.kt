package com.place.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.HomeIconLarge
import com.place.designsystem.icon.PenIconLarge
import com.place.designsystem.icon.PeopleIconLarge
import com.place.designsystem.icon.PinIconLarge
import com.place.designsystem.icon.ShoppingBagIconLarge
import com.place.designsystem.theme.PlaceTheme

enum class BottomNavRoutes(val text: String) {
    HOME("홈"),
    MYPLACE("내 주변"),
    WRITE("작성"),
    SHOP("상점"),
    PROFILE("프로필")
}

@Composable
fun PlaceBottomNav() {
    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
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
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                HomeIconLarge()
                Text(
                    text = BottomNavRoutes.HOME.text,
                    style = typography.caption2,
                    color = colors.white
                )
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                PinIconLarge()
                Text(
                    text = BottomNavRoutes.MYPLACE.text,
                    style = typography.caption2,
                    color = colors.white
                )
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                PenIconLarge()
                Text(
                    text = BottomNavRoutes.WRITE.text,
                    style = typography.caption2,
                    color = colors.white
                )
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                ShoppingBagIconLarge()
                Text(
                    text = BottomNavRoutes.SHOP.text,
                    style = typography.caption2,
                    color = colors.white
                )
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                PeopleIconLarge()
                Text(
                    text = BottomNavRoutes.PROFILE.text,
                    style = typography.caption2,
                    color = colors.white
                )
            }
        }
    }
}

@Preview
@Composable
fun PlaceBottomNavPre() {
    PlaceBottomNav()
}