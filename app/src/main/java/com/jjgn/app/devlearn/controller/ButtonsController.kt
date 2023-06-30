package com.jjgn.app.devlearn.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun ButtonController(
    viewModel: AppViewModel,
    buttonNextState: MutableState<Boolean>,
    buttonPrevState: MutableState<Boolean>
) {
    LaunchedEffect(viewModel.currentPageValue) {
        viewModel.currentPageValue.collect { currentPage ->
            buttonNextState.value = currentPage < viewModel.totalPages
            buttonPrevState.value = currentPage > 1
        }
    }
}