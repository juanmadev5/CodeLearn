package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import com.jjgn.app.devlearn.App
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

suspend fun dataSaver(
    dataStore: DataStore<Preferences>,
    mPage: MutableList<Int>,
    mCurrentPage: String,
    isSelectedFirstC: MutableState<Boolean>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            dataStore.edit { preferences ->
                for (i in mPage.indices) {
                    preferences[intPreferencesKey("${mCurrentPage}$i")] = mPage[i]
                }
                preferences[booleanPreferencesKey(App.IS_SELECTED_KEY)] = isSelectedFirstC.value
            }
        }
    }
}

suspend fun zoomStateSaver(
    dataStore: DataStore<Preferences>,
    zValue: String,
    textSize: MutableState<Int>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            dataStore.edit { preferences ->
                preferences[intPreferencesKey(zValue)] = textSize.value
            }
        }
    }
}

suspend fun dataRestorer(
    dataStore: DataStore<Preferences>,
    mPage: MutableList<Int>,
    mCurrentPage: String,
    isSelectedFirstC: MutableState<Boolean>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            val preferences = dataStore.data.first()
            val restoredList = mutableListOf<Int>()

            for (i in mPage.indices) {
                val value = preferences[intPreferencesKey("${mCurrentPage}$i")] ?: 1
                restoredList.add(value)
            }

            mPage.clear()
            mPage.addAll(restoredList)

            isSelectedFirstC.value =
                preferences[booleanPreferencesKey(App.IS_SELECTED_KEY)] ?: true
        }
    }
}

suspend fun zoomStateRestorer(
    dataStore: DataStore<Preferences>,
    zValue: String,
    textSize: MutableState<Int>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            val preferences = dataStore.data.first()
            val restoredValue = preferences[intPreferencesKey(zValue)] ?: App.DEFAULT_TEXT_SIZE
            textSize.value = restoredValue
        }
    }
}