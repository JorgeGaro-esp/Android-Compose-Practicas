package com.example.AndroidPracticas.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.AndroidPracticas.data.Comunidad
import com.example.AndroidPracticas.data.listaComunidades
import com.example.AndroidPracticas.ui.theme.Practica1Theme

@Composable
fun TarjetaComunidad(comunidad: Comunidad, modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = comunidad.bandera),
                contentScale = ContentScale.Crop,
                contentDescription = "Bandera de ${comunidad.nombre}"
            )
            Column {
                Text(
                    text = comunidad.nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = comunidad.capital,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun MostrarComunidades(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            Text(
                text = "Lista de Comunidades",
                textAlign = TextAlign.Center,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.fillMaxWidth()
            )
        }
        items(listaComunidades) { comunidad ->
            TarjetaComunidad(comunidad)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComunidadesPreview() {
    Practica1Theme {
        MostrarComunidades(modifier = Modifier)
    }
}
