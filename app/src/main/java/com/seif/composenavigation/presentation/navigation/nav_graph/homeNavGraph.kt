package com.seif.composenavigation.presentation.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.seif.composenavigation.presentation.navigation.DETAIL_ARGUMENT_KEY
import com.seif.composenavigation.presentation.navigation.DETAIL_ARGUMENT_KEY2
import com.seif.composenavigation.presentation.navigation.HOME_GRAPH_ROUTE
import com.seif.composenavigation.presentation.navigation.Screen
import com.seif.composenavigation.presentation.screens.DetailsScreen
import com.seif.composenavigation.presentation.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Stevdza-San"
                }
            )
        ) {
            DetailsScreen(navController = navController)
        }
    }
}