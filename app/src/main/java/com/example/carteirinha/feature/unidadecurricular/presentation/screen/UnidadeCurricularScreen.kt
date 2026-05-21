package com.example.carteirinha.feature.unidadecurricular.presentation.screen

import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    UnidadeCurricularContent()
}