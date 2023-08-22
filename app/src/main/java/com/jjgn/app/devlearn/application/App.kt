package com.jjgn.app.devlearn.application

import android.app.Application
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        const val DS_NAME = "app_dataStore"
        const val IS_SELECTED_KEY = "isSelectedFirstC"
        const val IS_SELECTED_FIRST = false
        private const val AWAIT_SCREEN_MILLIS = 900
        const val AWAIT_CONTROLLER_DELAY = 1500L
        const val BACKHANDLER_DELAY = 1500L
        const val DS_MANAGER_DELAY = 2000L
        const val DS_DELAY = 3000L
        const val DEFAULT_TEXT_SIZE = 16
        val AWAIT_SCREEN_SETTING = fadeIn(animationSpec = tween(durationMillis = AWAIT_SCREEN_MILLIS))
    }
}