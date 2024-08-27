package com.place.home.components.filter

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun FilterBottomSheet(
    bottomSheetState: SheetState,
    onDismissRequest: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        ModalBottomSheet(
            modifier = Modifier.fillMaxSize(),
            sheetState = bottomSheetState,
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
            containerColor = colors.grey10,
            contentColor = colors.grey10,
            dragHandle = {
                BottomSheetDefaults.DragHandle(
                    color = colors.grey8
                )
            },
            onDismissRequest = onDismissRequest
        ) {
            FilterLayout(onResetButtonClick = { /*TODO*/ }) {
                when (it) {
                    "방문인원" -> {

                    }

                    "카테고리" -> {

                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FilterBottomSheetPre() {
    val bottomSheetState = rememberModalBottomSheetState()
    var isSheetOpen by remember { mutableStateOf(false) }

    Button(onClick = { isSheetOpen = true }) {
        Text(text = "click")
    }

    if (isSheetOpen) {
        FilterBottomSheet(
            bottomSheetState = bottomSheetState,
            onDismissRequest = { isSheetOpen = false }
        )
    }
}