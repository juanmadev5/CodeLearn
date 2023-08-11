package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun dSaver(
    preferences: SharedPreferences,
    context: Context,
    pName: String,
    mPage: MutableList<Int>,
    mCurrentPage: String
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            context.getSharedPreferences(pName, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = preferences.edit()
            for (i in mPage.indices) {
                editor.putInt("${mCurrentPage}$i", mPage[i])
            }
            editor.apply()
        }
    }
}