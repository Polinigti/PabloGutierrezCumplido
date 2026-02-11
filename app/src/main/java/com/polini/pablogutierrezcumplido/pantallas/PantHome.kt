package com.polini.pablogutierrezcumplido.pantallas


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import com.polini.pablogutierrezcumplido.Elementos.TarjetaJugador

@Composable
fun PantHome(email: String, onNuevoJugador: () -> Unit){
    Column {
        Button(
            onClick = { onNuevoJugador() },
        ) {
            Text("Nuevo Jugador")
        }
        TarjetaJugador()
    }

}