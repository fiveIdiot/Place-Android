package com.place.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.place.designsystem.components.BottomNavTabs

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            PlaceApp(
                navController = navController,
                startDestination = "HOME",
                currentTab = BottomNavTabs.find(
                    navController.currentBackStackEntryAsState().value?.destination?.route
                        ?: BottomNavTabs.HOME.routes
                ),
                shouldShowBottomBar = true,
                onTabSelected = { navController.navigate(it) }
            )
        }
    }
}