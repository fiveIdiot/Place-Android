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

@Composable
fun TypeScoreItem(
    firstType: Pair<String, Int>,
    secondType: Pair<String, Int>,
) {
    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = firstType.first,
                style = typography.subHeadline3,
                color = if (firstType.second > secondType.second) colors.white else colors.grey7
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
                                if (firstType.second > secondType.second) {
                                    if (i <= firstType.second) colors.orange4 else colors.grey10
                                } else {
                                    if (i <= (5 - secondType.second)) colors.grey10 else colors.orange4
                                }
                            )
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = secondType.first,
                style = typography.body1,
                color = if (firstType.second < secondType.second) colors.white else colors.grey7
            )
        }
    }
}

@Preview
@Composable
fun TypeScoreItemPreview() {
    TypeScoreItem(
        firstType = Pair("유형", 2),
        secondType = Pair("유형", 3)
    )
}