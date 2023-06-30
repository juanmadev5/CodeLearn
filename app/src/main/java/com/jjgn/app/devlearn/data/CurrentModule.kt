package com.jjgn.app.devlearn.data

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module

fun getCurrentModule(
    moduleSelected: Int,
    _currentState: MutableLiveData<Current>,
    _currentMState: MutableLiveData<Module>
) {
    val currentModule = when (moduleSelected) {
        1 -> {
            when (_currentState.value) {
                Current.KT -> Module.KTM1
                Current.JV -> Module.JVM1
                Current.JS -> Module.JSM1
                Current.PY -> Module.PYM1
                else -> Module.NM
            }
        }

        2 -> {
            when (_currentState.value) {
                Current.KT -> Module.KTM2
                Current.JV -> Module.JVM2
                Current.JS -> Module.JSM2
                Current.PY -> Module.PYM2
                else -> Module.NM
            }
        }

        else -> {
            when (_currentState.value) {
                Current.KT -> Module.KTM3
                Current.JV -> Module.JVM3
                Current.JS -> Module.JSM3
                Current.PY -> Module.PYM3
                else -> Module.NM
            }
        }
    }
    when (currentModule) {
        Module.KTM1 -> _currentMState.value = currentModule
        Module.KTM2 -> _currentMState.value = currentModule
        Module.KTM3 -> _currentMState.value = currentModule
        Module.JVM1 -> _currentMState.value = currentModule
        Module.JVM2 -> _currentMState.value = currentModule
        Module.JVM3 -> _currentMState.value = currentModule
        Module.JSM1 -> _currentMState.value = currentModule
        Module.JSM2 -> _currentMState.value = currentModule
        Module.JSM3 -> _currentMState.value = currentModule
        Module.PYM1 -> _currentMState.value = currentModule
        Module.PYM2 -> _currentMState.value = currentModule
        Module.PYM3 -> _currentMState.value = currentModule
        else -> _currentMState.value = currentModule
    }
}