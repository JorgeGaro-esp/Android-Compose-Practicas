package com.example.practica_1.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.res.painterResource
import com.example.practica_1.R
import kotlin.random.Random

@Composable
fun Dado(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var cara: MutableIntState = remember { mutableIntStateOf(0) }
        var imagen = remember {
            mutableListOf(
                R.drawable.dado_1,
                R.drawable.dado_2,
                R.drawable.dado_3,
                R.drawable.dado_4,
                R.drawable.dado_5,
                R.drawable.dado_6
            )
        }

        var imagendibujar = when (cara.value) {
        1 -> R.drawable.dado_1
        2 -> R.drawable.dado_2
        3 -> R.drawable.dado_3
        4 -> R.drawable.dado_4
        5 -> R.drawable.dado_5
        else -> R.drawable.dado_6
    }
        Image(
            painter = painterResource(id = imagendibujar),
            contentDescription = "Dado 1",
            modifier = Modifier.clickable { cara.value = Random.nextInt(1, 7) }
        )
        Button(onClick = { cara.value=Random.nextInt(1,7)}) {
            Text(text = "Púlsame")
        }
        Text(text = "Ha salido ${cara.value} ")
    }
}