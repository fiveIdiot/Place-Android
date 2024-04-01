package com.place.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceFilledButton(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    paddingValues: PaddingValues = PaddingValues(5.dp),
    content: @Composable (RowScope.() -> Unit),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Row(
            modifier = modifier
                .clip(shape = shape)
                .clickable(onClick = onClick)
                .background(color = colors.orange5)
                .padding(paddingValues = paddingValues),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            content = content
        )
    }
}

@Composable
fun PlaceOutlinedButton(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(5.dp),
    shape: Shape = RectangleShape,
    content: @Composable (RowScope.() -> Unit),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Row(
            modifier = modifier
                .clip(shape = shape)
                .clickable(onClick = onClick)
                .border(width = 1.dp, color = colors.grey10, shape = shape)
                .padding(paddingValues = paddingValues),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            content = content
        )
    }
}