package com.example.carteirinha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinha.ui.theme.AppTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppTheme() {
                Scaffold { innerPadding ->
                    CarteirinhaDeEstudante(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable

fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Image(

            painter = painterResource(id = R.drawable.img),

            contentDescription = null,

            modifier = Modifier.size(200.dp)

        )

        Spacer(modifier = Modifier.height(16.dp))

        Row {

            Text(

                text = "Nome: ",

                fontSize = 25.sp,

                style = MaterialTheme.typography.bodyMedium

            )

            Text(

                text = "Nicoly Machado",

                fontSize = 25.sp,

                style = MaterialTheme.typography.bodyLarge

            )

        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {

            Text(

                text = "Curso: ",

                fontSize = 20.sp,

                style = MaterialTheme.typography.bodyMedium

            )

            Text(

                text = "Desenvolvimento de Sistemas",

                fontSize = 20.sp,

                style = MaterialTheme.typography.bodyLarge

            )

        }
        QrCode(
            conteudo = "4242655"
        )

    }

}

