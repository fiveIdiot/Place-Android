package com.place.onboard.components.surveyresult

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.onboard.model.surveyresult.TypeScore
import com.place.onboard.model.surveyresult.TypeScoreItem

@Composable
fun TypeScoreSection(typeScoreList: List<TypeScore>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        typeScoreList.forEach {
            TypeScoreItem(firstType = it.firstType, secondType = it.secondType)
        }
    }
}

@Preview
@Composable
fun TypeScoreSectionPre() {
    TypeScoreSection(
        typeScoreList = listOf(
            TypeScore(
                firstType = TypeScoreItem(type = "유형", score = 3),
                secondType = TypeScoreItem(type = "유형", score = 2)
            ),
            TypeScore(
                firstType = TypeScoreItem(type = "유형", score = 2),
                secondType = TypeScoreItem(type = "유형", score = 3)
            )
        )
    )
}