package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun zStateSaver(
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