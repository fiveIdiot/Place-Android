package com.place.onboard.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.ChevronRightIconMedium
import com.place.designsystem.theme.PlaceTheme

@Composable
fun AgreementTermsComponent(
    text: String,
    isChecked: Boolean,
    onCheckBoxClick: () -> Unit,
    onLinkClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AgreementTermsCheckBox(
                isSelected = isChecked,
                onClick = onCheckBoxClick
            )
            Spacer(modifier = Modifier.width(8.dp))
            Row(modifier = Modifier.clickable(onClick = onLinkClick)) {
                Text(
                    text = text,
                    style = typography.body1,
                    color = colors.grey6
                )
                Spacer(modifier = Modifier.weight(1f))
                ChevronRightIconMedium(
                    modifier = Modifier.size(16.dp),
                    color = colors.grey7
                )
            }
        }
    }
}

@Preview
@Composable
fun AgreementTermsComponentPre() {
    AgreementTermsComponent(
        text = "(필수) 이용약관",
        isChecked = true,
        onCheckBoxClick = {},
        onLinkClick = {}
    )
}