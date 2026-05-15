package com.example.carteirinha.feature.unidadecurricular2.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.core.designsystem.theme.AppTheme
import com.example.carteirinha.feature.unidadecurricular2.domain.model.UnidadeCurricular
import com.example.carteirinha.feature.unidadecurricular2.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadesCurriculares :List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares) { uc ->
            UnidadeCurricularCard(unidadeCurricular = uc)
        }
    }
}
@Preview
@Composable
fun UnidadeCurricularContentPreview() {
    AppTheme {
        UnidadeCurricularContent(
            unidadesCurriculares = listOf(
                UnidadeCurricular(
                    id = "1",
                    nome = "Programação",
                    professor = "João",
                    nota1 = 8.0,
                    nota2 = 7.5,
                    media = 7.75,
                    faltas = 2
                ),
                UnidadeCurricular(
                    id = "2",
                    nome = "Banco de Dados",
                    professor = "Ana",
                    nota1 = 8.0,
                    nota2 = 7.5,
                    media = 7.75,
                    faltas = 2
                )
            )
        )
    }
}