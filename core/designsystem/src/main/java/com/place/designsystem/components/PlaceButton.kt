package com.place.designsystem.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceFilledButton(
    modifier: Modifier = Modifier,
    containerColor: Color? = null,
    enabled: Boolean,
    content: @Composable (RowScope.() -> Unit),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Button(
            modifier = modifier,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = containerColor ?: colors.orange5,
                disabledContainerColor = colors.grey8,
                contentColor = colors.black,
                disabledContentColor = colors.grey7
            ),
            enabled = enabled,
            content = content,
            onClick = onClick,
            contentPadding = PaddingValues(vertical = 14.5.dp, horizontal = 8.dp)
        )
    }
}

@Composable
fun PlaceOutlinedButton(
    modifier: Modifier = Modifier,
    enabled: Boolean,
    content: @Composable (RowScope.() -> Unit),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        OutlinedButton(
            modifier = modifier,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                contentColor = colors.white,
                disabledContentColor = colors.grey7,
            ),
            enabled = enabled,
            content = content,
            onClick = onClick,
            contentPadding = PaddingValues(vertical = 4.dp, horizontal = 8.dp)
        )
    }
}