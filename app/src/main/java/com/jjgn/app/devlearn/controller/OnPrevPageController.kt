package com.jjgn.app.devlearn.controller

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

/**
 * Esta funcion se encarga de hacer el retroceso de pagina.
 * */
fun onPrevPageController(
    _currentMState: MutableLiveData<Module>,
    cModulesCurrentPage: MutableList<Int>
) {
    when (_currentMState.value) {
        is Module.KTM1 -> cModulesCurrentPage[0]--
        is Module.KTM2 -> cModulesCurrentPage[0]--
        is Module.KTM3 -> cModulesCurrentPage[0]--
        is Module.JVM1 -> cModulesCurrentPage[0]--
        is Module.JVM2 -> cModulesCurrentPage[0]--
        is Module.JVM3 -> cModulesCurrentPage[0]--
        is Module.JSM1 -> cModulesCurrentPage[0]--
        is Module.JSM2 -> cModulesCurrentPage[0]--
        is Module.JSM3 -> cModulesCurrentPage[0]--
        is Module.PYM1 -> cModulesCurrentPage[0]--
        is Module.PYM2 -> cModulesCurrentPage[0]--
        is Module.PYM3 -> cModulesCurrentPage[0]--
        else -> return
    }
}