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
                    when (appViewModel.cPageValue.value) {
                        4 -> testViewModel.setCurrentTest(7)
                        6 -> testViewModel.setCurrentTest(8)
                    }
                }
                Module.KTM3 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                else -> {

                }
            }
        }
        Current.JV -> {
            when (appViewModel.currentMState.value) {
                Module.JVM1 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.JVM2 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.JVM3 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                else -> {

                }
            }
        }
        Current.JS -> {
            when (appViewModel.currentMState.value) {
                Module.JSM1 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.JSM2 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.JSM3 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                else -> {

                }
            }
        }
        Current.PY -> {
            when (appViewModel.currentMState.value) {
                Module.PYM1 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.PYM2 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                Module.PYM3 -> {
                    when (appViewModel.cPageValue.value) {
                        11 -> testViewModel.setCurrentTest(9)
                    }
                }
                else -> {

                }
            }
        }
        null -> {
            TODO()
        }
    }
}