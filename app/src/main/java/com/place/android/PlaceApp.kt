package com.place.android

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.place.android.navigation.PlaceNavHost
import com.place.designsystem.components.BottomNavTabs
import com.place.designsystem.components.PlaceBottomNav

@Composable
fun PlaceApp(
    navController: NavHostController,
    startDestination: String,
    currentTab: BottomNavTabs,
    shouldShowBottomBar: Boolean,
    onTabSelected: (route: String) -> Unit,
) {
    Scaffold(
        modifier = Modifier,
        containerColor = Color.Transparent,
        contentColor = Color.Transparent,
        bottomBar = {
            AnimatedVisibility(visible = shouldShowBottomBar) {
                PlaceBottomNav(
                    tabs = BottomNavTabs.entries.toList(),
                    currentTab = currentTab,
                    onTabSelected = onTabSelected
                )
            }
        },
    ) { padding ->
        PlaceNavHost(
            modifier = Modifier.padding(padding),
            navController = navController,
            startDestination = startDestination,
            onTabSelected = onTabSelected
        )
    }
}