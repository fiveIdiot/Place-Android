package com.place.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.components.PlaceDialog
import com.place.designsystem.components.PlaceFilledButton
import com.place.designsystem.components.PlaceOutlinedButton
import com.place.designsystem.components.PlaceTextField
import com.place.designsystem.components.PlaceTopBar
import com.place.designsystem.icon.AgainIconLarge
import com.place.designsystem.icon.AgainIconMedium
import com.place.designsystem.icon.AgainIconSmall
import com.place.designsystem.icon.ArrowIconLarge
import com.place.designsystem.icon.ArrowIconMedium
import com.place.designsystem.icon.ArrowIconSmall
import com.place.designsystem.icon.ArrowIconXLarge
import com.place.designsystem.icon.ArrowheadIconLarge
import com.place.designsystem.icon.ArrowheadIconMedium
import com.place.designsystem.icon.ArrowheadIconSmall
import com.place.designsystem.icon.ArrowheadIconXLarge
import com.place.designsystem.icon.BookmarkIconLarge
import com.place.designsystem.icon.BookmarkIconMedium
import com.place.designsystem.icon.BookmarkIconSmall
import com.place.designsystem.icon.BookmarkIconXLarge
import com.place.designsystem.icon.CallIconLarge
import com.place.designsystem.icon.CallIconMedium
import com.place.designsystem.icon.CallIconSmall
import com.place.designsystem.icon.CallIconXLarge
import com.place.designsystem.icon.ClockIconLarge
import com.place.designsystem.icon.ClockIconMedium
import com.place.designsystem.icon.ClockIconSmall
import com.place.designsystem.icon.ClockIconXLarge
import com.place.designsystem.icon.CoinIconLarge
import com.place.designsystem.icon.CoinIconMedium
import com.place.designsystem.icon.CoinIconSmall
import com.place.designsystem.icon.CoinIconXLarge
import com.place.designsystem.icon.CompassIconLarge
import com.place.designsystem.icon.CompassIconMedium
import com.place.designsystem.icon.CompassIconSmall
import com.place.designsystem.icon.CompassIconXLarge
import com.place.designsystem.icon.CurvedArrowIconLarge
import com.place.designsystem.icon.CurvedArrowIconMedium
import com.place.designsystem.icon.CurvedArrowIconSmall
import com.place.designsystem.icon.CurvedArrowIconXLarge
import com.place.designsystem.icon.FilledXMarkIconLarge
import com.place.designsystem.icon.FilterIconLarge
import com.place.designsystem.icon.FilterIconMedium
import com.place.designsystem.icon.FilterIconSmall
import com.place.designsystem.icon.FilterIconXLarge
import com.place.designsystem.icon.HomeIconLarge
import com.place.designsystem.icon.HomeIconMedium
import com.place.designsystem.icon.HomeIconSmall
import com.place.designsystem.icon.HomeIconXLarge
import com.place.designsystem.icon.InternetIconLarge
import com.place.designsystem.icon.InternetIconMedium
import com.place.designsystem.icon.InternetIconSmall
import com.place.designsystem.icon.InternetIconXLarge
import com.place.designsystem.icon.LocationIconLarge
import com.place.designsystem.icon.LocationIconMedium
import com.place.designsystem.icon.LocationIconSmall
import com.place.designsystem.icon.LocationIconXLarge
import com.place.designsystem.icon.MirrorPagerIconSmall
import com.place.designsystem.icon.MirrorPagerIconXLarge
import com.place.designsystem.icon.MirrorPaperIconLarge
import com.place.designsystem.icon.MirrorPaperIconMedium
import com.place.designsystem.icon.MugCupIconLarge
import com.place.designsystem.icon.MugCupIconMedium
import com.place.designsystem.icon.MugCupIconSmall
import com.place.designsystem.icon.MugCupIconXLarge
import com.place.designsystem.icon.PenIconLarge
import com.place.designsystem.icon.PenIconMedium
import com.place.designsystem.icon.PenIconSmall
import com.place.designsystem.icon.PenIconXLarge
import com.place.designsystem.icon.PeopleIconLarge
import com.place.designsystem.icon.PeopleIconMedium
import com.place.designsystem.icon.PeopleIconSmall
import com.place.designsystem.icon.PeopleIconXLarge
import com.place.designsystem.icon.PinIconLarge
import com.place.designsystem.icon.PinIconMedium
import com.place.designsystem.icon.PinIconSmall
import com.place.designsystem.icon.PinIconXLarge
import com.place.designsystem.icon.PlusIconLarge
import com.place.designsystem.icon.PlusIconMedium
import com.place.designsystem.icon.PlusIconSmall
import com.place.designsystem.icon.PlusIconXLarge
import com.place.designsystem.icon.PlusInSquareIconLarge
import com.place.designsystem.icon.PlusInSquareIconMedium
import com.place.designsystem.icon.PlusInSquareIconSmall
import com.place.designsystem.icon.PlusInSquareIconXLarge
import com.place.designsystem.icon.SearchIconLarge
import com.place.designsystem.icon.SearchIconMedium
import com.place.designsystem.icon.SearchIconSmall
import com.place.designsystem.icon.SearchIconXLarge
import com.place.designsystem.icon.ShareIconLarge
import com.place.designsystem.icon.ShareIconMedium
import com.place.designsystem.icon.ShareIconSmall
import com.place.designsystem.icon.ShareIconXLarge
import com.place.designsystem.icon.XIconLarge
import com.place.designsystem.icon.XIconMedium
import com.place.designsystem.icon.XIconSmall
import com.place.designsystem.icon.XIconXLarge
import com.place.designsystem.theme.PlaceTheme

