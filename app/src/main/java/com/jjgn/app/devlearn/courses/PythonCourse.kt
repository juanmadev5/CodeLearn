package com.jjgn.app.devlearn.courses

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

// Curso Python
fun pyCourse(page: Int, _currentMState: MutableLiveData<Module>): String {
    val module1 = when (page) {
        1 -> {
            "py pagina 1"
        }

        2 -> {
            "py pagina 2"
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            "py pagina 1"
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            "py pagina 1"
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.PYM1 -> module1
        is Module.PYM2 -> module2
        is Module.PYM3 -> module3
        else -> ""
    }
}