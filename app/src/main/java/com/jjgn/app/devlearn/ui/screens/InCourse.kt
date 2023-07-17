package com.jjgn.app.devlearn.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jjgn.app.devlearn.controller.ButtonController
import com.jjgn.app.devlearn.ui.components.InCourseContent
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@Composable
fun InCourseScreen(
    viewModel: AppViewModel,
    testViewModel: TestViewModel
) {
    val buttonNextState = remember {
        mutableStateOf(false)
    }
    val buttonPrevState = remember {
        mutableStateOf(false)
    }
    InCourseContent(
        viewModel,
        buttonNextState.value,
        buttonPrevState.value,
        testViewModel
    )
    ButtonController(
        viewModel,
        buttonNextState,
        buttonPrevState
    )
}
