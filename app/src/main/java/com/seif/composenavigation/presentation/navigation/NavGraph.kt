package com.seif.composenavigation.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.seif.composenavigation.presentation.screens.DetailsScreen
import com.seif.composenavigation.presentation.screens.HomeScreen

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route
        ){
            DetailsScreen(navController = navController)
        }
    }
}