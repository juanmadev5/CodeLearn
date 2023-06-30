package com.jjgn.app.devlearn.data

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Current

fun getLangName(
    _currentState: MutableLiveData<Current>
): String {
    return when (_currentState.value) {
        is Current.PY -> "Python"
        is Current.KT -> "Kotlin"
        is Current.JV -> "Java"
        is Current.JS -> "Javascript"
        else -> "error"
    }
}