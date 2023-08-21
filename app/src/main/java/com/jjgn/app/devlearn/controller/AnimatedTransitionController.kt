package com.jjgn.app.devlearn.controller

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.jjgn.app.devlearn.data.awaitScreenTSetting

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
        enter = awaitScreenTSetting
    ) {
        content()
    }
}