package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun zStateRestorer(
    context: Context,
    pName: String,
    zValue: String,
    textSize: MutableStateFlow<Int>,
    preferences: SharedPreferences
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            context.getSharedPreferences(pName, Context.MODE_PRIVATE)
            textSize.value = preferences.getInt(zValue, 16)
        }
    }
}