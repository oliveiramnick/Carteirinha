package com.example.carteirinha.feature.auth.domain.model

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val token: String
)