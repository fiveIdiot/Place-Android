package com.place.home.components.filter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun NumberOfVisitorsSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    valueRange: ClosedFloatingPointRange<Float>,
) {
    val density = LocalDensity.current
    var parentViewWidth by remember { mutableIntStateOf(0) }
    var textWidth by remember { mutableIntStateOf(0) }

    PlaceTheme { colors, typography ->
        Column(
            modifier = Modifier.onSizeChanged { parentViewWidth = it.width }
        ) {
            val sliderPosition = (value.start + value.endInclusive) / 2
            val textOffsetPx = (sliderPosition / (valueRange.endInclusive - valueRange.start)) * parentViewWidth
            val textOffsetDp = with(density) { (textOffsetPx - textWidth / 2).toDp() }

            Text(
                text = "혼자 ~ 2명",
                style = typography.subHeadline2,
                color = colors.orange5,
                modifier = Modifier
                    .onSizeChanged { size -> textWidth = size.width }
                    .offset(x = textOffsetDp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            RangeSlider(
                value = value,
                valueRange = valueRange,
                onValueChange = onValueChange,
                colors = SliderDefaults.colors(
                    activeTrackColor = colors.orange5,
                    inactiveTrackColor = colors.grey10,
                    thumbColor = colors.white
                )
            )
        }
    }
}

@Preview
@Composable
fun NumberOfVisitorsSliderPre() {
    var value by remember {
        mutableStateOf(0f..6f)
    }

    NumberOfVisitorsSlider(
        value = value,
        onValueChange = {
            value = it
        },
        valueRange = 0f..6f
    )
}