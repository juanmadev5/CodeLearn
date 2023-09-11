package com.jjgn.app.devlearn.controller

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

/**
 * Esta funcion se encarga de hacer el retroceso de pagina.
 * */
fun onPrevPageController(
    currentMState: MutableLiveData<Module>,
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