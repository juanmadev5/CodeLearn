package com.jjgn.app.devlearn.view.ui.controller


import android.annotation.SuppressLint
import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewModelScope
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
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
    snackbarHostState: SnackbarHostState,
    appViewModel: AppViewModel = AccessInstance()
) {
    val msg = stringResource(R.string.pressTwice)
    val context = LocalContext.current
    var c by remember { mutableIntStateOf(0) }
    BackHandler(enabled = isEnabled) {
        c += 1
        if (c == 1) {
            appViewModel.viewModelScope.launch {
                snackbarHostState.showSnackbar(msg)
                delay(App.BACKHANDLER_DELAY)
                snackbarHostState.currentSnackbarData?.dismiss()
                c = 0
            }
        } else if (c == 2) {
            appViewModel.viewModelScope.launch {
                appViewModel.dataSaver()
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
