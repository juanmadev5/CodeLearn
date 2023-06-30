package com.jjgn.app.devlearn.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import kotlinx.coroutines.delay

@Composable
fun AwaitController(loading: MutableState<Boolean>) {
    LaunchedEffect(true) {
        delay(700)
        loading.value = false
    }
}