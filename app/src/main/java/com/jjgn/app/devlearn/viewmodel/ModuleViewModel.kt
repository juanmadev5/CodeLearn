package com.jjgn.app.devlearn.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ModuleViewModel @Inject constructor(
    private val appViewModel: AppViewModel
) : ViewModel() {
    
    fun unlockModule2(isUnlocked: Boolean = true): Boolean {
        return isUnlocked
    }
    fun unlockModule3(isUnlocked: Boolean = true): Boolean {
        return isUnlocked
    }
}