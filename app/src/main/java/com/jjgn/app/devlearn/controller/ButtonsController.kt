package com.jjgn.app.devlearn.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import com.jjgn.app.devlearn.viewmodel.AppViewModel

/**
 * Controla el estado de las paginas, si esta en la primera pagina bloquea
 * el boton de retroceder o si esta en la ultima pagina cambia el
 * texto de "siguiente" a "finalizar".
 * */
@Composable
fun ButtonController(
    viewModel: AppViewModel,
    buttonNextState: MutableState<Boolean>,
    buttonPrevState: MutableState<Boolean>
) {
    LaunchedEffect(viewModel.cPageValue) {
        viewModel.cPageValue.collect { currentPage ->
            buttonNextState.value = currentPage < viewModel.tlPages
            buttonPrevState.value = currentPage > 1
        }
    }
}