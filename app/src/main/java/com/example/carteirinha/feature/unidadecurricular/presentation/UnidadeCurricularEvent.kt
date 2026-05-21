package com.example.carteirinha.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object OnTentarNovamente : UnidadeCurricularEvent
    data object OnVoltarClick : UnidadeCurricularEvent
}