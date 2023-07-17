package com.jjgn.app.devlearn.data

import android.content.Context
import android.content.SharedPreferences

fun dSaver(
    preferences: SharedPreferences,
    context: Context,
    pName: String,
    mPage: MutableList<Int>,
    mCurrentPage: String
) {
    context.getSharedPreferences(pName, Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor = preferences.edit()
    for (i in mPage.indices) {
        editor.putInt("${mCurrentPage}$i", mPage[i])
    }
    editor.apply()
}