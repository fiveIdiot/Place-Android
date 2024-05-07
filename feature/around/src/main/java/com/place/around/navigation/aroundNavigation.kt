package com.place.around.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val AROUND_ROUTE = "around_route"

fun NavController.navigateToAround(navOptions: NavOptions) = navigate(AROUND_ROUTE, navOptions)

fun NavGraphBuilder.aroundFeature() {
    composable(route = AROUND_ROUTE) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "AROUND", color = Color.Black, fontSize = 32.sp)
        }
    }
}