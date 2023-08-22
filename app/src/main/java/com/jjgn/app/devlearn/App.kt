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
        const val DS_DELAY = 3000L
        const val DEFAULT_TEXT_SIZE = 16
    }
}