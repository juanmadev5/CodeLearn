package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.data.course.Current
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Clase en la que se encuentran las funciones de guardado y restaurado de datos asi como
 * las funciones que establecen el curso seleccionado y el que restaura el ultimo curso
 * seleccionado por el usuario.
 * Todas las funciones que usen [DataStore] se encuentran aqui.
 * */
@Singleton
class DataManager @Inject constructor() {

    /**
     * Funcion encargada de guardar datos como la ultima pagina en la que el usuario
     * se quedo en cada curso y el zoom que el usuario configuro.
     * */
    suspend fun dataSaver(
        dataStore: DataStore<Preferences>,
        mPage: MutableList<Int>,
        mCurrentPage: String,
        isSelectedFirstC: MutableState<Boolean>,
        zValue: String,
        textSize: MutableState<Int>
    ) {
        coroutineScope {
            launch(Dispatchers.IO) {
                dataStore.edit { preferences ->
                    for (i in mPage.indices) {
                        preferences[intPreferencesKey("${mCurrentPage}$i")] = mPage[i]
                    }
                    preferences[booleanPreferencesKey(App.IS_SELECTED_KEY)] = isSelectedFirstC.value
                    preferences[intPreferencesKey(zValue)] = textSize.value
                }
            }
        }
    }


    /**
     * Funcion encargada de restaurar datos como la ultima pagina en la que el usuario
     * se quedo en cada curso y el zoom que el usuario configuro.
     * */
    suspend fun dataRestorer(
        dataStore: DataStore<Preferences>,
        mPage: MutableList<Int>,
        mCurrentPage: String,
        isSelectedFirstC: MutableState<Boolean>,
        zValue: String,
        textSize: MutableState<Int>
    ) {
        coroutineScope {
            launch(Dispatchers.IO) {
                val preferences = dataStore.data.first()
                val restoredList = mutableListOf<Int>()
                val restoredValue = preferences[intPreferencesKey(zValue)] ?: App.DEFAULT_TEXT_SIZE

                for (i in mPage.indices) {
                    val value = preferences[intPreferencesKey("${mCurrentPage}$i")] ?: 1
                    restoredList.add(value)
                }

                mPage.clear()
                mPage.addAll(restoredList)

                isSelectedFirstC.value =
                    preferences[booleanPreferencesKey(App.IS_SELECTED_KEY)] ?: true

                textSize.value = restoredValue
            }
        }
    }

    /**
     * Funcion encargada de establecer el curso que el usuario selecciono.
     * */
    suspend fun setCurrentState(
        newState: Current,
        dataStore: DataStore<Preferences>,
        cStateValue: String
    ) {
        val currentStateKey = stringPreferencesKey(cStateValue)
        dataStore.edit { preferences ->
            preferences[currentStateKey] = newState.javaClass.simpleName
        }
    }

    /**
     * Funcion encargada de restaurar el ultimo curso seleccionado por el usuario
     * al iniciar la aplicacion.
     * */
    suspend fun getCurrentState(
        dataStore: DataStore<Preferences>,
        cStateValue: String,
    ): Current? {
        val currentStateKey = stringPreferencesKey(cStateValue)
        val preferences = dataStore.data.first()
        return when (preferences[currentStateKey]) {
            Current.PY.javaClass.simpleName -> Current.PY
            Current.JS.javaClass.simpleName -> Current.JS
            Current.KT.javaClass.simpleName -> Current.KT
            Current.JV.javaClass.simpleName -> Current.JV
            else -> null
        }
    }
}