package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun zStateSaver(
    preferences: SharedPreferences,
    context: Context,
    pName: String,
    zValue: String,
    textSize: MutableStateFlow<Int>
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            context.getSharedPreferences(pName, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.putInt(zValue, textSize.value)
            editor.apply()
        }
    }
}