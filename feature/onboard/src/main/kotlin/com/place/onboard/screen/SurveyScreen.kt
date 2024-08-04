package com.place.onboard.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.ArrowLeftIcon
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.R
import com.place.onboard.components.SurveyAnswerItem

@Preview(showSystemUi = false)
@Composable
fun SurveyScreen() {
    PlaceTheme { colors, typography ->
        Scaffold(
            topBar = {
                PlaceTopBar(
                    leading = { ArrowLeftIcon(modifier = Modifier.clickable { }) }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(colors.grey11),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "일과 후 저녁,",
                    style = typography.subHeadline1,
                    color = colors.white
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "친구에게 내일 놀자는 카톡을 받았다.\n어디서 만나자 할까?",
                    style = typography.subHeadline3,
                    color = colors.grey6,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))
                AsyncImage(
                    modifier = Modifier.size(231.dp),
                    model = "",
                    placeholder = painterResource(id = R.drawable.survey_default_image),
                    error = painterResource(id = R.drawable.survey_default_image),
                    contentDescription = "Survey Image",
                )
                Spacer(modifier = Modifier.weight(1f))
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    repeat(4) {
                        SurveyAnswerItem(
                            text = "당연히 방탈출은 머리를 써야지! \n" +
                                    "문제 풀이 위주의 테마!",
                            onClick = { }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}