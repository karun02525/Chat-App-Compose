package com.learn.navigationdemo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.navigationdemo.R
import com.learn.navigationdemo.ui.theme.Gray
import com.learn.navigationdemo.ui.theme.White

@Composable
fun AppbarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp)
    ) {

        Text(
            text = "WhatApp",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color =  MaterialTheme.colorScheme.tertiary
            )
        )

        Spacer(modifier = Modifier.weight(1f))
        IconComponents(R.drawable.ic_camera)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponents(R.drawable.ic_search)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponents(R.drawable.ic_more)

    }
}


@Composable
fun IconComponents(
    drawableId: Int
) {
    Icon(
        painter = painterResource(id = drawableId),
        "Camera",
        tint = MaterialTheme.colorScheme.tertiary
    )
}


@Preview
@Composable
private fun AppBar() {
    AppbarComponent()
}