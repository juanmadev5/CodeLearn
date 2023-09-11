package com.jjgn.app.devlearn

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        const val DS_NAME = "app_dataStore"
        const val IS_SELECTED_KEY = "isSelectedFirstC"
        const val IS_SELECTED_FIRST = false
        const val AWAIT_CONTROLLER_DELAY = 700L
        const val BACKHANDLER_DELAY = 2000L
        const val DS_MANAGER_DELAY = 2000L
        const val ANIMATED_VISIBILITY_DELAY = 1000
        const val DEFAULT_TEXT_SIZE = 16
        const val cStateValue = "current_state"
        const val zValue = "zoom_value"
        const val mCurrentPage = "current_page-"
        var lName = "default"
        var tlPages = 0
        val cList = listOf(
            "Kotlin",
            "Java",
            "Javascript",
            "Python"
        )
        val cDescription = listOf(
            R.string.ktDesc,
            R.string.jvDesc,
            R.string.jsDesc,
            R.string.pyDesc
        )
        val cLogo =  listOf(
            R.drawable.kotlin_full_color_logo_mark_rgb,
            R.drawable.java_logo_1,
            R.drawable.javascript_39404,
            R.drawable.python_logo_only
        )
    }
}