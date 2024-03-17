package com.learn.navigationdemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learn.navigationdemo.test.NavigationScreen
import com.learn.navigationdemo.test.Routes.screenA
import com.learn.navigationdemo.test.Routes.screenB
import com.learn.navigationdemo.test.Routes.screenC
import com.learn.navigationdemo.test.ScreenA
import com.learn.navigationdemo.test.ScreenB
import com.learn.navigationdemo.test.ScreenC
import com.learn.navigationdemo.ui.screens.HomeScreen
import com.learn.navigationdemo.ui.screens.navigations.ChatsNavigation
import com.learn.navigationdemo.ui.theme.WhatAppUITheme
import com.learn.navigationdemo.util.Event
import com.learn.navigationdemo.util.EventBus
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatAppUITheme {
                val lifecycle = LocalLifecycleOwner.current.lifecycle
                LaunchedEffect(key1 = lifecycle) {
                    repeatOnLifecycle(state = Lifecycle.State.STARTED ){
                        EventBus.events.collect{ event->
                            if(event is Event.Toast){
                                Toast.makeText(this@MainActivity, event.message, Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
                ChatsNavigation()
            }
        }
    }
}

