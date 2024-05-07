package com.place.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val appState = rememberPlaceAppState()
            var backPressedState by remember {
                mutableStateOf(BackPressedState.Idle)
            }
            val snackbarHostState = remember { SnackbarHostState() }

            LaunchedEffect(key1 = backPressedState) {
                if (backPressedState == BackPressedState.Single) {
                    snackbarHostState.showSnackbar("한번 더 클릭하면 앱이 종료됩니다.")
                }
            }

            LaunchedEffect(key1 = backPressedState) {
                if (backPressedState == BackPressedState.Double) finish()
                delay(1500)
                backPressedState = BackPressedState.Idle
            }

            BackHandler {
                backPressedState =
                    if (backPressedState == BackPressedState.Idle) {
                        BackPressedState.Single
                    } else {
                        BackPressedState.Double
                    }
            }

            PlaceApp(
                appState,
                snackbarHostState
            )
        }
    }
}