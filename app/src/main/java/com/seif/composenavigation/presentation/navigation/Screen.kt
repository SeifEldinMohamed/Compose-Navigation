package com.seif.composenavigation.presentation.navigation


sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Details : Screen(route = "details_screen/{id}/{name}") {
        fun passId(id: Int): String {
            return "details_screen/$id"
        }
        fun passIdAndName(id: Int, name:String): String {
            return "details_screen/$id/$name"
        }
    }
}
