package com.place.onboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.R

@Composable
fun AgreementTermsCheckBox(
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .background(if (isSelected) colors.orange9 else Color(0xFF4D4D4F))
                .clickable(onClick = onClick)
        ) {
            if (isSelected) {
                Image(
                    modifier = Modifier.align(Alignment.Center),
                    imageVector = ImageVector.vectorResource(R.drawable.ic_orange_check),
                    contentDescription = "check box icon"
                )
            }
        }
    }
}

@Preview
@Composable
fun AgreementTermsCheckBoxPre() {
    var state by remember {
        mutableStateOf(false)
    }

    AgreementTermsCheckBox(isSelected = state) { state = !state }
}