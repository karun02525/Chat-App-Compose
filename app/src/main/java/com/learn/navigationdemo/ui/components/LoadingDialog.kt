package com.learn.navigationdemo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun LoadingDialog(
    isLoading:Boolean
) {
    if(isLoading){
        Dialog(onDismissRequest = { },
            properties = DialogProperties(dismissOnClickOutside = false)
        ) {
           Box(
               modifier = Modifier
                   .size(120.dp)
                   .clip(RoundedCornerShape(15.dp))
                   .background(Color.White),
               contentAlignment = Alignment.Center
           )
            {
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally,
                   verticalArrangement = Arrangement.Center
               ) {
                   CircularProgressIndicator(modifier = Modifier.padding(10.dp))
                   Text(text = "Loading...")
               }

           }
        }
    }
}