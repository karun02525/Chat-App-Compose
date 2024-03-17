package com.learn.navigationdemo.test

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationScreen() {
    val time = 500
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.screenA,
        enterTransition = {
            fadeIn(animationSpec = tween(time)) + slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, tween(time)
            )
        },
        exitTransition = {
            fadeOut(animationSpec = tween(time)) + slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, tween(time)
            )
        },

        popEnterTransition = {
            fadeIn(animationSpec = tween(time)) + slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, tween(time)
            )
        },
        popExitTransition = {
            fadeOut(animationSpec = tween(time)) + slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, tween(time)
            )
        }
    ) {

        composable(route = Routes.screenA) {
            ScreenA(navController)
        }
        composable(route = Routes.screenB + "/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(navController, name ?: "")
        }
        composable(route = Routes.screenC + "/{name}") {
            val name = it.arguments?.getString("name")
            ScreenC(navController, name ?: "")
        }

    }
}