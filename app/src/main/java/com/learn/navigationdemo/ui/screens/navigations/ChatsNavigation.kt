package com.learn.navigationdemo.ui.screens.navigations

import ChatDetailsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learn.navigationdemo.ui.screens.navigations.NavigationRoutes.DetailsScreen
import com.learn.navigationdemo.ui.screens.navigations.NavigationRoutes.HomeScreen

@Composable
fun ChatsNavigation() {
    val navigator = rememberNavController()
    NavHost(navController = navigator, startDestination = HomeScreen) {
        composable(route = HomeScreen) {
            ChatDetailsScreen()
           // HomeScreen()
        }
        composable(route = DetailsScreen) {
            ChatDetailsScreen()
        }
    }
}
