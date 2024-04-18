package com.place.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceDialog(
    text: String,
    outlineButtonText: String,
    filledButtonText: String,
    outlinedButtonOnClick: () -> Unit,
    filledButtonOnClick: () -> Unit,
    onDismissRequest: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Dialog(
            properties = DialogProperties(usePlatformDefaultWidth = false),
            onDismissRequest = onDismissRequest
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(colors.grey10)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = text,
                    style = typography.subHeadline3,
                    color = colors.white,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.size(32.dp))
                Row {
                    PlaceOutlinedButton(
                        modifier = Modifier
                            .width(96.dp)
                            .height(41.dp),
                        enabled = true,
                        content = {
                            Text(
                                text = outlineButtonText,
                                style = typography.body2,
                                color = colors.white
                            )
                        },
                        onClick = outlinedButtonOnClick
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    PlaceFilledButton(
                        modifier = Modifier
                            .width(96.dp)
                            .height(41.dp),
                        containerColor = colors.red5,
                        enabled = true,
                        content = {
                            Text(
                                text = filledButtonText,
                                style = typography.body2,
                                color = colors.white
                            )
                        },
                        onClick = filledButtonOnClick
                    )
                }
            }
        }
    }
}