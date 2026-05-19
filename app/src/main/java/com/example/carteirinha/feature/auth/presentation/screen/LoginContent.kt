package com.example.carteirinha.feature.auth.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.R

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    LoginContent(
        modifier = modifier,
        login = login,
        senha = senha,
        onLoginChange = { login = it },
        onSenhaChange = { senha = it },
        onLoginClick = {
            println("Login: $login")
            println("Senha: $senha")
        }
    )
}

@Composable
fun LoginContent(
    modifier: Modifier = Modifier,
    login: String,
    senha: String,
    onLoginChange: (String) -> Unit,
    onSenhaChange: (String) -> Unit,
    onLoginClick: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {

        TextField(
            value = login,
            onValueChange = onLoginChange,
            label = {
                Text(stringResource(R.string.login))
            }
        )

        TextField(
            value = senha,
            onValueChange = onSenhaChange,
            label = {
                Text(text = "Senha")
            }
        )

        Button(
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth(0.6f),
            shape = RoundedCornerShape(9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
            border = BorderStroke(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary
            )
        ) {

            Text(
                text = "Entrar",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginScreen() {

    MaterialTheme {

        Surface {

            LoginScreen()
        }
    }
}