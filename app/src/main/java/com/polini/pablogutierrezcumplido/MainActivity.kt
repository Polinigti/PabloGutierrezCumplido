package com.polini.pablogutierrezcumplido

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.google.firebase.auth.FirebaseAuth
import com.polini.pablogutierrezcumplido.Navigation.GestionNavegacion
import com.polini.pablogutierrezcumplido.pantallas.PantLogin
import com.polini.pablogutierrezcumplido.pantallas.PantNuevoJugador
import com.polini.pablogutierrezcumplido.ui.theme.PabloGutierrezCumplidoTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PabloGutierrezCumplidoTheme {
                val auth = FirebaseAuth.getInstance()
                GestionNavegacion(auth = auth)
            }
        }
    }
}