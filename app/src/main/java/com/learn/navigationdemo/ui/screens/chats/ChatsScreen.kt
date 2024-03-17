package com.learn.navigationdemo.ui.screens.chats

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.learn.navigationdemo.domain.model.ChatsModel
import com.learn.navigationdemo.ui.components.ChatsViewState
import com.learn.navigationdemo.ui.components.LoadingDialog

@Composable
fun ChatsScreen(state: ChatsViewState) {
    LoadingDialog(isLoading = state.loading)
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(state.chats) {
            ChatListItem(it)
        }
    }
}

@Composable
fun ChatListItem(item: ChatsModel) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
    ) {
        UserImage(item.userImage)
        UserDetails(item)
    }
}