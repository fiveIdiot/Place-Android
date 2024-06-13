package com.place.home.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.theme.PlaceTheme
import com.place.home.components.CurationChips
import com.place.home.components.HomeTopBar
import com.place.home.components.PlaceItem

@Preview
@Composable
fun HomeScreen() {
    PlaceTheme { colors, _ ->
        Scaffold(
            containerColor = colors.grey11,
            topBar = {
                Column {
                    HomeTopBar(
                        onFilterButtonClick = {},
                        onSearchButtonClick = {}
                    )
                    CurationChips(
                        onCustomToggleSelected = {},
                        onHotPlaceToggleSelected = {}
                    )
                }
            }
        ) { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .padding(paddingValues),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(5) {
                    PlaceItem(
                        userProfileImage = "https://avatars.githubusercontent.com/u/80810303?v=4",
                        userName = "김현승",
                        visitorsNumber = 2,
                        imageList = listOf(
                            "https://avatars.githubusercontent.com/u/80810303?v=4",
                            "https://avatars.githubusercontent.com/u/80810303?v=4",
                            "https://avatars.githubusercontent.com/u/80810303?v=4",
                            "https://avatars.githubusercontent.com/u/80810303?v=4",
                        ),
                        twinkleNumber = 123,
                        placeName = "시훈이네 스윗하우스",
                        placeHashTag = "#김시훈_하우스",
                        placeReview = "안녕하세요 반갑습니다. 이것은 아주 아주 아주 아주 아주 아주 아주 긴 문장입니다. 안녕하세요 반갑습니다. 이것은 아주 아주 아주 아주 아주 아주 아주 긴 문장입니다.",
                        reviewCreatedDate = "2024년 2월 21일 작성",
                        isTwinkleClicked = true,
                        onTwinkleClick = {},
                        onShareIconClick = {},
                        onBookMarkIconClick = {},
                        onPlaceInfoClick = {}
                    )
                }
            }
        }
    }
}