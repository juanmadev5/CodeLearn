package com.jjgn.app.devlearn.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.intPreferencesKey
import com.jjgn.app.devlearn.application.App
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

suspend fun zStateRestorer(
    dataStore: DataStore<Preferences>,
    zValue: String,
    textSize: MutableStateFlow<Int>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            val preferences = dataStore.data.first()
            val restoredValue = preferences[intPreferencesKey(zValue)] ?: App.DEFAULT_TEXT_SIZE
            textSize.value = restoredValue
        }
    }
}