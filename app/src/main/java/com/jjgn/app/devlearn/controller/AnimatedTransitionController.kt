package com.jjgn.app.devlearn.controller

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

/**
 * Cuando el tiempo de espera ya paso, muestra el contenido
 * aplicando una transicion suave.
 * */
@Composable
fun AwaitScreenTransition(
    visible: MutableState<Boolean>,
    content: @Composable () -> Unit
) {
    AnimatedVisibility(
        visible = !visible.value,
        enter = fadeIn(animationSpec = tween(durationMillis = 1250))
    ) {
        content()
    }
}