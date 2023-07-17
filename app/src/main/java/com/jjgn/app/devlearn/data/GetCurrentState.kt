package com.jjgn.app.devlearn.data

import android.content.SharedPreferences
import com.jjgn.app.devlearn.states.Current

fun gCurrentState(
    preferences: SharedPreferences,
    cStateValue: String,
): Current? {
    return when (preferences.getString(cStateValue, null)) {
        Current.PY.javaClass.simpleName -> Current.PY
        Current.JS.javaClass.simpleName -> Current.JS
        Current.KT.javaClass.simpleName -> Current.KT
        Current.JV.javaClass.simpleName -> Current.JV
        else -> null
    }
}