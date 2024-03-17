package com.learn.navigationdemo.ui.screens.chat_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.learn.navigationdemo.R
import com.learn.navigationdemo.ui.components.TextComponent
import com.learn.navigationdemo.ui.screens.chats.UserImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsTopBar(
    onProfileClick: () -> Unit,
    onVideoClick: () -> Unit,
    onCallClick: () -> Unit,
    onMoreClick: () -> Unit,
    onBackClick: () -> Unit
) {

    TopAppBar(
        title = {},
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.White,
        ),
        navigationIcon = {

            Row(
                modifier = Modifier
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "Back",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clickable { onBackClick() },
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.tertiary)
                )
                UserImage("https://i.pinimg.com/736x/d2/f3/7c/d2f37c23b81f1c2569a5acd5afa60969.jpg",
                    modifier = Modifier.clickable { onBackClick() }
                )
                TextComponent(value = "Priya", modifier = Modifier
                    .clickable { onProfileClick() }
                    .padding(start = 5.dp))
            }
        },
        actions = {
            IconButton(onClick = onVideoClick) {
                Icon(
                    painterResource(id = R.drawable.ic_cast),
                    "back",
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
            IconButton(onClick = onCallClick) {
                Icon(
                    painterResource(id = R.drawable.ic_call),
                    "back",
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
            IconButton(onClick = onMoreClick) {
                Icon(
                    painterResource(id = R.drawable.ic_more), "back",
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
        }

    )

}