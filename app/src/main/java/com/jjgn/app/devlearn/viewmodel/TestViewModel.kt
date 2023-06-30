package com.jjgn.app.devlearn.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val appViewModel: AppViewModel
) : ViewModel() {
// implementación pendiente

    val r1 = "println(\"Hola mundo\")"
}