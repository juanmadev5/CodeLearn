package com.jjgn.app.devlearn.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import com.jjgn.app.devlearn.states.Current
import kotlinx.coroutines.flow.first

suspend fun gCurrentState(
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