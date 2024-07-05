package com.place.designsystem.components

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceTopBar(
    backgroundColor: Color? = null,
    adjustStatusBarColor: Boolean = true,
    title: String = "",
    leading: @Composable (RowScope.() -> Unit)? = null,
    trailing: @Composable (RowScope.() -> Unit)? = null,
) {
    PlaceTheme { colors, typography ->
        if (adjustStatusBarColor) {
            val view = LocalView.current

            if (!view.isInEditMode) {
                SideEffect {
                    val window = (view.context as Activity).window
                    window.statusBarColor = (backgroundColor ?: colors.grey11).toArgb()
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor ?: colors.grey11)
                .padding(vertical = 11.dp, horizontal = 16.dp)
        ) {
            if (leading != null) {
                Row(modifier = Modifier.align(Alignment.CenterStart), content = leading)
            }
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = title,
                style = typography.subHeadline3,
                color = colors.white
            )
            if (trailing != null) {
                Row(modifier = Modifier.align(Alignment.CenterEnd), content = trailing)
            }
        }
    }
}
