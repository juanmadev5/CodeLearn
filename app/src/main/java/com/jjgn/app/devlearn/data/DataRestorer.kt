package com.jjgn.app.devlearn.data

import androidx.compose.runtime.MutableState
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import com.jjgn.app.devlearn.App
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

suspend fun dRestorer(
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