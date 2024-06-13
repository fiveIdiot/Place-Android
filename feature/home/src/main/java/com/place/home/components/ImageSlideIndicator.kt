package com.place.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun ImageSlideIndicator(
    modifier: Modifier,
    imageListSize: Int,
    currentIdx: Int,
) {
    PlaceTheme { colors, _ ->
        LazyRow(
            modifier = modifier
                .wrapContentWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(imageListSize) { index ->
                Box(
                    modifier = Modifier
                        .size(4.dp)
                        .clip(CircleShape)
                        .background(if (index == currentIdx) colors.blue5 else colors.grey7)
                )
            }
        }
    }
}