package com.place.onboard.components.surveyresult

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@Composable
fun TypeDescriptionBox(description: String) {
    PlaceTheme { colors, typography ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(colors.grey10)
                .padding(vertical = 24.dp, horizontal = 16.dp)
        ) {
            Text(
                text = "유형 설명",
                style = typography.subHeadline3,
                color = colors.white
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = description,
                style = typography.body1,
                color = colors.grey5
            )
        }
    }
}

@Preview
@Composable
fun TypeDescriptionBoxPreview() {
    TypeDescriptionBox(
        description = "조용하면서 이색적인 장소를 좋아하는 여러분,\n" +
                "평소 움직이는걸 좋아해 열심히 돌아나니며 힘들게 \n" +
                "찾아낸 나만의 휴식처 하지만 금방 또 다른 사람들에게 \n" +
                "소문이나 나만의 조용한 휴식처가 더 이상 아니게된적 많을거에요\n" +
                "\n" +
                "그렇게 나만의 휴식처 찾기 N번째 “아 이번엔 또 어딜 돌아다녀야하지..” 이런 고민 이제는 플레이스가 대신 찾아드릴게요."
    )
}