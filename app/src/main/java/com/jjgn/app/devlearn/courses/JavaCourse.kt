package com.jjgn.app.devlearn.courses

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

// Curso Java
fun jvCourse(page: Int, _currentMState: MutableLiveData<Module>): String {
    val module1 = when (page) {
        1 -> {
            "java pagina 1"
        }

        2 -> {
            "java pagina 2"
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            "java pagina 1"
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            "java pagina 1"
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.JVM1 -> module1
        is Module.JVM2 -> module2
        is Module.JVM3 -> module3
        else -> ""
    }
}