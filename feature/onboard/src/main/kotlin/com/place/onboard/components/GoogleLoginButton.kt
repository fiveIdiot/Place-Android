package com.place.onboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.R

@Composable
fun GoogleLoginButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    PlaceTheme { colors, typography ->
        Button(
            modifier = modifier.height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.white
            ),
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
            onClick = onClick,
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    modifier = Modifier.align(Alignment.CenterStart),
                    imageVector = ImageVector.vectorResource(R.drawable.ic_symbol_google),
                    contentDescription = "Google Symbol"
                )
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "구글로 시작하기",
                    style = typography.subHeadline3,
                    color = colors.black
                )
            }
        }
    }
}

@Preview
@Composable
fun GoogleLoginButtonPre() {
    GoogleLoginButton {}
}