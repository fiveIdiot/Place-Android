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
fun LocationIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_location_large),
        contentDescription = "LocationIconLarge"
    )
}

@Composable
fun BookmarkIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark_large),
        contentDescription = "BookmarkIconLarge"
    )
}

@Composable
fun FilterIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter_large),
        contentDescription = "FilterIconLarge"
    )
}

@Composable
fun SearchIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search_large),
        contentDescription = "SearchIconLarge"
    )
}

@Composable
fun ApplauseIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_applause_large),
        contentDescription = "ApplauseIconLarge"
    )
}

@Composable
fun MirrorPaperIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mirrorpaper_large),
        contentDescription = "2PaperIconLarge"
    )
}

@Composable
fun InternetIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_internet_large),
        contentDescription = "InternetIconLarge"
    )
}

@Composable
fun ShareIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_share_large),
        contentDescription = "ShareIconLarge"
    )
}

@Composable
fun CompassIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_compass_large),
        contentDescription = "CompassIconLarge"
    )
}

@Composable
fun ClockIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock_large),
        contentDescription = "ClockIconLarge"
    )
}

@Composable
fun MugCupIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup_large),
        contentDescription = "MugCupIconLarge"
    )
}

@Composable
fun CallIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call_large),
        contentDescription = "CallIconLarge"
    )
}

@Composable
fun CoinIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_coin_large),
        contentDescription = "CoinIconLarge"
    )
}

@Composable
fun PlusInSquareIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plusinsquare_large),
        contentDescription = "PlusInSquareIconLarge"
    )
}

@Composable
fun CogwheelIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_cogwheel_large),
        contentDescription = "CogwheelIconLarge"
    )
}

@Composable
fun ArrowheadIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrowhead_large),
        contentDescription = "ArrowheadIconLarge"
    )
}

@Composable
fun CurvedArrowIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_curvedarrow_large),
        contentDescription = "CurvedArrowIconLarge"
    )
}

@Composable
fun ArrowIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_large),
        contentDescription = "ArrowIconLarge"
    )
}

@Composable
fun MeatballIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_meatball_large),
        contentDescription = "MeatballIconLarge"
    )
}

@Composable
fun XIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_x_large),
        contentDescription = "XIconLarge"
    )
}

@Composable
fun PlusIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plus_large),
        contentDescription = "PlusIconLarge"
    )
}

@Composable
fun AgainIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_again_large),
        contentDescription = "AgainIconLarge"
    )
}

@Composable
fun ShoppingBagIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_shoppingbag_large),
        contentDescription = "ShoppingBagIconLarge"
    )
}

@Composable
fun PenIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pen_large),
        contentDescription = "PenIconLarge"
    )
}

@Composable
fun PeopleIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people_large),
        contentDescription = "PeopleIconLarge"
    )
}

@Composable
fun HomeIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_large),
        contentDescription = "HomeIconLarge"
    )
}

@Composable
fun PinIconLarge(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pin_large),
        contentDescription = "PinIconLarge"
    )
}