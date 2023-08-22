package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import com.jjgn.app.devlearn.application.App
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun dSaver(
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