package com.jjgn.app.devlearn.data

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.courses.jsCourse
import com.jjgn.app.devlearn.courses.jvCourse
import com.jjgn.app.devlearn.courses.ktCourse
import com.jjgn.app.devlearn.courses.pyCourse
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import kotlinx.coroutines.flow.MutableStateFlow

fun getTextToShow(
    _currentState: MutableLiveData<Current>,
    _currentPage: MutableStateFlow<Int>,
    _currentMState: MutableLiveData<Module>
): String {
    return when (_currentState.value) {
        is Current.KT -> ktCourse(_currentPage.value, _currentMState)
        is Current.JV -> jvCourse(_currentPage.value, _currentMState)
        is Current.JS -> jsCourse(_currentPage.value, _currentMState)
        is Current.PY -> pyCourse(_currentPage.value, _currentMState)
        else -> ""
    }
}