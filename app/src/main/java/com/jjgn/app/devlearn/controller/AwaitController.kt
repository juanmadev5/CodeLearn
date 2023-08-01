package com.jjgn.app.devlearn.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import kotlinx.coroutines.delay

/**
 * Muestra la pantalla de espera durante 700ms en lo que la aplicacion
 * carga los datos necesarios. Una vez pasado ese tiempo de espera
 * muestra el contenido.
 * */
@Composable
fun AwaitController(loading: MutableState<Boolean>) {
    LaunchedEffect(true) {
        delay(800)
        loading.value = false
    }
}