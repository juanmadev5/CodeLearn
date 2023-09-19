package com.jjgn.app.devlearn.view.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import com.jjgn.app.devlearn.view.ui.components.InCourseContent
import com.jjgn.app.devlearn.view.ui.controller.ButtonController

@Composable
fun InCourseScreen() {
    val buttonNextState = rememberSaveable {
        mutableStateOf(false)
    }
    val buttonPrevState = rememberSaveable {
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
