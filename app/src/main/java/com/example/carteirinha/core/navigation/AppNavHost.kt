package com.example.carteirinha.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.carteirinha.feature.carteirinha.presentation.CarteirinhaView

@Composable
fun AppNavHost(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startdestination = Routes.Home.route
    ){
        composable(Routes.Login.route){

        }
        composable(Routes.Home.route){

        }
    }
}