package com.example.carteirinha

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode


@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {
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
                LabelText(
                    "Nome: ",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value ="Nicoly Machado",
                    modifier = Modifier.weight(4f),
                )

            }

            Spacer(modifier = Modifier.height(8.dp))

            Row (
                modifier = Modifier
                    .weight(6f)
                    .fillMaxWidth(.9f),
                verticalAlignment = Alignment.CenterVertically,
            )
            {

                LabelText(
                    "Curso: ",
                    modifier = Modifier.weight(1f)
                )

                ValueText(
                    value = "Técnico Desenvolvimento de Sistemas",
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(4f)
                )

            }
            QrCode(
                conteudo = "24247634"
            )

        }
    }
}