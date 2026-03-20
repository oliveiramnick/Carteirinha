package com.example.carteirinha.core.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteirinha.feature.auth.presentation.LoginScreen
import com.example.carteirinha.feature.screen.CarteirinhaScreen
import com.example.carteirinha.feature.screen.HomeScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }
        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(Routes.Home.route) {
            HomeScreen(
                navController = navController
            )
        }
    }
}