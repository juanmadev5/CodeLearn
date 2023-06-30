package com.jjgn.app.devlearn.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import kotlinx.coroutines.flow.MutableStateFlow

fun getTotalPages(
    _currentState: MutableLiveData<Current>,
    currentMState: LiveData<Module>,
    ktm1: MutableStateFlow<Int>,
    ktm2: MutableStateFlow<Int>,
    ktm3: MutableStateFlow<Int>,
    jvm1: MutableStateFlow<Int>,
    jvm2: MutableStateFlow<Int>,
    jvm3: MutableStateFlow<Int>,
    jsm1: MutableStateFlow<Int>,
    jsm2: MutableStateFlow<Int>,
    jsm3: MutableStateFlow<Int>,
    pym1: MutableStateFlow<Int>,
    pym2: MutableStateFlow<Int>,
    pym3: MutableStateFlow<Int>
): Int {
    when (_currentState.value) {
        is Current.KT -> {
            ktm1.value = 45
            ktm2.value = 9
            ktm3.value = 14
        }
        is Current.JV -> {
            jvm1.value = 30
            jvm2.value = 30
            jvm3.value = 30
        }
        is Current.JS -> {
            jsm1.value = 30
            jsm2.value = 30
            jsm3.value = 30
        }
        is Current.PY -> {
            pym1.value = 30
            pym2.value = 30
            pym3.value = 30
        }
        else -> {

        }
    }
    return when (_currentState.value) {
        is Current.KT -> {
            when (currentMState.value) {
                is Module.KTM1 -> 45
                is Module.KTM2 -> 9
                is Module.KTM3 -> 14
                else -> 1
            }
        }
        is Current.JV -> {
            when (currentMState.value) {
                is Module.JVM1 -> 30
                is Module.JVM2 -> 30
                is Module.JVM3 -> 30
                else -> 1
            }
        }
        is Current.JS -> {
            when (currentMState.value) {
                is Module.JSM1 -> 30
                is Module.JSM2 -> 30
                is Module.JSM3 -> 30
                else -> 1
            }
        }
        is Current.PY -> {
            when (currentMState.value) {
                is Module.PYM1 -> 30
                is Module.PYM2 -> 30
                is Module.PYM3 -> 30
                else -> 1
            }
        }
        else -> 1
    }
}