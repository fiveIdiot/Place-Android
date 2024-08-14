package com.place.onboard.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.components.PlaceFilledButton
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.ArrowLeftIcon
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.components.surveyresult.TypeDescriptionSection
import com.place.onboard.components.surveyresult.TypeImageSection
import com.place.onboard.components.surveyresult.TypeResultSection
import com.place.onboard.components.surveyresult.TypeScoreSection
import com.place.onboard.model.surveyresult.TypeScore
import com.place.onboard.model.surveyresult.TypeScoreItem

@Preview
@Composable
fun SurveyResultScreen() {
    PlaceTheme { colors, typography ->
        Scaffold(
            containerColor = colors.black,
            topBar = {
                PlaceTopBar(
                    backgroundColor = colors.black,
                    leading = {
                        IconButton(
                            modifier = Modifier.size(24.dp),
                            onClick = {}
                        ) {
                            ArrowLeftIcon(modifier = Modifier.size(24.dp))
                        }
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                TypeResultSection(
                    type = "세레니티",
                    description = "조용라고 이색적인 장소를 \n좋아하며 움직이는걸 좋아하는"
                )
                TypeImageSection(imageUrl = "")
                TypeScoreSection(
                    typeScoreList = listOf(
                        TypeScore(TypeScoreItem("유형1", 3), TypeScoreItem("유형2", 2)),
                        TypeScore(TypeScoreItem("유형3", 1), TypeScoreItem("유형4", 4))
                    )
                )
                TypeDescriptionSection(
                    description = "조용하면서 이색적인 장소를 좋아하는 여러분,\n" +
                            "평소 움직이는걸 좋아해 열심히 돌아나니며 힘들게 \n" +
                            "찾아낸 나만의 휴식처 하지만 금방 또 다른 사람들에게 \n" +
                            "소문이나 나만의 조용한 휴식처가 더 이상 아니게된적 많을거에요\n" +
                            "\n" +
                            "그렇게 나만의 휴식처 찾기 N번째 “아 이번엔 또 어딜 돌아다녀야하지..” 이런 고민 이제는 플레이스가 대신 찾아드릴게요."
                )
                PlaceFilledButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    enabled = true,
                    content = {
                        Text(
                            text = "플레이스 시작하기",
                            style = typography.subHeadline3,
                            color = colors.black
                        )
                    },
                    onClick = {}
                )
            }
        }
    }
}