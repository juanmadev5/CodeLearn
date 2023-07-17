package com.jjgn.app.devlearn.data

import android.content.SharedPreferences
import com.jjgn.app.devlearn.states.Current

fun sCurrentState(
    newState: Current,
    preferences: SharedPreferences,
    cStateValue: String
) {
    val editor = preferences.edit()
    editor.putString(cStateValue, newState.javaClass.simpleName)
    editor.apply()
}