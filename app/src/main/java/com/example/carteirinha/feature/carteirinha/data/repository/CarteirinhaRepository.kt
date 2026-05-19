package com.example.carteirinha.feature.carteirinha.data.repository

import com.example.carteirinha.core.designsystem.navigation.Routes
import com.example.carteirinha.feature.carteirinha.domain.model.Carteirinha

interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Carteirinha>
}