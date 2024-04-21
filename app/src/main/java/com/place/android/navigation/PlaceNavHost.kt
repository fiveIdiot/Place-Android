package com.place.android.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.place.designsystem.components.BottomNavTabs

@Composable
fun PlaceNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String,
    onTabSelected: (route: String) -> Unit,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(
            route = BottomNavTabs.HOME.routes
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "HOME", color = Color.Black, fontSize = 32.sp)
            }
        }
        composable(
            route = BottomNavTabs.MYPLACE.routes
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "MYPLACE", color = Color.Black, fontSize = 32.sp)
            }
        }
        composable(
            route = BottomNavTabs.WRITE.routes
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "WRITE", color = Color.Black, fontSize = 32.sp)
            }
        }
        composable(
            route = BottomNavTabs.SHOP.routes
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "SHOP", color = Color.Black, fontSize = 32.sp)
            }
        }
        composable(
            route = BottomNavTabs.PROFILE.routes
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "PROFILE", color = Color.Black, fontSize = 32.sp)
            }
        }
    }
}