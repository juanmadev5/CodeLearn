package com.jjgn.app.devlearn.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun TextSizeState(zoomState: MutableState<Boolean>, txtSize: Int, delay: Long = 2800) {
    LaunchedEffect(true) {
        delay(delay)
        zoomState.value = false
    }
    if (zoomState.value) {

        Text(
            "Tamaño de letra $txtSize sp",
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}