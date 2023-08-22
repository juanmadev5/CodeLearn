package com.jjgn.app.devlearn

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.datastore.preferences.preferencesDataStore
import com.jjgn.app.devlearn.data.DS_NAME
import com.jjgn.app.devlearn.ui.components.Content
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import dagger.hilt.android.AndroidEntryPoint

val Context.dataStore by preferencesDataStore(DS_NAME)

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val appViewModel: AppViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appViewModel.ds = dataStore
        appViewModel.starter()
        setContent {
            Content()
        }
    }
}