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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.place.android.PlaceAppState
import com.place.around.navigation.aroundFeature
import com.place.home.navigation.HOME_ROUTE
import com.place.home.navigation.homeFeature
import com.place.market.navigation.marketFeature
import com.place.profile.navigation.profileFeature
import com.place.write.navigation.writeFeature

@Composable
fun PlaceNavHost(
    modifier: Modifier = Modifier,
    appState: PlaceAppState,
    startDestination: String = HOME_ROUTE,
) {
    NavHost(
        navController = appState.navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeFeature()
        aroundFeature()
        writeFeature()
        marketFeature()
        profileFeature()
    }
}