package com.place.onboard.components.surveyresult

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.model.surveyresult.TypeScoreItem

@Composable
fun TypeScoreItem(
    firstType: TypeScoreItem,
    secondType: TypeScoreItem,
) {
    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = firstType.type,
                style = typography.subHeadline3,
                color = if (firstType.score > secondType.score) colors.white else colors.grey7
            )
            Spacer(modifier = Modifier.width(8.dp))
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                (1..5).forEachIndexed { index, i ->
                    Box(
                        modifier = Modifier
                            .height(16.dp)
                            .weight(1f)
                            .clip(
                                when (index) {
                                    0 -> RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)
                                    4 -> RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                                    else -> RoundedCornerShape(0.dp)
                                }
                            )
                            .background(
                                if (firstType.score > secondType.score) {
                                    if (i <= firstType.score) colors.orange4 else colors.grey10
                                } else {
                                    if (i <= (5 - secondType.score)) colors.grey10 else colors.orange4
                                }
                            )
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = secondType.type,
                style = typography.body1,
                color = if (firstType.score < secondType.score) colors.white else colors.grey7
            )
        }
    }
}

@Preview
@Composable
fun TypeScoreItemPreview() {
    TypeScoreItem(
        firstType = TypeScoreItem("유형", 2),
        secondType = TypeScoreItem("유형", 3)
    )
}