package com.place.android.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceBottomNav(
    tabs: List<BottomNavTabs>,
    currentTab: BottomNavTabs,
    onTabSelected: (tab: BottomNavTabs) -> Unit,
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
                            colors.grey9,
                            colors.grey9,
                            colors.grey10,
                            colors.grey10,
                            colors.grey10,
                            colors.grey10,
                            colors.grey10
                        )
                    ),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
                )
                .background(color = colors.grey10)
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
                    modifier = Modifier
                        .effectClickable {
                            onTabSelected(it)
                        },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = it.icon),
                        tint = if (currentTab == it) colors.white else colors.grey7,
                        contentDescription = "bottom nav ${it.title} icon",
                    )
                    Text(
                        text = it.title,
                        style = typography.caption2,
                        color = if (currentTab == it) colors.white else colors.grey7
                    )
                }
            }
        }
    }
}