package com.place.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.place.designsystem.icon.BookmarkIconLarge
import com.place.designsystem.icon.ShareIconLarge
import com.place.designsystem.theme.PlaceTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PlaceItem(
    userProfileImage: String,
    userName: String,
    visitorsNumber: Int,
    imageList: List<String>,
    twinkleNumber: Int,
    placeName: String,
    placeHashTag: String,
    placeReview: String,
    reviewCreatedDate: String,
    isTwinkleClicked: Boolean,
    onTwinkleClick: () -> Unit,
    onShareIconClick: () -> Unit,
    onBookMarkIconClick: () -> Unit,
    onPlaceInfoClick: () -> Unit,
) {
    val pagerState = rememberPagerState { imageList.size }

    PlaceTheme { colors, typography ->
        Column {
            PlaceItemTopBar(
                userProfile = userProfileImage,
                userName = userName,
                visitDescription = "${visitorsNumber}명이서 방문"
            ) {
                // todo 추후 디자인 추가시 구현
            }
            ImageSlider(
                imageList = imageList,
                pagerState = pagerState
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 20.dp,
                        vertical = 18.dp
                    )
            ) {
                PlaceTwinkle(
                    currentTwinkleNumber = twinkleNumber,
                    isTwinkleClicked = isTwinkleClicked,
                    onTwinkleClick = onTwinkleClick
                )
                ImageSlideIndicator(
                    modifier = Modifier.align(Alignment.Center),
                    imageListSize = imageList.size,
                    currentIdx = pagerState.currentPage
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = onShareIconClick
                    ) {
                        ShareIconLarge()
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = onBookMarkIconClick
                    ) {
                        BookmarkIconLarge()
                    }
                }
            }
            PlaceInfo(
                modifier = Modifier.padding(horizontal = 16.dp),
                placeName = placeName,
                hashTag = placeHashTag,
                onContainerClick = onPlaceInfoClick
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = placeReview,
                style = typography.body1,
                color = colors.white,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = reviewCreatedDate,
                style = typography.lable1,
                color = colors.grey7
            )
        }
    }
}

@Preview
@Composable
fun PlaceItemPre() {
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