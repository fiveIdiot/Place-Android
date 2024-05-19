package com.place.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieClipSpec
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieAnimatable
import com.airbnb.lottie.compose.rememberLottieComposition
import com.place.designsystem.theme.PlaceTheme
import com.place.home.R

@Composable
fun CurationChips(
    onCustomToggleSelected: (isSelected: Boolean) -> Unit,
    onHotPlaceToggleSelected: (isSelected: Boolean) -> Unit,
) {
    // compass
    val compassLottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(R.raw.compass_animation)
    )
    val compassLottieAnimatable = rememberLottieAnimatable()
    var isCustomToggleSelected by remember {
        mutableStateOf(true)
    }

    // fire
    val fireLottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(R.raw.fire_animation)
    )
    val fireLottieAnimatable = rememberLottieAnimatable()
    var isHotPlaceToggleSelected by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(isCustomToggleSelected) {
        compassLottieAnimatable.apply {
            if (isCustomToggleSelected) {
                animate(
                    composition = compassLottieComposition,
                    clipSpec = LottieClipSpec.Frame(0, 1200),
                    initialProgress = 0f
                )
            } else {
                snapTo(compassLottieComposition, 0f)
            }
        }
    }

    LaunchedEffect(isHotPlaceToggleSelected) {
        fireLottieAnimatable.apply {
            if (isHotPlaceToggleSelected) {
                animate(
                    composition = fireLottieComposition,
                    clipSpec = LottieClipSpec.Frame(0, 1200),
                    initialProgress = 0f
                )
            } else {
                snapTo(compassLottieComposition, 0f)
            }
        }
    }

    PlaceTheme { colors, typography ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colors.grey11)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GradientChip(
                isSelected = isCustomToggleSelected,
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        LottieAnimation(
                            modifier = Modifier.size(20.dp),
                            composition = compassLottieComposition,
                            progress = { compassLottieAnimatable.progress },
                            contentScale = ContentScale.FillHeight
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "맞춤",
                            style = typography.subHeadline3,
                            color = if (isCustomToggleSelected) colors.white else colors.grey5
                        )
                    }
                },
                paddingValues = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                gradient = listOf(
                    Color(0xFFC51FFF),
                    Color(0xFF1DBBFF)
                ),
                onClick = {
                    if (!isCustomToggleSelected) {
                        onCustomToggleSelected(true)
                        onHotPlaceToggleSelected(false)
                        isCustomToggleSelected = true
                        isHotPlaceToggleSelected = false
                    }
                }
            )
            GradientChip(
                isSelected = isHotPlaceToggleSelected,
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        LottieAnimation(
                            modifier = Modifier.size(20.dp),
                            composition = fireLottieComposition,
                            progress = { fireLottieAnimatable.progress },
                            contentScale = ContentScale.FillHeight
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "핫플",
                            style = typography.subHeadline3,
                            color = if (isHotPlaceToggleSelected) colors.white else colors.grey5
                        )
                    }
                },
                paddingValues = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                gradient = listOf(
                    Color(0xFFFF3D00),
                    Color(0xFFEB00FF)
                ),
                onClick = {
                    if (!isHotPlaceToggleSelected) {
                        onCustomToggleSelected(false)
                        onHotPlaceToggleSelected(true)
                        isCustomToggleSelected = false
                        isHotPlaceToggleSelected = true
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun CurationChipsPre() {
    CurationChips(
        onCustomToggleSelected = {},
        onHotPlaceToggleSelected = {}
    )
}