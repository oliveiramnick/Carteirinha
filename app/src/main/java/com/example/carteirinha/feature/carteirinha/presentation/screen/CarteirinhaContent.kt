package com.example.carteirinha.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinha.R
import com.example.carteirinha.feature.carteirinha.presentation.CarteirinhaEvent
import com.example.carteirinha.feature.carteirinha.presentation.CarteirinhaUiState
import com.example.carteirinha.feature.carteirinha.domain.model.Carteirinha
data class Carteirinha(
    val nome: String,
    val curso: String,
    val turma: String,
    val matricula: String,
    val unidade: String,
    val status: String,
    val qrCodeContent: String
)

@Composable
fun CarteirinhaContent(
    uiState: CarteirinhaUiState,
    onEvent: (CarteirinhaEvent) -> Unit,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.wallpaper),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.7f)
        )

        when {

            uiState.isLoading -> {

                Column(
                    modifier = Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    CircularProgressIndicator()

                    Text(
                        text = "Buscando dados da carteirinha..."
                    )
                }
            }

            uiState.errorMessage != null -> {

                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = uiState.errorMessage,
                        color = MaterialTheme.colorScheme.error
                    )

                    Button(
                        onClick = {
                            onEvent(
                                CarteirinhaEvent.OnTentarNovamenteClick
                            )
                        }
                    ) {

                        Text("Tentar novamente")
                    }
                }
            }

            uiState.carteirinha != null -> {

                CarteirinhaDadosContent(
                    carteirinha = uiState.carteirinha,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
private fun CarteirinhaDadosContent(
    carteirinha: Carteirinha,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .safeDrawingPadding()
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Image(
            painter = painterResource(id = R.drawable.senailogo),
            contentDescription = "Logo do SENAI São Paulo",
            modifier = Modifier.fillMaxWidth(0.6f)
        )

        PerfilAluno(
            nome = carteirinha.nome,
            curso = carteirinha.curso,
            turma = carteirinha.turma,
            matricula = carteirinha.matricula,
            unidade = carteirinha.unidade,
            status = carteirinha.status,
            modifier = Modifier.fillMaxWidth(0.9f)
        )

        QrCode(
            conteudo = carteirinha.qrCodeContent,
            modifier = Modifier.fillMaxWidth(0.6f)
        )
    }
}

@Composable
fun PerfilAluno(
    nome: String,
    curso: String,
    turma: String,
    matricula: String,
    unidade: String,
    status: String,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.9f)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text(
                text = nome,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(text = "Curso: $curso")
            Text(text = "Turma: $turma")
            Text(text = "Matrícula: $matricula")
            Text(text = "Unidade: $unidade")
            Text(text = "Status: $status")
        }
    }
}

@Composable
fun QrCode(
    conteudo: String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = conteudo,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewClaro() {

    MaterialTheme {

        CarteirinhaContent(
            uiState = CarteirinhaUiState(
                carteirinha = Carteirinha(
                    nome = "Nicoly Machado",
                    curso = "Técnico em Desenvolvimento de Sistemas",
                    turma = "4DEVM-T1",
                    matricula = "20260001",
                    unidade = "SENAI Anchieta",
                    status = "Ativo",
                    qrCodeContent = "20260001"
                )
            ),
            onEvent = {}
        )
    }
}