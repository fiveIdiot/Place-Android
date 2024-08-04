package com.place.onboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.place.designsystem.modifier.clickable
import com.place.designsystem.theme.PlaceTheme

@Composable
fun SurveyAnswerItem(
    text: String,
    onClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .clickable(onClick = onClick)
                .clip(RoundedCornerShape(10.dp))
                .background(colors.grey10)
                .padding(vertical = 12.dp)
        ) {
            Text(
                text = text,
                color = colors.white,
                style = typography.subHeadline3,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}