package com.place.designsystem.icon

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.place.designsystem.R
import com.place.designsystem.theme.color.DarkColor
import com.place.designsystem.theme.color.LightColor

@Composable
fun ChevronDownIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_chevron_down),
        contentDescription = "ChevronDownIcon"
    )
}

@Composable
fun ChevronUpIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_chevron_up),
        contentDescription = "ChevronUpIcon"
    )
}

@Composable
fun ChevronLeftIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_chevron_left),
        contentDescription = "ChevronLeftIcon"
    )
}

@Composable
fun ChevronRightIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_chevron_right),
        contentDescription = "ChevronRightIcon"
    )
}

@Composable
fun SearchIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search),
        contentDescription = "SearchIcon"
    )
}

@Composable
fun ShareIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_share),
        contentDescription = "ShareIcon"
    )
}

@Composable
fun HomeFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_fill),
        contentDescription = "HomeFillIcon"
    )
}

@Composable
fun FilterIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_chevron_down),
        contentDescription = "LocationIconLarge"
    )
}

@Composable
fun MirrorPaperIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mirror_paper),
        contentDescription = "MirrorPaperIcon"
    )
}

@Composable
fun ApplauseIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_applause),
        contentDescription = "ApplauseIcon"
    )
}

@Composable
fun InternetIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_internet),
        contentDescription = "InternetIcon"
    )
}

@Composable
fun MugCupIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup),
        contentDescription = "MugCupIcon"
    )
}

@Composable
fun MugCupFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_mugcup_fill),
        contentDescription = "MugCupFillIcon"
    )
}

@Composable
fun CogWheelIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_cog_wheel),
        contentDescription = "CogWheelIcon"
    )
}

@Composable
fun BookMarkIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark),
        contentDescription = "BookMarkIcon"
    )
}

@Composable
fun BookMarkFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_bookmark_fill),
        contentDescription = "BookMarkFillIcon"
    )
}

@Composable
fun ClockIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock),
        contentDescription = "ClockIcon"
    )
}

@Composable
fun ClockFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_clock_fill),
        contentDescription = "ClockFillIcon"
    )
}

@Composable
fun CallIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call),
        contentDescription = "CallIcon"
    )
}

@Composable
fun CallFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_call_fill),
        contentDescription = "CallFillIcon"
    )
}

@Composable
fun CompassIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_compass),
        contentDescription = "CompassIcon"
    )
}

@Composable
fun HamburgerIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_hamburger),
        contentDescription = "HamburgerIcon"
    )
}

@Composable
fun CircleCurvedArrowIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_circle_curved_arrow),
        contentDescription = "CircleCurvedArrowIcon"
    )
}

@Composable
fun CircleCurvedArrowFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_circle_curved_arrow_fill),
        contentDescription = "CircleCurvedArrowFillIcon"
    )
}

@Composable
fun CoinIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_coin),
        contentDescription = "CoinIcon"
    )
}

@Composable
fun SquarePlusIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_square_plus),
        contentDescription = "SquarePlusIcon"
    )
}

@Composable
fun ArrowLeftIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
        contentDescription = "ArrowLeftIcon"
    )
}

@Composable
fun MeatBallIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_meatball),
        contentDescription = "MeatBallIcon"
    )
}

@Composable
fun CloseIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_close),
        contentDescription = "CloseIcon"
    )
}

@Composable
fun PlusIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_plus),
        contentDescription = "PlusIcon"
    )
}

@Composable
fun ShoppingBagFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_shoppingbag),
        contentDescription = "ShoppingBagFillIcon"
    )
}

@Composable
fun AgainIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_again),
        contentDescription = "AgainIcon"
    )
}

@Composable
fun PinFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pin),
        contentDescription = "PinFillIcon"
    )
}

@Composable
fun PeopleFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people_fill),
        contentDescription = "PeopleFillIcon"
    )
}

@Composable
fun PeopleIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_people),
        contentDescription = "PeopleIcon"
    )
}

@Composable
fun CircleXIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_circlex),
        contentDescription = "CircleXIcon"
    )
}

@Composable
fun PenIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_pen),
        contentDescription = "PenIcon"
    )
}

@Composable
fun MapIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_map),
        contentDescription = "MapIcon"
    )
}

@Composable
fun PictureIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_picture),
        contentDescription = "PictureIcon"
    )
}

@Composable
fun CameraIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_camera),
        contentDescription = "CameraIcon"
    )
}

@Composable
fun FireIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_fire),
        contentDescription = "FireIcon"
    )
}

@Composable
fun TwinkleFillIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_twinkle_fill),
        contentDescription = "TwinkleFillIcon"
    )
}

@Composable
fun TwinkleIcon(
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    color: Color = if (isSystemInDarkTheme()) DarkColor.white else LightColor.white,
) {
    Icon(
        modifier = modifier.size(size),
        tint = color,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_twinkle),
        contentDescription = "TwinkleIcon"
    )
}