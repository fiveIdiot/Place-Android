package com.place.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.place.designsystem.icon.CircleXIcon
import com.place.designsystem.icon.SearchIcon
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
                    SearchIcon(color = colors.grey7)
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
                        CircleXIcon(color = colors.grey6)
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