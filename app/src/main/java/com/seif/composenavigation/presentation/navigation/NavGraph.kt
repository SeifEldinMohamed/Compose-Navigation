package com.seif.composenavigation.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
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
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                },
                navArgument("name") {
                    type = NavType.StringType
                }
                )
        ) {
            Log.d("args", it.arguments?.getInt("id").toString())
            Log.d("args", it.arguments?.getString("name").toString())
            DetailsScreen(navController = navController)
        }
    }
}