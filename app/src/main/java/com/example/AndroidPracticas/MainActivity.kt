package com.example.AndroidPracticas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.AndroidPracticas.ui.theme.Practica1Theme
import com.example.AndroidPracticas.vistas.Lemonade

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*GreetingImage(
                        mensaje="Feliz Cumpleaños, Luisa!",
                        nombre="From Mario",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    Lemonade(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
