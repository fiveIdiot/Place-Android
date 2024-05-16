package com.place.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceBasicChip(
    content: @Composable BoxScope.() -> Unit,
    isSelected: Boolean,
    effectEnabled: Boolean = false,
    selectedBackGroundColor: Color? = null,
    unSelectedBackGroundColor: Color? = null,
    selectedBorderColor: Color? = null,
    unSelectedBorderColor: Color? = null,
    paddingValues: PaddingValues = PaddingValues(vertical = 6.dp, horizontal = 12.dp),
    onClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Box(
            modifier = Modifier
                .effectClickable(
                    effectEnable = effectEnabled, onClick = onClick
                )
                .clip(RoundedCornerShape(43.dp))
                .background(
                    color = if (isSelected) {
                        selectedBackGroundColor ?: colors.orange9
                    } else {
                        unSelectedBackGroundColor ?: colors.grey9
                    }
                )
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(43.dp),
                    color = if (isSelected) {
                        selectedBorderColor ?: colors.orange7
                    } else {
                        unSelectedBorderColor ?: colors.grey9
                    }
                )
                .padding(paddingValues = paddingValues),
            content = content
        )
    }
}

@Preview
@Composable
fun PlaceBasicChipPre() {
    var state by remember {
        mutableStateOf(false)
    }

    PlaceTheme { colors, typography ->
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PlaceBasicChip(
                content = {
                    Text(
                        text = "Chip",
                        style = typography.body2,
                        color = if (state) colors.orange5 else colors.grey6
                    )
                },
                isSelected = state,
                onClick = { state = !state }
            )
        }
    }
}