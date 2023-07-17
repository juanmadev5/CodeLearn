package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences

fun dRestorer(
    preferences: SharedPreferences,
    context: Context,
    pName: String,
    mPage: MutableList<Int>,
    mCurrentPage: String
) {
    context.getSharedPreferences(pName, Context.MODE_PRIVATE)
    val restoredList = mutableListOf<Int>()
    for (i in mPage.indices) {
        val value = preferences.getInt("${mCurrentPage}$i", 1)
        restoredList.add(value)
    }
    mPage.clear()
    mPage.addAll(restoredList)
}