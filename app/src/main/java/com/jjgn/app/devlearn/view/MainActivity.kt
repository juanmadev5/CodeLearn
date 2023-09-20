package com.jjgn.app.devlearn.view

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.datastore.preferences.preferencesDataStore
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.data.DataManager
import com.jjgn.app.devlearn.view.ui.controller.Navigation
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

val Context.dataStore by preferencesDataStore(App.DS_NAME)

@AndroidEntryPoint
class ApplicationActivity : ComponentActivity() {

    @Inject
    lateinit var dataManager: DataManager

    private val appViewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appViewModel.dataManager = dataManager
        appViewModel.dataStore = dataStore
        appViewModel.onCreate()
        setContent {
            Navigation()
        }
    }
}