package com.jjgn.app.devlearn.view.ui.controller

import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.data.course.module.Module
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import kotlinx.coroutines.flow.StateFlow

fun nextPage(appViewModel: AppViewModel) {
    onNextPageController(appViewModel.currentMState, appViewModel.modulePage)
    if (appViewModel.currentPage.value < App.tlPages) {
        appViewModel.currentPage.value = appViewModel.currentPage.value + 1
        appViewModel.loader()
    }
}

fun prevPage(appViewModel: AppViewModel) {
    onPrevPageController(appViewModel.currentMState, appViewModel.modulePage)
    if (appViewModel.currentPage.value > 1) {
        appViewModel.currentPage.value = appViewModel.currentPage.value - 1
        appViewModel.loader()
    }
}

/**
 * Esta funcion se encarga de avanzar de pagina.
 * */
fun onNextPageController(
    currentMState: StateFlow<Module>,
    cModulesCurrentPage: MutableList<Int>
) {
    when (currentMState.value) {
        is Module.KTM1 -> cModulesCurrentPage[0]++
        is Module.KTM2 -> cModulesCurrentPage[1]++
        is Module.KTM3 -> cModulesCurrentPage[2]++
        is Module.JVM1 -> cModulesCurrentPage[3]++
        is Module.JVM2 -> cModulesCurrentPage[4]++
        is Module.JVM3 -> cModulesCurrentPage[5]++
        is Module.JSM1 -> cModulesCurrentPage[6]++
        is Module.JSM2 -> cModulesCurrentPage[7]++
        is Module.JSM3 -> cModulesCurrentPage[8]++
        is Module.PYM1 -> cModulesCurrentPage[9]++
        is Module.PYM2 -> cModulesCurrentPage[10]++
        is Module.PYM3 -> cModulesCurrentPage[11]++
        else -> return
    }
}

/**
 * Esta funcion se encarga de hacer el retroceso de pagina.
 * */
fun onPrevPageController(
    currentMState: StateFlow<Module>,
    cModulesCurrentPage: MutableList<Int>
) {
    when (currentMState.value) {
        is Module.KTM1 -> cModulesCurrentPage[0]--
        is Module.KTM2 -> cModulesCurrentPage[1]--
        is Module.KTM3 -> cModulesCurrentPage[2]--
        is Module.JVM1 -> cModulesCurrentPage[3]--
        is Module.JVM2 -> cModulesCurrentPage[4]--
        is Module.JVM3 -> cModulesCurrentPage[5]--
        is Module.JSM1 -> cModulesCurrentPage[6]--
        is Module.JSM2 -> cModulesCurrentPage[7]--
        is Module.JSM3 -> cModulesCurrentPage[8]--
        is Module.PYM1 -> cModulesCurrentPage[9]--
        is Module.PYM2 -> cModulesCurrentPage[10]--
        is Module.PYM3 -> cModulesCurrentPage[11]--
        else -> return
    }
}