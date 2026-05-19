package com.example.carteirinha.core.session

data class LoggedUser(
    val id: String,
    val nome: String,
    val descricao: String = "Aluno logado",
    val token: String
)