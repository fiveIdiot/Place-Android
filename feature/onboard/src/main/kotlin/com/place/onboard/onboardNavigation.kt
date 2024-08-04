package com.place.onboard

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.place.onboard.screen.SurveyScreen

const val ONBOARD_ROUTE = "onboard_route"

fun NavController.navigateToOnboard(navOptions: NavOptions) = navigate(ONBOARD_ROUTE, navOptions)

fun NavGraphBuilder.onboardFeature() {
    composable(route = ONBOARD_ROUTE) {
        SurveyScreen()
    }
}