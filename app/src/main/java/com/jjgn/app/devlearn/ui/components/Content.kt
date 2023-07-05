package com.jjgn.app.devlearn.ui.components

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjgn.app.devlearn.controller.AwaitController
import com.jjgn.app.devlearn.controller.AwaitScreenTransition
import com.jjgn.app.devlearn.controller.NvController
import com.jjgn.app.devlearn.ui.screens.AwaitScreen
import com.jjgn.app.devlearn.ui.theme.DevLearnTheme
import com.jjgn.app.devlearn.viewmodel.AppViewModel

/**
 * Funcion Composable donde se establece el contenido a mostrarse.
 * */
@Composable
fun Content() {
    // Se crea la instancia del ViewModel principal
    val viewModel = hiltViewModel<AppViewModel>()

    // Se obtiene el contexto actual para iniciar las funciones de restauracion, etc.
    val context = LocalContext.current
    viewModel.starter(context)

    val loading = remember { mutableStateOf(true) }
    AwaitController(loading)
    DevLearnTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AwaitScreenTransition(
                visible = loading, enter = fadeIn(animationSpec = tween(durationMillis = 1250))
            ) {
                NvController(
                    viewModel,
                    context
                )
            }
            if (loading.value) {
                AwaitScreen()
            }
        }
    }
}