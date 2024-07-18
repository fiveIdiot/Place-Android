package com.place.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.TwinkleFillIcon
import com.place.designsystem.icon.TwinkleIcon
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceTwinkle(
    currentTwinkleNumber: Int,
    isTwinkleClicked: Boolean,
    onTwinkleClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                modifier = Modifier.size(24.dp),
                onClick = onTwinkleClick
            ) {
                if (isTwinkleClicked) {
                    TwinkleFillIcon(size = 24.dp)
                } else {
                    TwinkleIcon(size = 24.dp)
                }
            }
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = currentTwinkleNumber.toString(),
                style = typography.body2SemiBold,
                color = colors.white
            )
        }
    }
}