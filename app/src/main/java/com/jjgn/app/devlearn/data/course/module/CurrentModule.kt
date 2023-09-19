package com.jjgn.app.devlearn.data.course.module

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.data.course.Current
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Esta funcion obtiene el modulo seleccionado. Al seleccionar un modulo en Home,
 * se recibe por parametro un Int y dependiendo cual sea y que curso se selecciono
 * se establece el modulo correspondiente.
 * */
fun getCurrentModule(
    moduleSelected: Int,
    currentState: MutableLiveData<Current>,
    currentMState: MutableStateFlow<Module>
) {
    val currentModule = when (moduleSelected) {
        1 -> {
            when (currentState.value) {
                Current.KT -> Module.KTM1
                Current.JV -> Module.JVM1
                Current.JS -> Module.JSM1
                Current.PY -> Module.PYM1
                else -> Module.NM
            }
        }

        2 -> {
            when (currentState.value) {
                Current.KT -> Module.KTM2
                Current.JV -> Module.JVM2
                Current.JS -> Module.JSM2
                Current.PY -> Module.PYM2
                else -> Module.NM
            }
        }

        else -> {
            when (currentState.value) {
                Current.KT -> Module.KTM3
                Current.JV -> Module.JVM3
                Current.JS -> Module.JSM3
                Current.PY -> Module.PYM3
                else -> Module.NM
            }
        }
    }
    when (currentModule) {
        Module.KTM1 -> currentMState.value = currentModule
        Module.KTM2 -> currentMState.value = currentModule
        Module.KTM3 -> currentMState.value = currentModule
        Module.JVM1 -> currentMState.value = currentModule
        Module.JVM2 -> currentMState.value = currentModule
        Module.JVM3 -> currentMState.value = currentModule
        Module.JSM1 -> currentMState.value = currentModule
        Module.JSM2 -> currentMState.value = currentModule
        Module.JSM3 -> currentMState.value = currentModule
        Module.PYM1 -> currentMState.value = currentModule
        Module.PYM2 -> currentMState.value = currentModule
        Module.PYM3 -> currentMState.value = currentModule
        else -> currentMState.value = currentModule
    }
}