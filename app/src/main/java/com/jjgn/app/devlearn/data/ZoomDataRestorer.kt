package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.flow.MutableStateFlow

fun zStateRestorer(
    context: Context,
    pName: String,
    zValue: String,
    textSize: MutableStateFlow<Int>,
    preferences: SharedPreferences
) {
    context.getSharedPreferences(pName, Context.MODE_PRIVATE)
    textSize.value = preferences.getInt(zValue, 16)
}