package com.polini.pablogutierrezcumplido.pantallas

import android.content.ClipData
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.polini.pablogutierrezcumplido.Elementos.TarjetaJugador

@Composable
fun PantHome(email: String, onLogout: () -> Unit){
    Column {
        Button(
            onClick = {}
            }
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text(text = "Login",  fontSize = 18.sp)
        }
    }

}