package com.learn.navigationdemo.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.learn.navigationdemo.domain.model.TabData
import com.learn.navigationdemo.domain.model.tabs
import com.learn.navigationdemo.ui.components.CircularCount
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsComponents(
    initialIndex: Int = 0,
    pagerState: PagerState,
    onTabSelected: (Int) -> Unit
) {
    var selectedIndex by remember {
        mutableIntStateOf(initialIndex)
    }

    LaunchedEffect(pagerState) {
        snapshotFlow {
            pagerState.currentPage
        }.collectLatest { page ->
            selectedIndex = page
            onTabSelected(selectedIndex)
        }
    }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp
            )
        }
    ) {
        tabs.forEachIndexed { index, tabData ->
            Tab(selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                    onTabSelected(selectedIndex)
                },
                text = {
                    TabContent(tabData)
                }
            )
        }

    }
}


@Composable
fun TabContent(tabData: TabData) {
    if (tabData.unreadCount == null) {
        TabTitle(tabData.title)
    } else {
        TabUnReadCount(tabData)
    }
}

@Composable
fun TabTitle(
    title: String
) {
    Text(
        text = title, style = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,

            )
    )
}

@Composable
fun TabUnReadCount(tabData: TabData) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TabTitle(tabData.title)
        tabData.unreadCount.also { unreadCount ->
            CircularCount(
                unreadCount = unreadCount.toString(),
                backgroundColor = MaterialTheme.colorScheme.background,
                textColor = MaterialTheme.colorScheme.primary
            )
        }
    }
}