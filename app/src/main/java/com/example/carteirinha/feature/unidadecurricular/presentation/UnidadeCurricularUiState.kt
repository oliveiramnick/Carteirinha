package com.example.carteirinha.feature.unidadecurricular.presentation

import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading : Boolean = false,
    val unidadesCurriculares : List<UnidadeCurricular> = emptyList(),
    val errorMessage : String? = null
)

