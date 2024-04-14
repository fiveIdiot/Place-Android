package com.place.designsystem.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlaceTextField(
    modifier: Modifier = Modifier,
    value: String,
    isError: Boolean = false,
    errorMessage: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: (value: String) -> Unit,
    placeHolder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null
) {
    val interactionSource = remember { MutableInteractionSource() }

    PlaceTheme { colors, typography ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            BasicTextField(
                modifier = modifier.fillMaxWidth(),
                value = value,
                onValueChange = onValueChange,
                textStyle = typography.body2.copy(colors.white),
                interactionSource = interactionSource,
                keyboardActions = keyboardActions,
                keyboardOptions = keyboardOptions,
                cursorBrush = SolidColor(colors.orange5)
            ) { innerTextField ->
                OutlinedTextFieldDefaults.DecorationBox(
                    value = value,
                    innerTextField = innerTextField,
                    enabled = true,
                    singleLine = false,
                    visualTransformation = visualTransformation,
                    interactionSource = interactionSource,
                    contentPadding = OutlinedTextFieldDefaults.contentPadding(
                        start = 16.dp, top = (13.5).dp, bottom = (13.5).dp
                    ),
                    placeholder = placeHolder,
                    container = {
                        OutlinedTextFieldDefaults.ContainerBox(
                            enabled = true,
                            isError = isError,
                            interactionSource = interactionSource,
                            focusedBorderThickness = 1.dp,
                            unfocusedBorderThickness = 1.dp,
                            colors = OutlinedTextFieldDefaults.colors(
                                //cursor
                                cursorColor = colors.orange5,
                                errorCursorColor = colors.red5,

                                //container
                                focusedContainerColor = colors.grey9,
                                disabledContainerColor = colors.grey9,
                                unfocusedContainerColor = colors.grey9,
                                errorContainerColor = colors.grey9,

                                //border
                                focusedBorderColor = colors.orange5,
                                unfocusedBorderColor = Color.Transparent,
                                errorBorderColor = colors.red5,
                            ),
                            shape = RoundedCornerShape(10.dp),
                        )
                    },
                    trailingIcon = trailingIcon,
                    leadingIcon = leadingIcon
                )
            }
            if (isError && errorMessage.isNotEmpty()) {
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = "*$errorMessage",
                    style = typography.caption1,
                    color = colors.red5
                )
            }
        }
    }
}