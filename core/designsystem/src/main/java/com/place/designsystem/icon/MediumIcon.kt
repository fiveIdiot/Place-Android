package com.place.designsystem.icon

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.place.designsystem.R
import com.place.designsystem.theme.color.DarkColor
import com.place.designsystem.theme.color.LightColor

@Composable
fun LocationIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_location_medium),
        contentDescription = "LocationIconLarge"
    )
}

@Composable
fun BookmarkIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark_medium),
        contentDescription = "BookmarkIconLarge"
    )
}

@Composable
fun FilterIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter_medium),
        contentDescription = "FilterIconLarge"
    )
}

@Composable
fun SearchIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search_medium),
        contentDescription = "SearchIconLarge"
    )
}

@Composable
fun ApplauseIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_applause_medium),
        contentDescription = "ApplauseIconLarge"
    )
}

@Composable
fun MirrorPaperIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mirrorpaper_medium),
        contentDescription = "2PaperIconLarge"
    )
}

@Composable
fun InternetIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_internet_medium),
        contentDescription = "InternetIconLarge"
    )
}

@Composable
fun ShareIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_share_medium),
        contentDescription = "ShareIconLarge"
    )
}

@Composable
fun CompassIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_compass_medium),
        contentDescription = "CompassIconLarge"
    )
}

@Composable
fun ClockIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock_medium),
        contentDescription = "ClockIconLarge"
    )
}

@Composable
fun MugCupIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup_medium),
        contentDescription = "MugCupIconLarge"
    )
}

@Stable
@Composable
fun CallIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call_medium),
        contentDescription = "CallIconLarge"
    )
}

@Composable
fun CoinIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_coin_medium),
        contentDescription = "CoinIconLarge"
    )
}

@Composable
fun PlusInSquareIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plusinsquare_medium),
        contentDescription = "PlusInSquareIconLarge"
    )
}

@Composable
fun CogwheelIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_cogwheel_medium),
        contentDescription = "CogwheelIconLarge"
    )
}

@Composable
fun ArrowheadIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrowhead_medium),
        contentDescription = "ArrowheadIconLarge"
    )
}

@Composable
fun CurvedArrowIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_curvedarrow_medium),
        contentDescription = "CurvedArrowIconLarge"
    )
}

@Composable
fun ArrowIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrowhead_medium),
        contentDescription = "ArrowIconLarge"
    )
}

@Composable
fun MeatballIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_meatballs_medium),
        contentDescription = "MeatballIconLarge"
    )
}

@Composable
fun XIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_x_medium),
        contentDescription = "XIconLarge"
    )
}

@Composable
fun PlusIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plus_medium),
        contentDescription = "PlusIconLarge"
    )
}

@Composable
fun AgainIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_again_medium),
        contentDescription = "AgainIconLarge"
    )
}

@Composable
fun ShoppingBagIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_shoppingbag_medium),
        contentDescription = "ShoppingBagIconLarge"
    )
}

@Composable
fun PenIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pen_medium),
        contentDescription = "PenIconLarge"
    )
}

@Composable
fun PeopleIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people_medium),
        contentDescription = "PeopleIconLarge"
    )
}

@Composable
fun HomeIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_medium),
        contentDescription = "HomeIconLarge"
    )
}

@Composable
fun PinIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pin_medium),
        contentDescription = "PinIconLarge"
    )
}

@Composable
fun FireIconMedium(
    modifier: Modifier = Modifier,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier,
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_normal_fire),
        contentDescription = "FireIconLarge"
    )
}