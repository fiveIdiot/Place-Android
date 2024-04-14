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
fun LocationIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_location_small),
        contentDescription = "LocationIconSmall"
    )
}

@Composable
fun BookmarkIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark_small),
        contentDescription = "BookmarkIconSmall"
    )
}

@Composable
fun FilterIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter_small),
        contentDescription = "FilterIconSmall"
    )
}

@Composable
fun SearchIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search_small),
        contentDescription = "SearchIconSmall"
    )
}

@Composable
fun ApplauseIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_applause_small),
        contentDescription = "ApplauseIconSmall"
    )
}

@Composable
fun MirrorPagerIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mirrorpaper_small),
        contentDescription = "MirrorPagerIconSmall"
    )
}

@Composable
fun InternetIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_internet_small),
        contentDescription = "InternetIconSmall"
    )
}

@Composable
fun CurvedArrowIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_curvedarrow_small),
        contentDescription = "CurvedArrowIconSmall"
    )
}

@Composable
fun ShareIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_share_small),
        contentDescription = "ShareIconSmall"
    )
}

@Composable
fun ArrowheadIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrowhead_small),
        contentDescription = "ArrowheadIconSmall"
    )
}

@Composable
fun CompassIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_compass_small),
        contentDescription = "CompassIconSmall"
    )
}

@Composable
fun ClockIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock_small),
        contentDescription = "ClockIconSmall"
    )
}

@Composable
fun MugCupIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup_small),
        contentDescription = "MugCupIconSmall"
    )
}

@Composable
fun CallIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call_small),
        contentDescription = "CallIconSmall"
    )
}

@Composable
fun CoinIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_coin_small),
        contentDescription = "CoinIconSmall"
    )
}

@Composable
fun PlusInSquareIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plusinsquare_small),
        contentDescription = "PlusInSquareIconSmall"
    )
}

@Composable
fun XIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_x_small),
        contentDescription = "XIconSmall"
    )
}

@Composable
fun ArrowIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_small),
        contentDescription = "ArrowIconSmall"
    )
}

@Composable
fun PlusIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plus_small),
        contentDescription = "PlusIconSmall"
    )
}

@Composable
fun PeopleIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people_small),
        contentDescription = "PeopleIconSmall"
    )
}

@Composable
fun HomeIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_small),
        contentDescription = "HomeIconSmall"
    )
}

@Composable
fun PinIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pin_small),
        contentDescription = "PinIconSmall"
    )
}

@Composable
fun PenIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pen_small),
        contentDescription = "PenIconSmall"
    )
}

@Composable
fun AgainIconSmall(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_again_small),
        contentDescription = "AgainIconSmall"
    )
}