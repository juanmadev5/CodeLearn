package com.jjgn.app.devlearn.view.ui.screens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.view.ui.H_SPACER
import com.jjgn.app.devlearn.view.ui.components.HomeTopAppBar
import com.jjgn.app.devlearn.view.ui.components.ModuleCardContent1
import com.jjgn.app.devlearn.view.ui.components.ModuleCardContent2
import com.jjgn.app.devlearn.view.ui.components.ModuleCardContent3
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.defaultClipSize
import com.jjgn.app.devlearn.view.ui.paddingValue1
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.system.exitProcess

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        modifier = Modifier.clip(RoundedCornerShape(defaultClipSize)),
        content = {
            HomeContent()
        },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    )
    BackHandler(true, snackbarHostState)
}

@SuppressLint("SwitchIntDef")
@Composable
fun HomeContent() {

    val navController: NavController = LocalNavigationController.current
    val orientation = LocalConfiguration.current
    val viewModel: AppViewModel = AccessInstance()

    val m1Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.modulePage[0]
            is Current.JV -> viewModel.modulePage[3]
            is Current.JS -> viewModel.modulePage[6]
            is Current.PY -> viewModel.modulePage[9]
            else -> viewModel.modulePage[12]
        }
    }
    val m2Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.modulePage[1]
            is Current.JV -> viewModel.modulePage[4]
            is Current.JS -> viewModel.modulePage[7]
            is Current.PY -> viewModel.modulePage[10]
            else -> viewModel.modulePage[12]
        }
    }
    val m3Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.modulePage[2]
            is Current.JV -> viewModel.modulePage[5]
            is Current.JS -> viewModel.modulePage[8]
            is Current.PY -> viewModel.modulePage[11]
            else -> viewModel.modulePage[12]
        }
    }

    when (orientation.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
            ) {
                HomeTopAppBar()
                Card(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(defaultClipSize))
                        .clickable {
                            viewModel.selectedModule(1)
                            viewModel.loader()
                            navController.navigate(NavigationRoutes.InCourse.route) {
                                launchSingleTop = true
                            }
                        }
                ) {
                    ModuleCardContent1(m1Progress)
                }
                Spacer(Modifier.padding(top = H_SPACER))
                Card(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(defaultClipSize))
                        .clickable {
                            viewModel.selectedModule(2)
                            viewModel.loader()
                            navController.navigate(NavigationRoutes.InCourse.route) {
                                launchSingleTop = true
                            }
                        }
                ) {
                    ModuleCardContent2(m2Progress)
                }
                Spacer(Modifier.padding(top = H_SPACER))
                Card(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(defaultClipSize))
                        .clickable {
                            viewModel.selectedModule(3)
                            viewModel.loader()
                            navController.navigate(NavigationRoutes.InCourse.route) {
                                launchSingleTop = true
                            }
                        }
                ) {
                    ModuleCardContent3(m3Progress)
                }
                Spacer(modifier = Modifier.padding(paddingValue1))
            }

        }

        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .horizontalScroll(rememberScrollState())
                ) {
                    HomeTopAppBar()
                    Row(
                        modifier = Modifier
                            .wrapContentSize()
                    ) {
                        Card(
                            Modifier
                                .width(500.dp)
                                .wrapContentHeight()
                                .clip(RoundedCornerShape(defaultClipSize))
                                .clickable {
                                    viewModel.selectedModule(1)
                                    viewModel.loader()
                                    navController.navigate(NavigationRoutes.InCourse.route) {
                                        launchSingleTop = true
                                    }
                                }
                        ) {
                            ModuleCardContent1(m1Progress)
                        }
                        Spacer(Modifier.padding(H_SPACER))
                        Card(
                            Modifier
                                .width(360.dp)
                                .wrapContentHeight()
                                .clip(RoundedCornerShape(defaultClipSize))
                                .clickable {
                                    viewModel.selectedModule(2)
                                    viewModel.loader()
                                    navController.navigate(NavigationRoutes.InCourse.route) {
                                        launchSingleTop = true
                                    }
                                }
                        ) {
                            ModuleCardContent2(m2Progress)
                        }
                        Spacer(Modifier.padding(H_SPACER))
                        Card(
                            Modifier
                                .width(520.dp)
                                .wrapContentHeight()
                                .clip(RoundedCornerShape(defaultClipSize))
                                .clickable {
                                    viewModel.selectedModule(3)
                                    viewModel.loader()
                                    navController.navigate(NavigationRoutes.InCourse.route) {
                                        launchSingleTop = true
                                    }
                                }
                        ) {
                            ModuleCardContent3(m3Progress)
                        }
                        Spacer(modifier = Modifier.padding(paddingValue1))
                    }
                }

            }
        }
    }
}

/**
 * Esta funcion se encarga de avisarle al usuario que debe apretar retroceder
 * dos veces para cerrar la aplicacion y cerrar de forma segura
 * la aplicacion al apretar retroceder dos veces.
 * */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BackHandler(
    isEnabled: Boolean,
    snackbarHostState: SnackbarHostState,
    appViewModel: AppViewModel = AccessInstance()
) {
    val msg = stringResource(R.string.pressTwice)
    val context = LocalContext.current
    var c by remember { mutableIntStateOf(0) }
    androidx.activity.compose.BackHandler(enabled = isEnabled) {
        c += 1
        if (c == 1) {
            appViewModel.viewModelScope.launch {
                snackbarHostState.showSnackbar(msg)
                delay(App.BACKHANDLER_DELAY)
                snackbarHostState.currentSnackbarData?.dismiss()
                c = 0
            }
        } else if (c == 2) {
            appViewModel.viewModelScope.launch {
                appViewModel.dataSaver()
                withContext(Dispatchers.IO) {
                    snackbarHostState.currentSnackbarData?.dismiss()
                    val currentActivity = context as? Activity
                    currentActivity?.finishAffinity()
                }
                exitProcess(0)
            }
        }
    }
}
