package com.example.carteirinha

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.ui.theme.AppTheme

@Composable
fun LoginView(modifier : Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ){
        TextField(
            value = " ",
            onValueChange = {},
            label = {
                Text(text = "Login")
            },
        )
        TextField(
            value = " ",
            onValueChange = {},
            label = {
                Text(text = "E-mail")
            },
        )
        Button(
            onClick = { },
            modifier = Modifier
                .size(width = 300.dp, height = 48.dp),
            shape = RoundedCornerShape(9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
            border = BorderStroke(
                width = 2.dp,
                color = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text(text = "Entrar")
        }

    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginClaro(){
    AppTheme(darkTheme = false) {
        LoginView(modifier = Modifier
            .padding(16.dp)
            .fillMaxSize())
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginEscuro() {
    AppTheme(darkTheme = true) {
        LoginView(modifier = Modifier
            .padding(16.dp)
            .fillMaxSize())

    }
}