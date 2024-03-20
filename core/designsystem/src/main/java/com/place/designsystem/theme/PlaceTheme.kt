package com.place.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.place.designsystem.theme.color.DarkColor
import com.place.designsystem.theme.color.LightColor
import com.place.designsystem.theme.color.PlaceColor
import com.place.designsystem.theme.typography.PlaceTypography

@Composable
fun PlaceTheme(
    colors: PlaceColor = if (isSystemInDarkTheme()) DarkColor else LightColor,
    typography: PlaceTypography = PlaceTypography,
    content: @Composable (colors: PlaceColor, typography: PlaceTypography) -> Unit,
) {
    content(colors, typography)
}