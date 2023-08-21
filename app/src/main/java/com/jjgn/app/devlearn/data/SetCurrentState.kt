package com.jjgn.app.devlearn.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.jjgn.app.devlearn.states.Current

suspend fun sCurrentState(
    newState: Current,
    dataStore: DataStore<Preferences>,
    cStateValue: String
) {
    val currentStateKey = stringPreferencesKey(cStateValue)
    dataStore.edit { preferences ->
        preferences[currentStateKey] = newState.javaClass.simpleName
    }
}