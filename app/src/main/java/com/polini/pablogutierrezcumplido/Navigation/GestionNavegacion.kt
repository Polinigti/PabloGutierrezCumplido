package com.polini.pablogutierrezcumplido.Navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.google.firebase.auth.FirebaseAuth
import com.polini.pablogutierrezcumplido.pantallas.PantHome
import com.polini.pablogutierrezcumplido.pantallas.PantLogin
import com.polini.pablogutierrezcumplido.pantallas.PantNuevoJugador

@Composable
fun GestionNavegacion(auth: FirebaseAuth) {

    val pilaNavegacion = rememberNavBackStack(Routes.Login)
    NavDisplay(
        backStack = pilaNavegacion,
        onBack = { pilaNavegacion.removeLastOrNull() },
        onNuevoJugador = {
            pilaNavegacion.clear()
            pilaNavegacion.add(Routes.NuevoJugador)
        },
        onAHome = {
            pilaNavegacion.clear()
            pilaNavegacion.add(Routes.Home)
        },
        entryProvider = { key ->
            when (key) {
                is Routes.Login -> NavEntry(key) {
                    PantLogin(
                        auth = auth,
                        onLoginSuccess = { email -> pilaNavegacion.add(Routes.Home(email)) }
                    )
                }

                is Routes.Home -> NavEntry(key) {
                    PantHome(
                        email = key.email,
                        onNuevoJugador = {
                            pilaNavegacion.clear()
                            pilaNavegacion.add(Routes.NuevoJugador)
                        }
                    )
                }

                is Routes.NuevoJugador -> NavEntry(key) {
                    PantNuevoJugador(
                        email = key.email,
                        onAHome = {
                            pilaNavegacion.clear()
                            pilaNavegacion.add(Routes.Home)
                        }
                    )
                }

                else -> NavEntry(key) {
                    Text("Error")
                }
            }
        }
    )
}
