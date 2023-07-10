package com.jjgn.app.devlearn.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module

/**
 * Se recupera el total de paginas de cada modulo correspondiente a cada curso.
 * */
fun getTotalPages(
    _currentState: MutableLiveData<Current>,
    currentMState: LiveData<Module>,
    cModulesTPages: MutableList<Int>
): Int {
    when (_currentState.value) {
        is Current.KT -> {
            cModulesTPages[0] = 45
            cModulesTPages[1] = 9
            cModulesTPages[2] = 14
        }
        is Current.JV -> {
            cModulesTPages[3] = 30
            cModulesTPages[4] = 30
            cModulesTPages[5] = 30
        }
        is Current.JS -> {
            cModulesTPages[6] = 30
            cModulesTPages[7] = 30
            cModulesTPages[8] = 30
        }
        is Current.PY -> {
            cModulesTPages[9] = 30
            cModulesTPages[10] = 30
            cModulesTPages[11] = 30
        }
        else -> {
            cModulesTPages[12]
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