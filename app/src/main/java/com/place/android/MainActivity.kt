package com.place.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.place.designsystem.components.BottomNavTabs
import kotlinx.coroutines.delay

enum class BackPressedState {
    Idle,
    Single,
    Double
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            var backPressedState by remember {
                mutableStateOf(BackPressedState.Idle)
            }

            LaunchedEffect(key1 = backPressedState) {
                if (backPressedState == BackPressedState.Double) finish()
                delay(1500)
                backPressedState = BackPressedState.Idle
            }

            BackHandler {
                backPressedState = if (backPressedState == BackPressedState.Idle) {
                    BackPressedState.Single
                } else {
                    BackPressedState.Double
                }
            }

            PlaceApp(
                navController = navController,
                startDestination = BottomNavTabs.HOME.routes,
                backPressedState = backPressedState,
                currentTab = BottomNavTabs.find(
                    navController.currentBackStackEntryAsState().value?.destination?.route
                        ?: BottomNavTabs.HOME.routes
                ),
                shouldShowBottomBar = true,
                onTabSelected = {
                    navController.navigate(it) {
                        popUpTo(0) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}