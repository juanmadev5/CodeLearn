package com.jjgn.app.devlearn.controller


import android.annotation.SuppressLint
import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.system.exitProcess

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BackHandlerController(
    isEnabled: Boolean,
    snackbarHostState: SnackbarHostState
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    var c by remember { mutableStateOf(0) }
    BackHandler(enabled = isEnabled) {
        c += 1
        if (c == 1) {
            coroutineScope.launch {
                // se invoca el snackbar con el mensaje
                snackbarHostState.showSnackbar("Presione dos veces para salir")
                delay(2000) // Mostrar Snackbar durante 2 segundos
                snackbarHostState.currentSnackbarData?.dismiss()
                c = 0 // Reinicia el contador después de 2 segundos
            }
        } else if (c == 2) {
            coroutineScope.launch {
                // Finaliza todas las actividades y cierra la aplicación
                withContext(Dispatchers.IO) {
                    snackbarHostState.currentSnackbarData?.dismiss()
                    val currentActivity = context as? Activity
                    currentActivity?.finishAffinity()
                }
                exitProcess(0)
            }
        }
    }
}
