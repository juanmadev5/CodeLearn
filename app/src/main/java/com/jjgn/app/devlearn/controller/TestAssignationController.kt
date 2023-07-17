package com.jjgn.app.devlearn.controller

import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

fun testAssignationController(appViewModel: AppViewModel, testViewModel: TestViewModel) {
    /**
     * Los numeros de test van desde el 1, empieza con el primero
     * de Kotlin.
     * */
    when (appViewModel.currentState.value) {
        Current.KT -> {
            when (appViewModel.currentMState.value) {
                Module.KTM1 -> {
                    when (appViewModel.cPageValue.value) {
                        3 -> testViewModel.setCurrentTest(1)
                        7 -> testViewModel.setCurrentTest(2)
                        14 -> testViewModel.setCurrentTest(3)
                        18 -> testViewModel.setCurrentTest(4)
                        19 -> testViewModel.setCurrentTest(5)
                        27 -> testViewModel.setCurrentTest(6)
                        else -> testViewModel.setCurrentTest(0)
                    }
                }
                Module.KTM2 -> {
                    TODO()
                }
                Module.KTM3 -> {
                    TODO()
                }
                Module.JVM1 -> {
                    TODO()
                }
                Module.JVM2 -> {
                    TODO()
                }
                Module.JVM3 -> {
                    TODO()
                }
                Module.JSM1 -> {
                    TODO()
                }
                Module.JSM2 -> {
                    TODO()
                }
                Module.JSM3 -> {
                    TODO()
                }
                Module.PYM1 -> {
                    TODO()
                }
                Module.PYM2 -> {
                    TODO()
                }
                Module.PYM3 -> {
                    TODO()
                }
                Module.NM -> {
                    TODO()
                }
                null -> {
                    TODO()
                }
            }
        }
        Current.JV -> {
            TODO()
        }
        Current.JS -> {
            TODO()
        }
        Current.PY -> {
            TODO()
        }
        null -> {
            TODO()
        }
    }
}