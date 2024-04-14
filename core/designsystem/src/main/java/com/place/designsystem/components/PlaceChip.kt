package com.place.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.effects.effectClickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceBasicChip(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    PlaceTheme { colors, typography ->
        Box(
            modifier = Modifier
                .effectClickable(
                    effectEnable = false,
                    onClick = onClick
                )
                .clip(RoundedCornerShape(43.dp))
                .background(color = if (isSelected) colors.orange9 else colors.grey9)
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(43.dp),
                    color = if (isSelected) colors.orange7 else colors.grey9
                )
                .padding(vertical = 6.dp, horizontal = 12.dp)
        ) {
            Text(
                text = text,
                style = typography.body2,
                color = if (isSelected) colors.orange5 else colors.grey6
            )
        }
    }
}

@Preview
@Composable
fun PlaceBasicChipPre() {
    var state by remember {
        mutableStateOf(false)
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PlaceBasicChip(
            text = "으하하하 이것은 지강 최강의 Chip.",
            isSelected = state,
            onClick = { state = !state }
        )
    }
}