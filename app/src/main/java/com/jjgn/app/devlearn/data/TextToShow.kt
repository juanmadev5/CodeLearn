package com.jjgn.app.devlearn.data

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.courses.jsCourse
import com.jjgn.app.devlearn.courses.jvCourse
import com.jjgn.app.devlearn.courses.ktCourse
import com.jjgn.app.devlearn.courses.pyCourse
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Funcion encargada de establecer el texto en pantalla correspondiente al curso
 * seleccionado.
 * */
fun getTextToShow(
    currentState: MutableLiveData<Current>,
    currentPage: MutableStateFlow<Int>,
    currentMState: MutableLiveData<Module>
): String {
    return when (currentState.value) {
        is Current.KT -> ktCourse(currentPage.value, currentMState)
        is Current.JV -> jvCourse(currentPage.value, currentMState)
        is Current.JS -> jsCourse(currentPage.value, currentMState)
        is Current.PY -> pyCourse(currentPage.value, currentMState)
        else -> ""
    }
}