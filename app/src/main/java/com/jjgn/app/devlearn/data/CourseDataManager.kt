package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.data.course.module.Module
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class CourseDataManager @Inject constructor() {

    /**
     * Funcion encargada de cargar el ultimo curso seleccionado.
     * */
    suspend fun loadState(
        currentState: MutableLiveData<Current>,
        dataManager: DataManager
    ) {
        runBlocking {
            currentState.value = dataManager.getCurrentState()
        }
    }

    /**
     * Esta funcion recupera el total de paginas de cada modulo correspondiente a cada curso.
     * */
    fun getTotalPages(
        currentState: MutableLiveData<Current>,
        currentMState: MutableStateFlow<Module>,
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

    /**
     * Esta funcion se encarga de retornar el nombre del lenguaje a mostrar en Home
     * de acuerdo al curso seleccionado
     * */
    fun getLangName(
        currentState: LiveData<Current>
    ): String {
        return when (currentState.value) {
            is Current.PY -> "Python"
            is Current.KT -> "Kotlin"
            is Current.JV -> "Java"
            is Current.JS -> "Javascript"
            else -> "error"
        }
    }

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

    /**
     * Esta funcion establece el indice en la matriz que se debe usar para la paginacion.
     * Cada modulo de cada curso utiliza un indice en la matriz.
     * */
    fun moduleCurrentPage(
        currentPage: MutableState<Int>,
        currentMState: MutableStateFlow<Module>,
        cModulesCurrentPage: MutableList<Int>
    ) {
        currentPage.value = when (currentMState.value) {
            is Module.KTM1 -> cModulesCurrentPage[0]
            is Module.KTM2 -> cModulesCurrentPage[1]
            is Module.KTM3 -> cModulesCurrentPage[2]
            is Module.JVM1 -> cModulesCurrentPage[3]
            is Module.JVM2 -> cModulesCurrentPage[4]
            is Module.JVM3 -> cModulesCurrentPage[5]
            is Module.JSM1 -> cModulesCurrentPage[6]
            is Module.JSM2 -> cModulesCurrentPage[7]
            is Module.JSM3 -> cModulesCurrentPage[8]
            is Module.PYM1 -> cModulesCurrentPage[9]
            is Module.PYM2 -> cModulesCurrentPage[10]
            is Module.PYM3 -> cModulesCurrentPage[11]
            else -> currentPage.value
        }
    }
}