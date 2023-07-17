package com.jjgn.app.devlearn.viewmodel

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Funcion que permite acceder a una sola instancia del ViewModel al que se le
 * haga referencia.
 * */
@Composable
inline fun <reified VM : ViewModel> AccessInstance(): VM {
    val context = LocalContext.current
    return remember {
        ViewModelProvider(context as ComponentActivity)[VM::class.java]
    }
}