package com.example.carteirinha.core.navigation

sealed class Routes(val route : String) {
    data object Login : Routes ("Login")

    data object  Home : Routes ("Home")
    data object Carteirinha : Routes("carteirinha")
}