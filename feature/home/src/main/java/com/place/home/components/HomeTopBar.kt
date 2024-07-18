package com.place.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.FilterIcon
import com.place.designsystem.icon.SearchIcon
import com.place.designsystem.theme.PlaceTheme
import com.place.home.R

@Composable
fun HomeTopBar(
    onFilterButtonClick: () -> Unit,
    onSearchButtonClick: () -> Unit,
) {
    PlaceTheme { colors, _ ->
        Box(
            modifier = Modifier
                .background(colors.grey11)
                .fillMaxWidth()
                .padding(vertical = 11.dp, horizontal = 16.dp)
        ) {
            Image(
                modifier = Modifier.align(Alignment.CenterStart),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_place_logo),
                contentDescription = "place logo"
            )
            Row(
                modifier = Modifier.align(Alignment.CenterEnd),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onFilterButtonClick,
                    content = { FilterIcon(size = 24.dp) }
                )
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onSearchButtonClick,
                    content = { SearchIcon(size = 24.dp) }
                )
            }
        }
    }
}

@Preview
@Composable
fun HomeTopBarPre() {
    HomeTopBar(
        onFilterButtonClick = {},
        onSearchButtonClick = {}
    )
}