package com.learn.navigationdemo.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    value: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit=16.sp,
    color: Color= Color.White,
    fontWeight: FontWeight=FontWeight.SemiBold

) {
    Text(
        modifier = modifier,
        text = value,
        style = TextStyle(
            fontSize = fontSize,
            fontWeight =fontWeight,
            color = color
        )
    )
}