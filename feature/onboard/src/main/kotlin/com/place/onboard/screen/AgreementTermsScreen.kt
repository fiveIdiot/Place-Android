package com.place.onboard.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.ArrowLeftIcon
import com.place.designsystem.theme.PlaceTheme
import com.place.onboard.components.AgreementTermsCheckBox
import com.place.onboard.components.AgreementTermsComponent

@Preview
@Composable
fun AgreementTermsScreen() {
    var agreeAllTerms by remember { mutableStateOf(false) }
    var terms1States by remember { mutableStateOf(false) }
    var terms2States by remember { mutableStateOf(false) }
    var terms3States by remember { mutableStateOf(false) }
    var terms4States by remember { mutableStateOf(false) }

    LaunchedEffect(terms1States, terms2States, terms3States, terms4States) {
        agreeAllTerms = terms1States && terms2States && terms3States && terms4States
    }

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
                    text = "플레이스 이용약관에\n동의해주세요",
                    style = typography.headline2,
                    color = colors.white
                )
                Spacer(modifier = Modifier.height(32.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.grey10)
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AgreementTermsCheckBox(agreeAllTerms) {
                        terms1States = !agreeAllTerms
                        terms2States = !agreeAllTerms
                        terms3States = !agreeAllTerms
                        terms4States = !agreeAllTerms
                        agreeAllTerms = !agreeAllTerms
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "모두 동의",
                        style = typography.subHeadline3,
                        color = colors.white
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
                Spacer(modifier = Modifier.height(24.dp))
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    AgreementTermsComponent(
                        text = "(필수) 이용약관",
                        isChecked = terms1States,
                        onCheckBoxClick = { terms1States = !terms1States },
                        onLinkClick = {}
                    )
                    AgreementTermsComponent(
                        text = "(필수) 개인정보 제3자 제공 동의",
                        isChecked = terms2States,
                        onCheckBoxClick = { terms2States = !terms2States },
                        onLinkClick = {}
                    )
                    AgreementTermsComponent(
                        text = "(필수) 위치정보 수집",
                        isChecked = terms3States,
                        onCheckBoxClick = { terms3States = !terms3States },
                        onLinkClick = {}
                    )
                    AgreementTermsComponent(
                        text = "(선택) SMS 및 이메일 메세지 전송 동의",
                        isChecked = terms4States,
                        onCheckBoxClick = { terms4States = !terms4States },
                        onLinkClick = {}
                    )
                }
            }
        }
    }
}