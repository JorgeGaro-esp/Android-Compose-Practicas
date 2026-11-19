package com.example.practica_1.vistas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Pulsador(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var contador: MutableIntState = remember { mutableIntStateOf(0) }
        Text(text = "Se ha pulsado ${contador.value} veces")
        Button(onClick = { contador.value++ }) {
            Text(text = "Púlsame")
        }
    }
}