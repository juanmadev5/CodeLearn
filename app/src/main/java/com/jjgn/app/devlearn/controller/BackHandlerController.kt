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
import androidx.compose.ui.res.stringResource
import com.jjgn.app.devlearn.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.system.exitProcess

/**
 * Esta funcion se encarga de avisarle al usuario que debe apretar retroceder
 * dos veces para cerrar la aplicacion y cerrar de forma segura
 * la aplicacion al apretar retroceder dos veces.
 * */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BackHandlerController(
    isEnabled: Boolean,
    snackbarHostState: SnackbarHostState
) {
    val msg = stringResource(R.string.pressTwice)
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    var c by remember { mutableStateOf(0) }
    BackHandler(enabled = isEnabled) {
        c += 1
        if (c == 1) {
            coroutineScope.launch {
                snackbarHostState.showSnackbar(msg)
                delay(1500)
                snackbarHostState.currentSnackbarData?.dismiss()
                c = 0
            }
        } else if (c == 2) {
            coroutineScope.launch {
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
