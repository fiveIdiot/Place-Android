package com.place.onboard.components.surveyresult

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.place.onboard.R

@Composable
fun TypeImageSection(imageUrl: String) {
    AsyncImage(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
            .aspectRatio(1f),
        placeholder = painterResource(id = R.drawable.survey_default_image),
        error = painterResource(id = R.drawable.survey_default_image),
        model = imageUrl,
        contentDescription = "유형별 이미지"
    )
}

@Preview
@Composable
fun TypeImageSectionPre() {
    TypeImageSection(imageUrl = "")
}