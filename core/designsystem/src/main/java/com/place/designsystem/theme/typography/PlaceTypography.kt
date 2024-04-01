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

    private val notosanskr = FontFamily(
        Font(R.font.notosans_kr_black, FontWeight.Black),
        Font(R.font.notosans_kr_bold, FontWeight.Bold),
        Font(R.font.notosans_kr_extrabold, FontWeight.ExtraBold),
        Font(R.font.notosans_kr_extralight, FontWeight.ExtraLight),
        Font(R.font.notosans_kr_light, FontWeight.Light),
        Font(R.font.notosans_kr_medium, FontWeight.Medium),
        Font(R.font.notosans_kr_regular, FontWeight.Normal),
        Font(R.font.notosans_kr_semibold, FontWeight.SemiBold),
        Font(R.font.notosans_kr_thin, FontWeight.Thin)
    )

    @Stable
    val headline1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 38.4.sp,
        letterSpacing = (-1.28).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val headline2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 28.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 33.6.sp,
        letterSpacing = (-1.12).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val subHeadline1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.8.sp,
        letterSpacing = (-0.96).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val subHeadline2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        letterSpacing = (-0.8).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val button = TextStyle(
        fontFamily = notosanskr,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 19.2.sp,
        letterSpacing = (-0.64).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 22.5.sp,
        letterSpacing = (-0.3).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 21.sp,
        letterSpacing = (-0.28).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val caption1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

    @Stable
    val caption2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.5.sp,
        letterSpacing = (-0.22).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
}