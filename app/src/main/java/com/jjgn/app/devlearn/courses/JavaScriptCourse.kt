package com.jjgn.app.devlearn.courses

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

// Curso Javascript
fun jsCourse(page: Int, _currentMState: MutableLiveData<Module>): String {
    val module1 = when (page) {
        1 -> {
            "js pagina 1"
        }

        2 -> {
            "js pagina 2"
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            "js pagina 1"
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            "js pagina 1"
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.JSM1 -> module1
        is Module.JSM2 -> module2
        is Module.JSM3 -> module3
        else -> ""
    }
}