package com.place.home.components.filter

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.AgainIcon
import com.place.designsystem.modifier.clickable
import com.place.designsystem.theme.PlaceTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterLayout(
    onResetButtonClick: () -> Unit,
    content: @Composable PagerScope.(page: String) -> Unit,
) {
    val scope = rememberCoroutineScope()
    val filterTypes = remember {
        mutableListOf("방문 인원", "카테고리")
    }
    val pagerState = rememberPagerState(
        pageCount = { filterTypes.size }
    )

    PlaceTheme { colors, typography ->
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    filterTypes.forEach {
                        Text(
                            modifier = Modifier.clickable {
                                scope.launch { pagerState.scrollToPage(filterTypes.indexOf(it)) }
                            },
                            text = it,
                            style = typography.subHeadline3,
                            color = if (pagerState.currentPage == filterTypes.indexOf(it)) colors.white else colors.grey7
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(
                    modifier = Modifier.size(24.dp),
                    onClick = onResetButtonClick
                ) {
                    AgainIcon(modifier = Modifier.size(24.dp))
                }
            }
            HorizontalPager(
                modifier = Modifier.fillMaxSize(),
                state = pagerState,
                pageContent = {
                    content(filterTypes[it])
                }
            )
        }
    }
}