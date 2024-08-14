package com.place.onboard.components.surveyresult

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun TypeResultSection(
    type: String,
    description: String
) {
    PlaceTheme { colors, typography ->
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "나의 선호 장소 유형은",
                style = typography.lable1,
                color = colors.grey7
            )
            Text(
                text = type,
                style = typography.headline1,
                color = colors.white
            )
            Text(
                text = description,
                style = typography.subHeadline3,
                color = colors.grey6,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun TypeResultSectionPre() {
    TypeResultSection(
        type = "세레니티",
        description = "조용라고 이색적인 장소를 \n좋아하며 움직이는걸 좋아하는"
    )
}