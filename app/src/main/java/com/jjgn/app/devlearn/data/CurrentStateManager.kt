package com.jjgn.app.devlearn.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.jjgn.app.devlearn.data.course.Current
import kotlinx.coroutines.flow.first

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

