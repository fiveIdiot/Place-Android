package com.place.android

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.place.android.navigation.BottomNavTabs
import com.place.around.navigation.AROUND_ROUTE
import com.place.around.navigation.navigateToAround
import com.place.home.navigation.HOME_ROUTE
import com.place.home.navigation.navigateToHome
import com.place.market.navigation.MARKET_ROUTE
import com.place.market.navigation.navigateToMarket
import com.place.profile.navigation.PROFILE_ROUTE
import com.place.profile.navigation.navigateToProfile
import com.place.write.navigation.WRITE_ROUTE
import com.place.write.navigation.navigateToWrite

enum class BackPressedState {
    Idle,
    Single,
    Double
}

@Composable
fun rememberPlaceAppState(
    navController: NavHostController = rememberNavController(),
): PlaceAppState {
    return remember(navController) {
        PlaceAppState(navController = navController)
    }
}

@Stable
class PlaceAppState(
    val navController: NavHostController,
) {
    private val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: BottomNavTabs?
        @Composable get() = when (currentDestination?.route) {
            HOME_ROUTE -> BottomNavTabs.HOME
            WRITE_ROUTE -> BottomNavTabs.WRITE
            AROUND_ROUTE -> BottomNavTabs.AROUND
            MARKET_ROUTE -> BottomNavTabs.MARKET
            PROFILE_ROUTE -> BottomNavTabs.PROFILE
            else -> null
        }

    val shouldShowBottomBar: Boolean = true
    val topLevelDestinations: List<BottomNavTabs> = BottomNavTabs.entries

    fun navigateToTopLevelDestination(topLevelDestination: BottomNavTabs) {
        val topLevelNavOptions = navOptions {
            popUpTo(0) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            BottomNavTabs.HOME -> navController.navigateToHome(topLevelNavOptions)
            BottomNavTabs.AROUND -> navController.navigateToAround(topLevelNavOptions)
            BottomNavTabs.WRITE -> navController.navigateToWrite(topLevelNavOptions)
            BottomNavTabs.MARKET -> navController.navigateToMarket(topLevelNavOptions)
            BottomNavTabs.PROFILE -> navController.navigateToProfile(topLevelNavOptions)
        }
    }
}
