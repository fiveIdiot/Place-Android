package com.place.designsystem.theme.typography

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.place.designsystem.R

internal object PlaceTypography {

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
        fontSize = 32.sp
    )

    @Stable
    val headline2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 28.sp
    )

    @Stable
    val subHeadline1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 24.sp
    )

    @Stable
    val subHeadline2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 20.sp
    )

    @Stable
    val button = TextStyle(
        fontFamily = notosanskr,
        fontSize = 16.sp
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 15.sp
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 14.sp
    )

    @Stable
    val caption1 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 12.sp
    )

    @Stable
    val caption2 = TextStyle(
        fontFamily = notosanskr,
        fontSize = 11.sp
    )
}