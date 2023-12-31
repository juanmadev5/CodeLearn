package com.jjgn.app.devlearn.view.ui.controller

import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.data.course.module.Module
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import com.jjgn.app.devlearn.view.ui.viewmodel.TestViewModel

fun testAssignationController(appViewModel: AppViewModel, testViewModel: TestViewModel) {
    /**
     * Los numeros de test van desde el 1, empieza con el primero
     * de Kotlin.
     * */
    when (appViewModel.currentState.value) {
        Current.KT -> {
            when (appViewModel.currentMState.value) {
                Module.KTM1 -> {
                    when (appViewModel.currentPage.value) {
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
                    when (appViewModel.currentPage.value) {
                        4 -> testViewModel.setCurrentTest(7)
                        6 -> testViewModel.setCurrentTest(8)
                    }
                }

                Module.KTM3 -> {
                    when (appViewModel.currentPage.value) {
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
                    when (appViewModel.currentPage.value) {
                        3 -> testViewModel.setCurrentTest(10)
                        14 -> testViewModel.setCurrentTest(101)
                    }
                }

                Module.JVM2 -> {
                    when (appViewModel.currentPage.value) {
                        else -> testViewModel.setCurrentTest(0)
                    }
                }

                Module.JVM3 -> {
                    when (appViewModel.currentPage.value) {
                        1 -> testViewModel.setCurrentTest(12)
                    }
                }

                else -> {

                }
            }
        }

        Current.JS -> {
            when (appViewModel.currentMState.value) {
                Module.JSM1 -> {
                    when (appViewModel.currentPage.value) {
                        3 -> testViewModel.setCurrentTest(13)
                        7 -> testViewModel.setCurrentTest(14)
                        13 -> testViewModel.setCurrentTest(15)
                    }
                }

                Module.JSM2 -> {
                    when (appViewModel.currentPage.value) {
                        2 -> testViewModel.setCurrentTest(17)
                        8 -> testViewModel.setCurrentTest(18)
                    }
                }

                Module.JSM3 -> {
                    when (appViewModel.currentPage.value) {
                        else -> testViewModel.setCurrentTest(0)
                    }
                }

                else -> {

                }
            }
        }

        Current.PY -> {
            when (appViewModel.currentMState.value) {
                Module.PYM1 -> {
                    when (appViewModel.currentPage.value) {
                        2 -> testViewModel.setCurrentTest(19)
                        6 -> testViewModel.setCurrentTest(20)
                        12 -> testViewModel.setCurrentTest(21)
                    }
                }

                Module.PYM2 -> {
                    when (appViewModel.currentPage.value) {
                        1 -> testViewModel.setCurrentTest(22)
                    }
                }

                Module.PYM3 -> {
                    when (appViewModel.currentPage.value) {
                        else -> testViewModel.setCurrentTest(0)
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