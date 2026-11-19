package com.example.AndroidPracticas.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.AndroidPracticas.R
import com.example.AndroidPracticas.ui.theme.Practica1Theme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1Theme {
        Greeting("Feliz Cumpleaños, Luisa!")
    }
}

@Composable
fun GreetingText(mensaje: String, nombre: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = mensaje,
            fontSize = 60.sp,
            lineHeight = 70.sp
        )

        Text(
            text = nombre,
            fontSize = 35.sp
        )
    }
}

@Composable
fun GreetingImage(mensaje: String, nombre: String, modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "Felicidades"
        )
        GreetingText(mensaje = mensaje, nombre = nombre, modifier = modifier)
    }
}
