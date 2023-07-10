package com.jjgn.app.devlearn.viewmodel

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjgn.app.devlearn.data.DefaultData
import com.jjgn.app.devlearn.data.getCurrentModule
import com.jjgn.app.devlearn.data.getLangName
import com.jjgn.app.devlearn.data.getTextToShow
import com.jjgn.app.devlearn.data.getTotalPages
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AppViewModel @Inject constructor() : ViewModel(), DefaultData {

    override lateinit var preferences: SharedPreferences

    override var langName = "default"

    override var totalPages: Int = 0

    private val _currentState = MutableLiveData<Current>()

    val currentState: LiveData<Current>
        get() = _currentState

    private val _currentMState = MutableLiveData<Module>(Module.NM)

    private val _currentPage = MutableStateFlow(1)

    val currentPageValue: MutableStateFlow<Int>
        get() = _currentPage

    private val _infoString = mutableStateOf("")

    val infoString: State<String>
        get() = _infoString

    val textSize = MutableStateFlow(16)

    var cModulesCurrentPage = mutableListOf(
        1,// KTM1 0
        1,// KTM2 1
        1,// KTM3 2
        1,// JVM1 3
        1,// JVM2 4
        1,// JVM3 5
        1,// JSM1 6
        1,// JSM2 7
        1,// JSM3 8
        1,// PYM1 9
        1,// PYM2 10
        1,// PYM3 11
        1 // NM 12
    )

    val cModulesTPages = mutableListOf(
        10,// KTM1 0
        10,// KTM2 1
        10,// KTM3 2
        10,// JVM1 3
        10,// JVM2 4
        10,// JVM3 5
        10,// JSM1 6
        10,// JSM2 7
        10,// JSM3 8
        10,// PYM1 9
        10,// PYM2 10
        10,// PYM3 11
        10 // NM 12
    )

    /**
     * Funcion iniciador. Obtiene el contexto desde [com.jjgn.app.devlearn.ui.components.Content]
     * para que SharedPreferences funcione.
     * */
    fun starter(context: Context) {
        preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
        loadState()
        loader()
        dataRestorer(context)
        zoomStateRestorer(context)
    }

    // Funcion encargada de establecer el nuevo estado al seleccionar un curso.
    fun setCurrentState(newState: Current) {
        _currentState.value = newState
        viewModelScope.launch(Dispatchers.IO) {
            val editor = preferences.edit()
            editor?.putString("currentState", newState.javaClass.simpleName)
            editor?.apply()
        }
    }

    // Funcion encargada de cargar el ultimo curso seleccionado.
    private fun loadState() {
        val currentState = when (preferences.getString("currentState", null)) {
            Current.PY.javaClass.simpleName -> Current.PY
            Current.JS.javaClass.simpleName -> Current.JS
            Current.KT.javaClass.simpleName -> Current.KT
            Current.JV.javaClass.simpleName -> Current.JV
            else -> null
        }
        _currentState.value = currentState
    }

    // Funcion encargada de actualizar el estado del modulo seleccionado
    fun selectedModule(moduleSelected: Int) {
        getCurrentModule(
            moduleSelected,
            _currentState,
            _currentMState
        )
        _currentPage.value = when (_currentMState.value) {
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
            else -> _currentPage.value
        }
    }

    // Funcion que se encarga de ir a la siguiente pagina
    fun nextPage() {
        when (_currentMState.value) {
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
        if (_currentPage.value < totalPages) {
            _currentPage.value = _currentPage.value.plus(1)
            loader()
        }
    }

    // Funcion que permite retroceder de pagina.
    fun prevPage() {
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
        if (_currentPage.value > 1) {
            _currentPage.value = _currentPage.value - 1
            loader()
        }
    }

    // Funcion que carga el total de paginas de cada modulo y obtiene el texto que se debe mostrar
    fun loader() {
        totalPages = getTotalPages(
            _currentState,
            _currentMState,
            cModulesTPages
        )
        langName = getLangName(_currentState)
        _infoString.value = getTextToShow(
            _currentState,
            _currentPage,
            _currentMState,
        )
    }

    // Funciones encargadas de guardar y restaurar el estado del zoom.
    fun zoomStateSaver(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.putInt("zoomState", textSize.value)
            editor.apply()
        }
    }

    private fun zoomStateRestorer(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            textSize.value = preferences.getInt("zoomState", 16)
        }
    }

    // Funcion encargada de guardar las paginas en las que el usuario se queda.
    fun dataSaver(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()
            for (i in cModulesCurrentPage.indices) {
                editor.putInt("cModulesCurrentPage_$i", cModulesCurrentPage[i])
            }
            editor.apply()
        }
    }

    // Funcion encargada de restaurar las paginas en las que el usuario estuvo por ultima vez.
    fun dataRestorer(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            val restoredArray = mutableListOf<Int>()
            for (i in cModulesCurrentPage.indices) {
                val value = preferences.getInt("cModulesCurrentPage_$i", 1)
                restoredArray.add(value)
            }
            cModulesCurrentPage = restoredArray
        }
    }
}