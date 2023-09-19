package com.jjgn.app.devlearn.data

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.data.course.Current

/**
 * Esta funcion se encarga de retornar el nombre del lenguaje a mostrar en Home
 * de acuerdo al curso seleccionado
 * */
fun getLangName(
    currentState: MutableLiveData<Current>
): String {
    return when (currentState.value) {
        is Current.PY -> "Python"
        is Current.KT -> "Kotlin"
        is Current.JV -> "Java"
        is Current.JS -> "Javascript"
        else -> "error"
    }
}