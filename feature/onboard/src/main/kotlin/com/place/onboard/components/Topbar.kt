package com.place.onboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(
    backgroundColor: Color,
    navigationIcon: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .background(backgroundColor)
            .padding(
                vertical = 12.dp,
                horizontal = 16.dp
            )
    ) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
            navigationIcon()
        }
    }
}