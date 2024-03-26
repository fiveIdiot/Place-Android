package com.place.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.*
import com.place.designsystem.theme.PlaceTheme
import com.place.designsystem.theme.typography.PlaceTypography

@Preview
@Composable
fun TypoPreview() {
    val typos = listOf(
        Pair(PlaceTypography.headline1, "headline1"),
        Pair(PlaceTypography.headline2, "headline2"),
        Pair(PlaceTypography.subHeadline1, "subheadline1"),
        Pair(PlaceTypography.subHeadline2, "subheadline2"),
        Pair(PlaceTypography.button, "button"),
        Pair(PlaceTypography.body1, "body1"),
        Pair(PlaceTypography.body2, "body2"),
        Pair(PlaceTypography.caption1, "caption1"),
        Pair(PlaceTypography.caption2, "caption2"),
    )

    PlaceTheme { colors, _ ->
        Column(modifier = Modifier.background(colors.white)) {
            typos.forEach {
                Text(text = it.second, style = it.first, color = colors.black)
            }
        }
    }
}

@Preview
@Composable
fun XLargeIconPreview() {
    PlaceTheme { colors, _ ->
        Column(
            modifier = Modifier
                .padding(5.dp)
                .background(colors.white),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                LocationIconXLarge(color = colors.black)
                BookmarkIconXLarge(color = colors.black)
                FilterIconXLarge(color = colors.black)
                SearchIconXLarge(color = colors.black)
                MirrorPagerIconXLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                InternetIconXLarge(color = colors.black)
                CurvedArrowIconXLarge(color = colors.black)
                ShareIconXLarge(color = colors.black)
                ArrowheadIconXLarge(color = colors.black)
                CompassIconXLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                ClockIconXLarge(color = colors.black)
                MugCupIconXLarge(color = colors.black)
                CallIconXLarge(color = colors.black)
                CoinIconXLarge(color = colors.black)
                PlusInSquareIconXLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                XIconXLarge(color = colors.black)
                ArrowIconXLarge(color = colors.black)
                PlusIconXLarge(color = colors.black)
                PeopleIconXLarge(color = colors.black)
                HomeIconXLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                PinIconXLarge(color = colors.black)
                PenIconXLarge(color = colors.black)
            }
        }
    }
}

@Preview
@Composable
fun LargeIconPreview() {
    PlaceTheme { colors, _ ->
        Column(
            modifier = Modifier
                .padding(5.dp)
                .background(colors.white),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                LocationIconLarge(color = colors.black)
                BookmarkIconLarge(color = colors.black)
                FilterIconLarge(color = colors.black)
                SearchIconLarge(color = colors.black)
                MirrorPaperIconLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                InternetIconLarge(color = colors.black)
                CurvedArrowIconLarge(color = colors.black)
                ShareIconLarge(color = colors.black)
                ArrowheadIconLarge(color = colors.black)
                CompassIconLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                ClockIconLarge(color = colors.black)
                MugCupIconLarge(color = colors.black)
                CallIconLarge(color = colors.black)
                CoinIconLarge(color = colors.black)
                PlusInSquareIconLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                XIconLarge(color = colors.black)
                ArrowIconLarge(color = colors.black)
                PlusIconLarge(color = colors.black)
                PeopleIconLarge(color = colors.black)
                HomeIconLarge(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                PinIconLarge(color = colors.black)
                PenIconLarge(color = colors.black)
                AgainIconLarge(color = colors.black)
            }
        }
    }
}

@Preview
@Composable
fun MediumIconPreview() {
    PlaceTheme { colors, _ ->
        Column(
            modifier = Modifier
                .padding(5.dp)
                .background(colors.white),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                LocationIconMedium(color = colors.black)
                BookmarkIconMedium(color = colors.black)
                FilterIconMedium(color = colors.black)
                SearchIconMedium(color = colors.black)
                MirrorPaperIconMedium(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                InternetIconMedium(color = colors.black)
                CurvedArrowIconMedium(color = colors.black)
                ShareIconMedium(color = colors.black)
                ArrowheadIconMedium(color = colors.black)
                CompassIconMedium(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                ClockIconMedium(color = colors.black)
                MugCupIconMedium(color = colors.black)
                CallIconMedium(color = colors.black)
                CoinIconMedium(color = colors.black)
                PlusInSquareIconMedium(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                XIconMedium(color = colors.black)
                ArrowIconMedium(color = colors.black)
                PlusIconMedium(color = colors.black)
                PeopleIconMedium(color = colors.black)
                HomeIconMedium(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                PinIconMedium(color = colors.black)
                PenIconMedium(color = colors.black)
                AgainIconMedium(color = colors.black)
            }
        }
    }
}

@Preview
@Composable
fun SmallIconPreview() {
    PlaceTheme { colors, _ ->
        Column(
            modifier = Modifier
                .padding(5.dp)
                .background(colors.white),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                LocationIconSmall(color = colors.black)
                BookmarkIconSmall(color = colors.black)
                FilterIconSmall(color = colors.black)
                SearchIconSmall(color = colors.black)
                MirrorPagerIconSmall(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                InternetIconSmall(color = colors.black)
                CurvedArrowIconSmall(color = colors.black)
                ShareIconSmall(color = colors.black)
                ArrowheadIconSmall(color = colors.black)
                CompassIconSmall(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                ClockIconSmall(color = colors.black)
                MugCupIconSmall(color = colors.black)
                CallIconSmall(color = colors.black)
                CoinIconSmall(color = colors.black)
                PlusInSquareIconSmall(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                XIconSmall(color = colors.black)
                ArrowIconSmall(color = colors.black)
                PlusIconSmall(color = colors.black)
                PeopleIconSmall(color = colors.black)
                HomeIconSmall(color = colors.black)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                PinIconSmall(color = colors.black)
                PenIconSmall(color = colors.black)
                AgainIconSmall(color = colors.black)
            }
        }
    }
}