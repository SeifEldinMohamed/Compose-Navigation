package com.seif.composenavigation.presentation.navigation.nav_graph

//import android.util.Log
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.navArgument
//import com.seif.composenavigation.presentation.navigation.Screen
//import com.seif.composenavigation.presentation.screens.DetailsScreen
//import com.seif.composenavigation.presentation.screens.HomeScreen
//
//@Composable
//fun SetUpNavGraph(navController: NavHostController) {
//    NavHost(
//        navController = navController,
//        startDestination = Screen.Home.route
//    ) {
//        composable(
//            route = Screen.Home.route
//        ) {
//            HomeScreen(navController = navController)
//        }
//        composable(
//            route = Screen.Details.route,
//            arguments = listOf(
//                navArgument("id") {
//                    type = NavType.IntType
//                    defaultValue = 0 // for optional arguments
//                    //nullable = true
//                },
//                navArgument("name") {
//                    type = NavType.StringType
//                    nullable = true
//                },
////                navArgument("name") {
////                    type = NavType.StringType
////                }
//                )
//        ) {
//            Log.d("args", it.arguments?.getInt("id").toString())
//            Log.d("args", it.arguments?.getString("name").toString())
//            DetailsScreen(navController = navController)
//        }
//    }
//}
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.seif.composenavigation.presentation.navigation.HOME_GRAPH_ROUTE
import com.seif.composenavigation.presentation.navigation.ROOT_GRAPH_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}