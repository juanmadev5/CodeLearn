package com.jjgn.app.devlearn.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.jjgn.app.devlearn.controller.BackHandlerController
import com.jjgn.app.devlearn.ui.components.HomeContent
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    viewModel: AppViewModel,
    testViewModel: TestViewModel
) {
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        content = {
            HomeContent(viewModel, testViewModel)
        },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    )
    BackHandlerController(true, snackbarHostState)
}