package com.jjgn.app.devlearn.controller

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

/**
 * Cuando el tiempo de espera ya paso, muestra el contenido
 * aplicando una transicion suave.
 * */
@Composable
fun AwaitScreenTransition(
    visible: MutableState<Boolean>,
    enter: EnterTransition,
    content: @Composable () -> Unit
) {
    AnimatedVisibility(
        visible = !visible.value,
        enter = enter
    ) {
        content()
    }
}