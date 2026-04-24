package com.example.carteirinha.feature.auth.presentation

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.R
import com.example.carteirinha.core.designsystem.theme.AppTheme

@Composable
fun LoginContent(
    modifier: Modifier = Modifier,
    login: String = "",
    senha: String = "",
    onLoginChange: (String) -> Unit = {},
    onSenhaChange: (String) -> Unit ={},
    onLoginClick: () -> Unit = {}
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
        var login2 by remember { mutableStateOf("") }

        TextField(
            value = login2,
            onValueChange = {login2 += it},
            label = {
                Text(stringResource(R.string.login))
            }
        )

        TextField(
            value = senha,
            onValueChange = onSenhaChange,
            label = {
                Text("Senha")
            }
        )

        Button(
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth(0.6f),
            shape = RoundedCornerShape(size = 9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.primary
            )
        ) {
            Text("Entrar")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginContentClaro() {
    AppTheme(darkTheme = false) {
        LoginContent( )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginContentEscuro() {
    AppTheme(darkTheme = true) {
        LoginContent( )
    }
}