package com.jjgn.app.devlearn.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun zStateSaver(
    dataStore: DataStore<Preferences>,
    zValue: String,
    textSize: MutableStateFlow<Int>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            dataStore.edit { preferences ->
                preferences[intPreferencesKey(zValue)] = textSize.value
            }
        }
    }
}