package com.lespsan543.cartas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lespsan543.cartas.Clases.Baraja
import com.lespsan543.cartas.Screens.Inicio

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Baraja.crearBaraja()
        Baraja.barajar()

        setContent {
            Inicio()
        }
    }
}
