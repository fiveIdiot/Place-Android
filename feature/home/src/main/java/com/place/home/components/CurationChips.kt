package com.place.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.CompassIconMedium
import com.place.designsystem.icon.FireIconMedium
import com.place.designsystem.theme.PlaceTheme

@Composable
fun CurationChips(
    onCustomToggleSelected: (isSelected: Boolean) -> Unit,
    onHotPlaceToggleSelected: (isSelected: Boolean) -> Unit,
) {
    var isCustomToggleSelected by remember {
        mutableStateOf(true)
    }
    var isHotPlaceToggleSelected by remember {
        mutableStateOf(false)
    }

    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GradientChip(
                isSelected = isCustomToggleSelected,
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        CompassIconMedium(color = if (isCustomToggleSelected) colors.white else colors.grey5)
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "맞춤",
                            style = typography.subHeadline3,
                            color = if (isCustomToggleSelected) colors.white else colors.grey5
                        )
                    }
                },
                paddingValues = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                gradient = Brush.linearGradient(
                    listOf(
                        Color(0xFFC51FFF),
                        Color(0xFF1DBBFF)
                    )
                ),
                onClick = {
                    if (!isCustomToggleSelected) {
                        onCustomToggleSelected(true)
                        onHotPlaceToggleSelected(false)
                        isCustomToggleSelected = true
                        isHotPlaceToggleSelected = false
                    }
                }
            )
            GradientChip(
                isSelected = isHotPlaceToggleSelected,
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        FireIconMedium(color = if (isHotPlaceToggleSelected) colors.white else colors.grey5)
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "핫플",
                            style = typography.subHeadline3,
                            color = if (isHotPlaceToggleSelected) colors.white else colors.grey5
                        )
                    }
                },
                paddingValues = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                gradient = Brush.linearGradient(
                    listOf(
                        Color(0xFFFF3D00),
                        Color(0xFFEB00FF)
                    )
                ),
                onClick = {
                    if (!isHotPlaceToggleSelected) {
                        onCustomToggleSelected(false)
                        onHotPlaceToggleSelected(true)
                        isCustomToggleSelected = false
                        isHotPlaceToggleSelected = true
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun CurationChipsPre() {
    CurationChips(
        onCustomToggleSelected = {},
        onHotPlaceToggleSelected = {}
    )
}