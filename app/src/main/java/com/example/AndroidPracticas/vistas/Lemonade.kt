package com.example.AndroidPracticas.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.AndroidPracticas.R
import kotlin.random.Random


@Composable
fun Lemonade(modifier: Modifier = Modifier) {


    var paso by remember { mutableIntStateOf(1) }

    var pulsar by remember { mutableIntStateOf(0) }


    val imagen = when (paso) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    val texto = when (paso) {
        1 -> "Tap the lemon tree to select a lemon"
        2 -> "Keep tapping the lemon to squeeze it"
        3 -> "Tap the lemonade to drink it"
        else -> "Tap the empty glass to start again"
    }
    val descripcion = when (paso) {
        1 -> "Lemon tree"
        2 -> "Lemon"
        3 -> "Glass of lemonade"
        else -> "Empty glass"
    }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título arriba
        Text(
            text = "Lemonade",

            )


        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = imagen),
                contentDescription = descripcion,
                modifier = Modifier
                    .background(Color(173, 244, 230), RoundedCornerShape(40.dp))
                    .padding(horizontal = 16.dp, vertical = 24.dp)
                    .clickable {
                        when (paso) {
                            1 -> {
                                pulsar = Random.nextInt(2, 7) // 2..6 ambos incluidos
                                paso = 2
                            }

                            2 -> {
                                pulsar--
                                if (pulsar == 0) {
                                    paso = 3
                                }
                            }

                            3 -> paso = 4
                            else -> paso = 1
                        }
                    }

            )


            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = texto,
                fontSize = 18.sp
            )
        }
    }
}