@Preview
@Composable
fun TypoPreview() {
    PlaceTheme { colors, typography ->
        Column(modifier = Modifier.background(colors.white)) {
            Text(text = "headline1", style = typography.headline1, color = colors.black)
            Text(text = "headline2", style = typography.headline2, color = colors.black)
            Text(text = "subHeadline1", style = typography.subHeadline1, color = colors.black)
            Text(text = "subHeadline2", style = typography.subHeadline2, color = colors.black)
            Text(text = "subHeadline3", style = typography.subHeadline3, color = colors.black)
            Text(text = "body1", style = typography.body1, color = colors.black)
            Text(text = "body2 semibold", style = typography.body2SemiBold, color = colors.black)
            Text(text = "body2", style = typography.body2, color = colors.black)
            Text(text = "lable1", style = typography.lable1, color = colors.black)
            Text(text = "lable2", style = typography.lable2, color = colors.black)
            Text(text = "caption1", style = typography.caption1, color = colors.black)
            Text(text = "caption2", style = typography.caption2, color = colors.black)
            Text(text = "overline", style = typography.overLine, color = colors.black)
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

@Preview
@Composable
fun FilledButtonPre() {
    PlaceTheme { _, typography ->
        PlaceFilledButton(
            enabled = true,
            content = { Text(text = "FilledButton", style = typography.body2) },
            onClick = {}
        )
    }
}

@Preview
@Composable
fun OutlinedButtonPre() {
    PlaceTheme { _, typography ->
        PlaceOutlinedButton(
            enabled = true,
            content = { Text(text = "OutlinedButton", style = typography.body2) },
            onClick = {}
        )
    }
}

@Preview
@Composable
fun PlaceTextFieldPre() {
    val (value, onValueChange) = remember {
        mutableStateOf("")
    }

    PlaceTheme { colors, typography ->
        PlaceTextField(
            modifier = Modifier.height(48.dp),
            value = value,
            onValueChange = onValueChange,
            placeHolder = {
                Row {
                    SearchIconLarge(color = colors.grey7)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "placeholder",
                        style = typography.body2,
                        color = colors.grey7
                    )
                }
            },
            trailingIcon = {
                if (value.isNotEmpty()) {
                    IconButton(onClick = { onValueChange("") }) {
                        FilledXMarkIconLarge(color = colors.grey6)
                    }
                }
            }
        )
    }
}

@Preview
@Composable
fun PlaceDialogPre() {
    Column(modifier = Modifier.fillMaxSize()) {
        PlaceDialog(
            text = "선택하신 N개의 북마크를\n삭제하실건가요?",
            outlineButtonText = "취소",
            filledButtonText = "삭제",
            outlinedButtonOnClick = {},
            filledButtonOnClick = {},
            onDismissRequest = {}
        )
    }
}

@Preview
@Composable
fun PlaceTopBarPre() {
    PlaceTopBar(title = "플레이스 TopBar")
}