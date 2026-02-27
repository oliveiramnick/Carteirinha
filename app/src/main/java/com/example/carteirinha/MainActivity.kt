package com.example.carteirinha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
    Box(){
        Image(
            painter = painterResource( R.drawable.wallpaper),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(.3f)
        )
        Column(modifier = modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp))
        {
            Image(
                painter = painterResource( R.drawable.img),
                contentDescription = null,
                modifier = Modifier.
                fillMaxWidth(.6f)
                    .background(color = Color.Blue)

            )
            Spacer(modifier = Modifier.weight(.3f)
            )
            Image(
                painter = painterResource( R.drawable.avatar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.
                weight(2f)
                    .fillMaxSize(.6f)
                    .aspectRatio(1f)
                    .clip(CircleShape)

            )
            Spacer(modifier = Modifier.height(16.dp))

            Row (
                modifier = Modifier
                    .weight(3f)
                    .fillMaxSize(.9f),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                Text(
                    text="Nome: ",
                    style= MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "Nicoly Machado",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    modifier = Modifier.weight(3f),
                    fontFamily = MaterialTheme.typography.titleLarge.fontFamily,
                    color = MaterialTheme.colorScheme.primary
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
                conteudo = "24247634"
            )

        }

    }

}

