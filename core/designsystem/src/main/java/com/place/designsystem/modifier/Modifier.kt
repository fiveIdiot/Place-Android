package com.place.designsystem.modifier

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

fun Modifier.clickable(
    onClick: () -> Unit,
): Modifier = composed {
    this.then(
        Modifier.clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = rememberRipple(bounded = true),
            onClickLabel = "Custom Click",
            role = null,
            onClick = onClick
        )
    )
}