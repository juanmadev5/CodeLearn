package com.jjgn.app.devlearn.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module

/**
 * Esta funcion recupera el total de paginas de cada modulo correspondiente a cada curso.
 * */
fun getTotalPages(
    currentState: MutableLiveData<Current>,
    currentMState: LiveData<Module>,
    cModulesTPages: MutableList<Int>
): Int {
    val pagesList = listOf(
        0, //

        // kotlin
        44, //1
        8, //2
        13, //3

        // java
        16, //4
        8, //5
        9, //6
        // javascript
        17, //7
        12, //8
        21, //9
        // python
        19, //10
        16, //11
        16 //12
    )
    when (currentState.value) {
        is Current.KT -> {
            cModulesTPages[0] = pagesList[1]
            cModulesTPages[1] = pagesList[2]
            cModulesTPages[2] = pagesList[3]
        }

        is Current.JV -> {
            cModulesTPages[3] = pagesList[4]
            cModulesTPages[4] = pagesList[5]
            cModulesTPages[5] = pagesList[6]
        }

        is Current.JS -> {
            cModulesTPages[6] = pagesList[7]
            cModulesTPages[7] = pagesList[8]
            cModulesTPages[8] = pagesList[9]
        }

        is Current.PY -> {
            cModulesTPages[9] = pagesList[10]
            cModulesTPages[10] = pagesList[11]
            cModulesTPages[11] = pagesList[12]
        }

        else -> {
            cModulesTPages[12]
        }
    }
    return when (currentState.value) {
        is Current.KT -> {
            when (currentMState.value) {
                is Module.KTM1 -> pagesList[1]
                is Module.KTM2 -> pagesList[2]
                is Module.KTM3 -> pagesList[3]
                else -> 1
            }
        }

        is Current.JV -> {
            when (currentMState.value) {
                is Module.JVM1 -> pagesList[4]
                is Module.JVM2 -> pagesList[5]
                is Module.JVM3 -> pagesList[6]
                else -> 1
            }
        }

        is Current.JS -> {
            when (currentMState.value) {
                is Module.JSM1 -> pagesList[7]
                is Module.JSM2 -> pagesList[8]
                is Module.JSM3 -> pagesList[9]
                else -> 1
            }
        }

        is Current.PY -> {
            when (currentMState.value) {
                is Module.PYM1 -> pagesList[10]
                is Module.PYM2 -> pagesList[11]
                is Module.PYM3 -> pagesList[12]
                else -> 1
            }
        }

        else -> 1
    }
}