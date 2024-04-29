package com.place.android

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.place.android.navigation.PlaceNavHost
import com.place.designsystem.components.BottomNavTabs
import com.place.designsystem.components.PlaceBottomNav
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceApp(
    navController: NavHostController,
    startDestination: String,
    backPressedState: BackPressedState,
    currentTab: BottomNavTabs,
    shouldShowBottomBar: Boolean,
    onTabSelected: (route: String) -> Unit,
) {
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(key1 = backPressedState) {
        if (backPressedState == BackPressedState.Single) {
            snackbarHostState.showSnackbar("한번 더 클릭하면 앱이 종료됩니다.")
        }
    }

    PlaceTheme { colors, typography ->
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
            snackbarHost = {
                SnackbarHost(
                    hostState = snackbarHostState,
                    snackbar = {
                        Row(
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.grey7)
                                .padding(vertical = 12.dp, horizontal = 16.dp)
                        ) {
                            Text(
                                text = "한번 더 누르면 앱이 종료됩니다.",
                                style = typography.body2SemiBold,
                                color = colors.grey1
                            )
                        }
                    }
                )
            }
        ) { padding ->
            PlaceNavHost(
                modifier = Modifier.padding(padding),
                navController = navController,
                startDestination = startDestination,
                onTabSelected = onTabSelected
            )
        }
    }
}