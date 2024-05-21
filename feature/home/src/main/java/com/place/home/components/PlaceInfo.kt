package com.place.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.icon.ChevronRightIconMedium
import com.place.designsystem.icon.PinIconLarge
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceInfo(
    placeName: String,
    hashTag: String,
    onContainerClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(colors.grey10)
                .effectClickable(effectEnable = false, onClick = onContainerClick)
                .padding(12.dp)
        ) {
            Row(
                modifier = Modifier.align(Alignment.CenterStart),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PinIconLarge(color = colors.orange5)
                Spacer(modifier = Modifier.width(6.dp))
                Column {
                    Text(
                        text = placeName,
                        style = typography.subHeadline3,
                        color = colors.white
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = hashTag,
                        style = typography.lable2,
                        color = colors.grey6
                    )
                }
            }
            ChevronRightIconMedium(
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }
    }
}