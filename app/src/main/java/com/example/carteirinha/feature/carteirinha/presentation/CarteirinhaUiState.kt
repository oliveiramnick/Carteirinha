package com.example.carteirinha.feature.carteirinha.presentation

import com.example.carteirinha.feature.carteirinha.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)