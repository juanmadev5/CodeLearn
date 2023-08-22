package com.jjgn.app.devlearn.data

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn

const val DS_NAME = "app_dataStore"
const val isSelectedKey = "isSelectedFirstC"
const val isSelectedFirst = false
const val awaitScreenMillis = 900
const val awaitControllerDelay = 1500L
const val backHandlerDelay = 1500L
const val dsManagerDelay = 2000L
const val dsDelay = 3000L
const val defaultTextSize = 16
val awaitScreenTSetting = fadeIn(animationSpec = tween(durationMillis = awaitScreenMillis))