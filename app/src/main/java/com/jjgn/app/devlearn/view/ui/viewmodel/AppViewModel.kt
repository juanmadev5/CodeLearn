package com.jjgn.app.devlearn.view.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.data.DataManager
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.data.course.module.Module
import com.jjgn.app.devlearn.data.course.module.getCurrentModule
import com.jjgn.app.devlearn.data.getLangName
import com.jjgn.app.devlearn.data.getTextToShow
import com.jjgn.app.devlearn.data.getTotalPages
import com.jjgn.app.devlearn.view.ui.controller.moduleCurrentPageController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * ViewModel principal de la aplicacion, se encarga de guardar y restaurar los datos,
 * muestra la informacion de acuerdo al curso y modulo seleccionado, controla la
 * paginacion y controla el zoom del texto.
 * Varios componentes que usa este ViewModel estan separados en distintos archivos.
 * */
class AppViewModel : ViewModel() {

    lateinit var dataManager: DataManager

    lateinit var dataStore: DataStore<Preferences>

    private val _currentState = MutableLiveData<Current>()

    val currentState: LiveData<Current>
        get() = _currentState

    private val _currentMState = MutableStateFlow<Module>(Module.NM)
    val currentMState: StateFlow<Module>
        get() = _currentMState

    private val _currentPage = mutableIntStateOf(1)

    val currentPage: MutableState<Int>
        get() = _currentPage

    private var _information = mutableStateOf("")

    val information: State<String>
        get() = _information

    var textSize = mutableIntStateOf(App.DEFAULT_TEXT_SIZE)

    // lista donde se almacena la pagina actual del modulo.
    // la lista contiene un total de 13 elementos, todos inicializados en 1
    val modulePage = MutableList(13) { 1 }

    // lista donde se guarda la cantidad de paginas que tiene cada modulo.
    // la lista contiene un total de 13 elementos, todos inicializados en 1
    val totalPage = MutableList(13) { 1 }

    // si la aplicacion al ser iniciado por primera vez se selecciono un curso
    // se cambia a true, de lo contrario en falso.
    val isSelectedFirstC = mutableStateOf(App.IS_SELECTED_FIRST)

    /**
     * Funcion iniciador del ViewModel
     * */
    fun onCreate() {
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
            dataManager.setCurrentState(newState, dataStore, App.cStateValue)
        }
    }

    /**
     * Funcion encargada de cargar el ultimo curso seleccionado.
     * */
    private suspend fun loadState() {
        runBlocking {
            _currentState.value = dataManager.getCurrentState(dataStore, App.cStateValue)
        }
    }

    /**
     * Funcion encargada de actualizar el estado del modulo seleccionado.
     * */
    fun selectedModule(moduleSelected: Int) {
        getCurrentModule(moduleSelected, _currentState, _currentMState)
        moduleCurrentPageController(_currentPage, _currentMState, modulePage)
    }

    /**
     * Funcion que carga el total de paginas de cada modulo y obtiene el texto que se debe mostrar.
     * */
    fun loader() {
        App.tlPages = getTotalPages(_currentState, _currentMState, totalPage)
        App.lName = getLangName(_currentState)
        _information.value = getTextToShow(_currentState, _currentPage, _currentMState)
    }

    /**
     * Funcion encargada de comprobar que se haya seleccionado un curso, de esta manera evita estar
     * ejecutando dataSaver de forma innecesaria.
     * */
    private fun dataSManager() {
        viewModelScope.launch(Dispatchers.IO) {
            if (_currentState.value == null) {
                delay(App.DS_MANAGER_DELAY)
                dataSManager()
            } else {
                autoDataSaver()
            }
        }
    }

    private suspend fun autoDataSaver() {
        coroutineScope {
            val dataSaveJob = launch {
                dataSaver()
            }
            dataSaveJob.start()
            if (!dataSaveJob.isActive) {
                delay(5000)
            }
            dataSManager()
        }
    }

    /**
     *  Funcion encargada de guardar las paginas en las que el usuario se queda y el estado del zoom del texto.
     * */
    fun dataSaver() {
        viewModelScope.launch {
            dataManager.dataSaver(
                dataStore,
                modulePage,
                App.mCurrentPage,
                isSelectedFirstC,
                App.zValue,
                textSize
            )
        }
    }

    /**
     * Funcion encargada de restaurar las paginas en las que el usuario estuvo por ultima vez y el estado del zoom del texto.
     * */
    private fun dataRestorer() {
        viewModelScope.launch {
            dataManager.dataRestorer(
                dataStore,
                modulePage,
                App.mCurrentPage,
                isSelectedFirstC,
                App.zValue,
                textSize
            )
        }
    }
}