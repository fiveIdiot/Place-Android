package com.place.onboard.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.components.PlaceFilledButton
import com.place.designsystem.components.PlaceTextField
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.ArrowLeftIcon
import com.place.designsystem.theme.PlaceTheme

@Composable
fun NickNameInputScreen() {
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
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {
                Text(
                    text = "검사 전 사용하실 닉네임을\n입력해주세요",
                    style = typography.headline2,
                    color = colors.white
                )
                Spacer(modifier = Modifier.height(32.dp))
                PlaceTextField(
                    value = "",
                    placeHolder = {
                        Text(
                            text = "닉네임을 입력해주세요.",
                            style = typography.body2,
                            color = colors.grey7
                        )
                    },
                    onValueChange = {}
                )
                Spacer(modifier = Modifier.weight(1f))
                PlaceFilledButton(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    content = {
                        Text(
                            text = "다음",
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

@Preview
@Composable
fun NickNameInputScreenPre() {
    NickNameInputScreen()
}