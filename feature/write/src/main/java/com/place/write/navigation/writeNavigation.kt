package com.place.write.navigation

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

const val WRITE_ROUTE = "write_route"

fun NavController.navigateToWrite(navOptions: NavOptions) = navigate(WRITE_ROUTE, navOptions)

fun NavGraphBuilder.writeFeature() {
    composable(route = WRITE_ROUTE) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "WRITE", color = Color.Black, fontSize = 32.sp)
        }
    }
}