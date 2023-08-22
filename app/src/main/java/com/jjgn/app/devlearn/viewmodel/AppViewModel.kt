package com.jjgn.app.devlearn.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjgn.app.devlearn.application.App
import com.jjgn.app.devlearn.controller.moduleCurrentPageController
import com.jjgn.app.devlearn.controller.onNextPageController
import com.jjgn.app.devlearn.controller.onPrevPageController
import com.jjgn.app.devlearn.data.DefaultData
import com.jjgn.app.devlearn.data.dRestorer
import com.jjgn.app.devlearn.data.dSaver
import com.jjgn.app.devlearn.data.gCurrentState
import com.jjgn.app.devlearn.data.getCurrentModule
import com.jjgn.app.devlearn.data.getLangName
import com.jjgn.app.devlearn.data.getTextToShow
import com.jjgn.app.devlearn.data.getTotalPages
import com.jjgn.app.devlearn.data.sCurrentState
import com.jjgn.app.devlearn.data.zStateRestorer
import com.jjgn.app.devlearn.data.zStateSaver
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.states.Module
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

/**
 * ViewModel principal de la aplicacion, se encarga de guardar y restaurar los datos,
 * muestra la informacion de acuerdo al curso y modulo seleccionado, controla la
 * paginacion y controla el zoom del texto.
 * Algunas cosas estan en [DefaultData] y se implementan aqui para tener
 * mas ordenado y que el codigo sea mas entendible.
 * Varios componentes que usa este ViewModel estan separados en distintos archivos.
 * */
class AppViewModel @Inject constructor() : ViewModel(), DefaultData {

    override var lName = "default"

    override var tlPages: Int = 0

    private val _currentState = MutableLiveData<Current>()

    lateinit var ds: DataStore<Preferences>

    val currentState: LiveData<Current>
        get() = _currentState

    private val _currentMState = MutableLiveData<Module>(Module.NM)
    val currentMState: LiveData<Module>
        get() = _currentMState

    private val _currentPage = MutableStateFlow(1)

    val cPageValue: MutableStateFlow<Int>
        get() = _currentPage

    private val _information = mutableStateOf("")

    val information: State<String>
        get() = _information

    val textSize = MutableStateFlow(App.DEFAULT_TEXT_SIZE)

    // lista donde se almacena la pagina actual del modulo.
    var mPage = mutableListOf(
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

    // lista donde se guarda la cantidad de paginas que tiene cada modulo.
    val tPages = mutableListOf(
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
    val isSelectedFirstC = mutableStateOf(App.IS_SELECTED_FIRST)

    /**
     * Funcion iniciador. Obtiene el contexto desde [com.jjgn.app.devlearn.ui.components.Content]
     * para que SharedPreferences funcione.
     * */
    fun starter() {
        viewModelScope.launch {
            loadState()
        }
        loader()
        if (_currentState.value != null) {
            dataRestorer()
        }
        dataSManager()
    }

    /**
     * Funcion encargada de establecer el curso actual seleccionado.
     * */
    fun setCurrentState(newState: Current) {
        _currentState.value = newState
        viewModelScope.launch(Dispatchers.IO) {
            sCurrentState(newState, ds, cStateValue)
        }
    }

    /**
     * Funcion encargada de cargar el ultimo curso seleccionado.
     * */
    private suspend fun loadState() {
        runBlocking {
            _currentState.value = gCurrentState(ds, cStateValue)
        }
    }

    /**
     * Funcion encargada de actualizar el estado del modulo seleccionado.
     * */
    fun selectedModule(moduleSelected: Int) {
        getCurrentModule(moduleSelected, _currentState, _currentMState)
        moduleCurrentPageController(_currentPage, _currentMState, mPage)
    }

    /**
     * Funciones que se encargan de avanzar o retroceder de pagina.
     * */
    fun nextPage() {
        onNextPageController(_currentMState, mPage)
        if (_currentPage.value < tlPages) {
            _currentPage.value = _currentPage.value.plus(1)
            loader()
        }
    }

    fun prevPage() {
        onPrevPageController(_currentMState, mPage)
        if (_currentPage.value > 1) {
            _currentPage.value = _currentPage.value - 1
            loader()
        }
    }

    /**
     * Funcion que carga el total de paginas de cada modulo y obtiene el texto que se debe mostrar.
     * */
    fun loader() {
        tlPages = getTotalPages(_currentState, _currentMState, tPages)
        lName = getLangName(_currentState)
        _information.value = getTextToShow(_currentState, _currentPage, _currentMState)
    }

    /**
     * Funcion encargada de comprobar que se haya seleccionado un curso, de esta manera evita estar
     * ejecutando [dataSaver] de forma innecesaria.
     * */
    private fun dataSManager() {
        viewModelScope.launch(Dispatchers.IO) {
            if (_currentState.value == null) {
                delay(App.DS_MANAGER_DELAY)
                dataSManager()
            } else {
                dataSaver()
            }
        }
    }

    /**
     *  Funcion encargada de guardar las paginas en las que el usuario se queda y el estado del zoom del texto.
     * */
    fun dataSaver() {
        viewModelScope.launch(Dispatchers.IO) {
            dSaver(ds, mPage, mCurrentPage, isSelectedFirstC)
            zStateSaver(ds, zValue, textSize)
            delay(App.DS_DELAY)
            Log.i("AppData", "Data saved!")
            dataSaver()
        }
    }

    /**
     * Funcion encargada de restaurar las paginas en las que el usuario estuvo por ultima vez y el estado del zoom del texto.
     * */
    private fun dataRestorer() {
        viewModelScope.launch(Dispatchers.IO) {
            dRestorer(ds, mPage, mCurrentPage, isSelectedFirstC)
            zStateRestorer(ds, zValue, textSize)
        }
    }
}