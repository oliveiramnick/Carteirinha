package com.example.carteirinha.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinha.core.designsystem.navigation.AppNavHost


@Composable
fun App() {
    MaterialTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}