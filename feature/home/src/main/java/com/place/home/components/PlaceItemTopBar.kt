package com.place.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.place.designsystem.icon.MeatBallIcon
import com.place.designsystem.theme.PlaceTheme

@Composable
fun PlaceItemTopBar(
    userProfile: String,
    userName: String,
    visitDescription: String,
    onMealBallIconClick: () -> Unit,
) {
    PlaceTheme { colors, typography ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colors.grey11)
                .padding(horizontal = 16.dp, vertical = 12.dp),
        ) {
            Row(
                modifier = Modifier.align(Alignment.CenterStart),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(34.dp)
                        .clip(CircleShape),
                    model = userProfile,
                    contentDescription = "user profile image"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = userName,
                        style = typography.body2SemiBold,
                        color = colors.white,
                    )
                    Text(
                        text = visitDescription,
                        style = typography.lable1,
                        color = colors.grey6
                    )
                }
            }
            IconButton(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.CenterEnd),
                onClick = onMealBallIconClick,
                content = { MeatBallIcon(size = 24.dp) }
            )
        }
    }
}