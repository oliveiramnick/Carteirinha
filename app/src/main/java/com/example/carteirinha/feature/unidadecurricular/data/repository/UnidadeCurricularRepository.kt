package com.example.carteirinha.feature.unidadecurricular.data.repository

import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}