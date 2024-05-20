package com.place.home.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun GradientChip(
    content: @Composable BoxScope.() -> Unit,
    isSelected: Boolean,
    effectEnabled: Boolean = false,
    gradient: List<Color>,
    paddingValues: PaddingValues = PaddingValues(vertical = 6.dp, horizontal = 12.dp),
    onClick: () -> Unit,
) {
    val progress = remember { Animatable(-0.7f) }
    val animationIterations = 1 // 애니메이션 반복 횟수 지정

    LaunchedEffect(isSelected) {
        if (isSelected) {
            repeat(animationIterations) {
                progress.animateTo(
                    targetValue = 0.7f,
                    animationSpec = tween(
                        durationMillis = 1500,
                        easing = LinearEasing
                    )
                )
                progress.animateTo(
                    targetValue = -0.7f,
                    animationSpec = tween(
                        durationMillis = 1500,
                        easing = LinearEasing
                    )
                )
            }
            progress.animateTo(
                targetValue = 0f,
                animationSpec = tween(
                    durationMillis = 750,
                    easing = LinearEasing
                )
            )
        } else {
            progress.stop()
        }
    }

    PlaceTheme { colors, _ ->
        Box(
            modifier = Modifier
                .effectClickable(
                    effectEnable = effectEnabled, onClick = onClick
                )
                .clip(RoundedCornerShape(43.dp))
                .drawWithCache {
                    val width = size.width
                    val height = size.height

                    val offset = width * progress.value

                    val brush = Brush.linearGradient(
                        colors = if (isSelected) gradient else listOf(colors.grey10, colors.grey10),
                        start = Offset(offset, 0f),
                        end = Offset(offset + width, height)
                    )

                    onDrawBehind {
                        drawRect(
                            brush = brush,
                            blendMode = BlendMode.SrcIn
                        )
                    }
                }
                .padding(paddingValues = paddingValues),
            content = content
        )
    }
}