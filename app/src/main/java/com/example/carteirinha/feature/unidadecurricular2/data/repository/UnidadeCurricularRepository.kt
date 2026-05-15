package com.example.carteirinha.feature.unidadecurricular2.data.repository

import com.example.carteirinha.feature.unidadecurricular2.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}