package com.learn.navigationdemo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.learn.navigationdemo.domain.model.tabs
import com.learn.navigationdemo.ui.components.AppbarComponent
import com.learn.navigationdemo.ui.components.ChatsViewState
import com.learn.navigationdemo.ui.screens.chats.ChatsScreen
import com.learn.navigationdemo.ui.viewmodel.ChatsViewModel
import kotlinx.coroutines.launch



@Composable
internal fun HomeScreen() {
    val viewModel: ChatsViewModel = hiltViewModel()
    val state by viewModel.state.collectAsStateWithLifecycle()
    HomeContent(state)
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeContent(state: ChatsViewState) {
    val initialIndex = 0
    val pagerState = rememberPagerState(initialPage = initialIndex)
    val scope = rememberCoroutineScope()
    Column {
        AppbarComponent()

        TabsComponents(
            initialIndex = initialIndex,
            pagerState = pagerState,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }
        )

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            count = tabs.size,
            state = pagerState
        ) { page ->
            when (page) {
                0 -> ChatsScreen(state)
                1 -> StatusScreen()
                2 -> CallsScreen()
            }

        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}