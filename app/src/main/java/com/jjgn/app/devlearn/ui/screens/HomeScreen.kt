package com.jjgn.app.devlearn.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.BackHandlerController
import com.jjgn.app.devlearn.ui.components.HomeContent
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.ModuleViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController, viewModel: AppViewModel, context: Context) {
    val moduleViewModel = hiltViewModel<ModuleViewModel>()
    val snackbarHostState = remember{ SnackbarHostState() }
    Scaffold(
        content = {
            HomeContent(viewModel, moduleViewModel, navController, context)
        },
        snackbarHost = {  SnackbarHost(hostState = snackbarHostState) }
    )
    BackHandlerController(true, snackbarHostState)
}