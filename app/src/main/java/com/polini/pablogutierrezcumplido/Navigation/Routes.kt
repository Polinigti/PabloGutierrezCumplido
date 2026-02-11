package com.polini.pablogutierrezcumplido.Navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey{
    @Serializable
    data object Login : Routes()

    @Serializable
    data class Home(val email: String) : Routes()

    @Serializable
    data object NuevoJugador : Routes()

    @Serializable
    data object Error : Routes()
}