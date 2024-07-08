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
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.ArrowLeftIcon
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.components.GoogleLoginButton
import com.place.onboard.components.KakaoLoginButton

@Composable
fun LoginScreen() {
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
                    text = "간편 로그인으로\n간단하게",
                    style = typography.headline2,
                    color = colors.white
                )
                Spacer(modifier = Modifier.height(32.dp))
                GoogleLoginButton(modifier = Modifier.fillMaxWidth()) {}
                Spacer(modifier = Modifier.height(12.dp))
                KakaoLoginButton(modifier = Modifier.fillMaxWidth()) {}
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPre() {
    LoginScreen()
}