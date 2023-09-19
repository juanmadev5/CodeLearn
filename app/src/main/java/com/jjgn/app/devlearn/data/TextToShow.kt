package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.data.course.jsCourse
import com.jjgn.app.devlearn.data.course.jvCourse
import com.jjgn.app.devlearn.data.course.ktCourse
import com.jjgn.app.devlearn.data.course.module.Module
import com.jjgn.app.devlearn.data.course.pyCourse
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Funcion encargada de establecer el texto en pantalla correspondiente al curso
 * seleccionado.
 * */
fun getTextToShow(
    currentState: MutableLiveData<Current>,
    currentPage: MutableState<Int>,
    currentMState: MutableStateFlow<Module>
): String {
    return when (currentState.value) {
        is Current.KT -> ktCourse(currentPage.value, currentMState)
        is Current.JV -> jvCourse(currentPage.value, currentMState)
        is Current.JS -> jsCourse(currentPage.value, currentMState)
        is Current.PY -> pyCourse(currentPage.value, currentMState)
        else -> ""
    }
}