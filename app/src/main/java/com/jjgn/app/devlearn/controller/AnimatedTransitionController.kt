package com.jjgn.app.devlearn.controller

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

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