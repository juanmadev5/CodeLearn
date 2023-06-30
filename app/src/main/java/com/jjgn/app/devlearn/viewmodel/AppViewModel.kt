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

    val ktm1p = MutableStateFlow(1)
    val ktm1 = MutableStateFlow(0)
    val ktm2p = MutableStateFlow(1)
    val ktm2 = MutableStateFlow(0)
    val ktm3p = MutableStateFlow(1)
    val ktm3 = MutableStateFlow(0)

    val jvm1p = MutableStateFlow(1)
    val jvm1 = MutableStateFlow(0)
    val jvm2p = MutableStateFlow(1)
    val jvm2 = MutableStateFlow(0)
    val jvm3p = MutableStateFlow(1)
    val jvm3 = MutableStateFlow(0)

    val jsm1p = MutableStateFlow(1)
    val jsm1 = MutableStateFlow(0)
    val jsm2p = MutableStateFlow(1)
    val jsm2 = MutableStateFlow(0)
    val jsm3p = MutableStateFlow(1)
    val jsm3 = MutableStateFlow(0)

    val pym1p = MutableStateFlow(1)
    val pym1 = MutableStateFlow(0)
    val pym2p = MutableStateFlow(1)
    val pym2 = MutableStateFlow(0)
    val pym3p = MutableStateFlow(1)
    val pym3 = MutableStateFlow(0)

    val nm = MutableStateFlow(0)

    fun starter(context: Context) {
        preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
        loadState()
        loader()
        dataRestorer(context)
        zoomStateRestorer(context)
    }

    fun setCurrentState(newState: Current) {
        _currentState.value = newState
        viewModelScope.launch(Dispatchers.IO) {
            val editor = preferences.edit()
            editor?.putString("currentState", newState.javaClass.simpleName)
            editor?.apply()
        }
    }

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

    fun selectedModule(moduleSelected: Int) {
        getCurrentModule(
            moduleSelected,
            _currentState,
            _currentMState
        )
        _currentPage.value = when (_currentMState.value) {
            is Module.KTM1 -> ktm1p.value
            is Module.KTM2 -> ktm2p.value
            is Module.KTM3 -> ktm3p.value
            is Module.JVM1 -> jvm1p.value
            is Module.JVM2 -> jvm2p.value
            is Module.JVM3 -> jvm3p.value
            is Module.JSM1 -> jsm1p.value
            is Module.JSM2 -> jsm2p.value
            is Module.JSM3 -> jsm3p.value
            is Module.PYM1 -> pym1p.value
            is Module.PYM2 -> pym2p.value
            is Module.PYM3 -> pym3p.value
            else -> _currentPage.value
        }
    }

    fun nextPage() {
        when (_currentMState.value) {
            is Module.KTM1 -> ktm1p.value++
            is Module.KTM2 -> ktm2p.value++
            is Module.KTM3 -> ktm3p.value++
            is Module.JVM1 -> jvm1p.value++
            is Module.JVM2 -> jvm2p.value++
            is Module.JVM3 -> jvm3p.value++
            is Module.JSM1 -> jsm1p.value++
            is Module.JSM2 -> jsm2p.value++
            is Module.JSM3 -> jsm3p.value++
            is Module.PYM1 -> pym1p.value++
            is Module.PYM2 -> pym2p.value++
            is Module.PYM3 -> pym3p.value++
            else -> return
        }
        if (_currentPage.value < totalPages) {
            _currentPage.value = _currentPage.value.plus(1)
            loader()
        }
    }

    fun prevPage() {
        when (_currentMState.value) {
            is Module.KTM1 -> ktm1p.value--
            is Module.KTM2 -> ktm2p.value--
            is Module.KTM3 -> ktm3p.value--
            is Module.JVM1 -> jvm1p.value--
            is Module.JVM2 -> jvm2p.value--
            is Module.JVM3 -> jvm3p.value--
            is Module.JSM1 -> jsm1p.value--
            is Module.JSM2 -> jsm2p.value--
            is Module.JSM3 -> jsm3p.value--
            is Module.PYM1 -> pym1p.value--
            is Module.PYM2 -> pym2p.value--
            is Module.PYM3 -> pym3p.value--
            else -> return
        }
        if (_currentPage.value > 1) {
            _currentPage.value = _currentPage.value - 1
            loader()
        }
    }

    fun loader() {
        totalPages = getTotalPages(
            _currentState,
            _currentMState,
            ktm1,
            ktm2,
            ktm3,
            jvm1,
            jvm2,
            jvm3,
            jsm1,
            jsm2,
            jsm3,
            pym1,
            pym2,
            pym3
        )
        langName = getLangName(_currentState)
        _infoString.value = getTextToShow(
            _currentState,
            _currentPage,
            _currentMState,
        )
    }

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

    fun dataSaver(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()
            when (_currentMState.value) {
                is Module.KTM1 -> {
                    editor.putInt("kotlinModule1Page", ktm1p.value)
                    editor.apply()
                }

                is Module.KTM2 -> {
                    editor.putInt("kotlinModule2Page", ktm2p.value)
                    editor.apply()
                }

                is Module.KTM3 -> {
                    editor.putInt("kotlinModule3Page", ktm3p.value)
                    editor.apply()
                }

                is Module.JVM1 -> {
                    editor.putInt("javaModule1Page", jvm1p.value)
                    editor.apply()
                }

                is Module.JVM2 -> {
                    editor.putInt("javaModule2Page", jvm2p.value)
                    editor.apply()
                }

                is Module.JVM3 -> {
                    editor.putInt("javaModule3Page", jvm3p.value)
                    editor.apply()
                }

                is Module.JSM1 -> {
                    editor.putInt("jsModule1Page", jsm1p.value)
                    editor.apply()
                }

                is Module.JSM2 -> {
                    editor.putInt("jsModule2Page", jsm2p.value)
                    editor.apply()
                }

                is Module.JSM3 -> {
                    editor.putInt("jsModule3Page", jsm3p.value)
                    editor.apply()
                }

                is Module.PYM1 -> {
                    editor.putInt("pythonModule1Page", pym1p.value)
                    editor.apply()
                }

                is Module.PYM2 -> {
                    editor.putInt("pythonModule2Page", pym2p.value)
                    editor.apply()
                }

                is Module.PYM3 -> {
                    editor.putInt("pythonModule3Page", pym3p.value)
                    editor.apply()
                }

                else -> {
                    _currentPage.value
                }
            }
        }
    }

    fun dataRestorer(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
            when (_currentState.value) {
                is Current.KT -> {
                    ktm1p.value = preferences.getInt("kotlinModule1Page", 1)
                    ktm2p.value = preferences.getInt("kotlinModule2Page", 1)
                    ktm3p.value = preferences.getInt("kotlinModule3Page", 1)
                }

                is Current.JV -> {
                    jvm1p.value = preferences.getInt("javaModule1Page", 1)
                    jvm2p.value = preferences.getInt("javaModule2Page", 1)
                    jvm3p.value = preferences.getInt("javaModule3Page", 1)
                }

                is Current.JS -> {
                    jsm1p.value = preferences.getInt("jsModule1Page", 1)
                    jsm2p.value = preferences.getInt("jsModule2Page", 1)
                    jsm3p.value = preferences.getInt("jsModule3Page", 1)
                }

                is Current.PY -> {
                    pym1p.value = preferences.getInt("pythonModule1Page", 1)
                    pym2p.value = preferences.getInt("pythonModule2Page", 1)
                    pym3p.value = preferences.getInt("pythonModule3Page", 1)
                }

                else -> {}
            }
        }
    }
}