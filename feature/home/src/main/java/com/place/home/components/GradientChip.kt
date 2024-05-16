package com.place.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun GradientChip(
    content: @Composable BoxScope.() -> Unit,
    isSelected: Boolean,
    effectEnabled: Boolean = false,
    gradient: Brush,
    paddingValues: PaddingValues = PaddingValues(vertical = 6.dp, horizontal = 12.dp),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Box(
            modifier = Modifier
                .effectClickable(
                    effectEnable = effectEnabled, onClick = onClick
                )
                .clip(RoundedCornerShape(43.dp))
                .background(
                    brush = if (isSelected) gradient else Brush.linearGradient(
                        listOf(colors.grey10, colors.grey10)
                    )
                )
                .padding(paddingValues = paddingValues),
            content = content
        )
    }
}