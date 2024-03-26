package com.place.designsystem.icon

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.place.designsystem.R
import com.place.designsystem.theme.color.DarkColor
import com.place.designsystem.theme.color.LightColor

@Composable
fun LocationIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_location_xlarge),
        contentDescription = "LocationIconXLarge"
    )
}

@Composable
fun BookmarkIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark_xlarge),
        contentDescription = "BookmarkIconXLarge"
    )
}

@Composable
fun FilterIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter_xlarge),
        contentDescription = "FilterIconXLarge"
    )
}

@Composable
fun SearchIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search_xlarge),
        contentDescription = "SearchIconXLarge"
    )
}

@Composable
fun ApplauseIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_applause_xlarge),
        contentDescription = "ApplauseIconXLarge"
    )
}

@Composable
fun MirrorPagerIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mirrorpaper_xlarge),
        contentDescription = "2PagerIconXLarge"
    )
}

@Composable
fun InternetIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_internet_xlarge),
        contentDescription = "InternetIconXLarge"
    )
}

@Composable
fun CurvedArrowIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_curvedarrow_xlarge),
        contentDescription = "CurvedArrowIconXLarge"
    )
}

@Composable
fun ShareIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_share_xlarge),
        contentDescription = "ShareIconXLarge"
    )
}

@Composable
fun ArrowheadIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrowhead_xlarge),
        contentDescription = "ArrowheadIconXLarge"
    )
}

@Composable
fun CompassIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_compass_xlarge),
        contentDescription = "CompassIconXLarge"
    )
}

@Composable
fun ClockIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock_xlarge),
        contentDescription = "ClockIconXLarge"
    )
}

@Composable
fun MugCupIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup_xlarge),
        contentDescription = "MugCupIconXLarge"
    )
}

@Composable
fun CallIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call_xlarge),
        contentDescription = "CallIconXLarge"
    )
}

@Composable
fun CoinIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_coin_xlarge),
        contentDescription = "CoinIconXLarge"
    )
}

@Composable
fun PlusInSquareIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plusinsquare_xlarge),
        contentDescription = "PlusInSquareIconXLarge"
    )
}

@Composable
fun XIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_x_xlarge),
        contentDescription = "XIconXLarge"
    )
}

@Composable
fun ArrowIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_xlarge),
        contentDescription = "ArrowIconXLarge"
    )
}

@Composable
fun PlusIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plus_xlarge),
        contentDescription = "PlusIconXLarge"
    )
}

@Composable
fun PeopleIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people_xlarge),
        contentDescription = "PeopleIconXLarge"
    )
}

@Composable
fun HomeIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_xlarge),
        contentDescription = "HomeIconXLarge"
    )
}

@Composable
fun PinIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pin_xlarge),
        contentDescription = "PinIconXLarge"
    )
}

@Composable
fun PenIconXLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pen_xlarge),
        contentDescription = "PenIconXLarge"
    )
}