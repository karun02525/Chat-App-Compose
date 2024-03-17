package com.learn.navigationdemo.ui.screens.chats

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.navigationdemo.domain.model.ChatsModel
import com.learn.navigationdemo.ui.components.CircularCount
import com.learn.navigationdemo.ui.components.TextComponent
import com.learn.navigationdemo.ui.theme.LightGreen

@Composable
fun UserDetails(item: ChatsModel) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {

        MessageHeader(item)
        MessageSubSection(item)

    }
}

@Composable
fun MessageHeader(item: ChatsModel) {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = item.username,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
        TextComponent(
            value = item.message.timeStamp,
            fontSize = 11.sp,
            color = Color.Black.copy(0.76f),
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun MessageSubSection(item: ChatsModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            value = item.message.content,
            modifier = Modifier.weight(1f),
            fontSize = 14.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Normal
        )
        if(item.message.unreadCount !=null) {
            CircularCount(
                unreadCount = item.message.unreadCount.toString(),
                backgroundColor = LightGreen,
                textColor = Color.White
            )
        }
    }
}
