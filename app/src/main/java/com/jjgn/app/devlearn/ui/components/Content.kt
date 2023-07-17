package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.jjgn.app.devlearn.controller.AwaitController
import com.jjgn.app.devlearn.controller.AwaitScreenTransition
import com.jjgn.app.devlearn.controller.NvController
import com.jjgn.app.devlearn.ui.screens.AwaitScreen
import com.jjgn.app.devlearn.ui.theme.DevLearnTheme
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

/**
 * Funcion Composable donde se establece el contenido a mostrarse.
 * */
@Composable
fun Content(
    viewModel: AppViewModel = AccessInstance(),
    loading: MutableState<Boolean> = remember { mutableStateOf(true) },
) {
    viewModel.starter(LocalContext.current)
    AwaitController(loading)
    DevLearnTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AwaitScreenTransition(visible = loading) {
                NvController()
            }
            if (loading.value) {
                AwaitScreen()
            }
        }
    }
}