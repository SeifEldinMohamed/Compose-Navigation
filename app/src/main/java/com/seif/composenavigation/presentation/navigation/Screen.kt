package com.seif.composenavigation.presentation.navigation

const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Details : Screen(route = "details_screen?id={id}&name={name}"){
        fun passId(id: Int = 0): String {
            return "details_screen?id=$id"
        }
        fun passIdAndName(id: Int = 0, name:String? = null): String {
            return "details_screen?id=$id&name=$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
 // required arguments
//    object Details : Screen(route = "details_screen/{id}/{name}") {
//        fun passId(id: Int): String {
//            return "details_screen/$id"
//        }
//        fun passIdAndName(id: Int, name:String): String {
//            return "details_screen/$id/$name"
//        }
//    }
}

// "/{name}" : mandatory argument
// "?name={name}" : optional argument if we didn't pass something it will take the default value
