package com.polini.pablogutierrezcumplido

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.polini.pablogutierrezcumplido.pantallas.PantLogin
import com.polini.pablogutierrezcumplido.pantallas.PantNuevoJugador
import com.polini.pablogutierrezcumplido.ui.theme.PabloGutierrezCumplidoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PabloGutierrezCumplidoTheme {
                PantNuevoJugador()
            }
        }
    }
}