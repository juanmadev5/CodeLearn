package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun dRestorer(
    preferences: SharedPreferences,
    context: Context,
    pName: String,
    mPage: MutableList<Int>,
    mCurrentPage: String
) {
    coroutineScope {
        launch(Dispatchers.IO) {
            context.getSharedPreferences(pName, Context.MODE_PRIVATE)
            val restoredList = mutableListOf<Int>()
            for (i in mPage.indices) {
                val value = preferences.getInt("${mCurrentPage}$i", 1)
                restoredList.add(value)
            }
            mPage.clear()
            mPage.addAll(restoredList)
        }
    }
}