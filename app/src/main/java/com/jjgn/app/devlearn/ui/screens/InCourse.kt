package com.jjgn.app.devlearn.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jjgn.app.devlearn.controller.ButtonController
import com.jjgn.app.devlearn.ui.components.InCourseContent

@Composable
fun InCourseScreen() {
    val buttonNextState = remember {
        mutableStateOf(false)
    }
    val buttonPrevState = remember {
        mutableStateOf(false)
    }
    InCourseContent(
        buttonNextState.value,
        buttonPrevState.value,
    )
    ButtonController(
        buttonNextState,
        buttonPrevState
    )
}
