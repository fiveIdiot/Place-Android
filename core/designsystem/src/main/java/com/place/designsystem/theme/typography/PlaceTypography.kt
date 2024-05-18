package com.place.designsystem.theme.typography

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.place.designsystem.R

object PlaceTypography {

    private val pretendard = FontFamily(
        Font(R.font.pretendard_black, FontWeight.Black),
        Font(R.font.pretendard_bold, FontWeight.Bold),
        Font(R.font.pretendard_extrabold, FontWeight.ExtraBold),
        Font(R.font.pretendard_extralight, FontWeight.ExtraLight),
        Font(R.font.pretendard_light, FontWeight.Light),
        Font(R.font.pretendard_medium, FontWeight.Medium),
        Font(R.font.pretendard_regular, FontWeight.Normal),
        Font(R.font.pretendard_semibold, FontWeight.SemiBold),
        Font(R.font.pretendard_thin, FontWeight.Thin)
    )

    @Stable
    val headline1 = TextStyle(
        fontFamily = pretendard,
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 38.4.sp,
        letterSpacing = (-0.32).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val headline2 = TextStyle(
        fontFamily = pretendard,
        fontSize = 28.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 33.6.sp,
        letterSpacing = (-0.28).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val subHeadline1 = TextStyle(
        fontFamily = pretendard,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.8.sp,
        letterSpacing = (-0.24).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val subHeadline2 = TextStyle(
        fontFamily = pretendard,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        letterSpacing = (-0.4).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val subHeadline3 = TextStyle(
        fontFamily = pretendard,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = (19.2).sp,
        letterSpacing = (-0.32).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = pretendard,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 22.5.sp,
        letterSpacing = (-0.3).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val body2SemiBold = TextStyle(
        fontFamily = pretendard,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 21.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = pretendard,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 21.sp,
        letterSpacing = (-0.28).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val lable1 = TextStyle(
        fontFamily = pretendard,
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 15.6.sp,
        letterSpacing = (-0.26).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val lable2 = TextStyle(
        fontFamily = pretendard,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 14.4.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val caption1 = TextStyle(
        fontFamily = pretendard,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = (-0.28).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val caption2 = TextStyle(
        fontFamily = pretendard,
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.5.sp,
        letterSpacing = (-0.22).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val overLine = TextStyle(
        fontFamily = pretendard,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 10.sp,
        letterSpacing = (-0.2).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
}