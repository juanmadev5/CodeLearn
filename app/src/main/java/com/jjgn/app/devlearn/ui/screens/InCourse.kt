package com.jjgn.app.devlearn.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.ButtonController
import com.jjgn.app.devlearn.ui.components.InCourseContent
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun InCourseScreen(viewModel: AppViewModel, context: Context, navController: NavController) {
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
        context,
        navController
    )
    ButtonController(
        viewModel,
        buttonNextState,
        buttonPrevState
    )
}
