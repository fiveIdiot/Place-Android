package com.place.onboard.model.surveyresult

import javax.annotation.concurrent.Immutable

@Immutable
data class TypeScore(
    val firstType: TypeScoreItem,
    val secondType: TypeScoreItem,
)

@Immutable
data class TypeScoreItem(
    val type: String,
    val score: Int,
)