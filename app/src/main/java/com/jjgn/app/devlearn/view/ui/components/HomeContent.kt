package com.jjgn.app.devlearn.view.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel

@Composable
fun HomeContent() {

    val navController: NavController = LocalNavigationController.current
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

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HomeTopAppBar()
        Card(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(com.jjgn.app.devlearn.view.ui.defaultClipSize))
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
        Spacer(Modifier.padding(top = com.jjgn.app.devlearn.view.ui.H_SPACER))
        Card(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(com.jjgn.app.devlearn.view.ui.defaultClipSize))
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
        Spacer(Modifier.padding(top = com.jjgn.app.devlearn.view.ui.H_SPACER))
        Card(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(com.jjgn.app.devlearn.view.ui.defaultClipSize))
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
        Spacer(modifier = Modifier.padding(com.jjgn.app.devlearn.view.ui.paddingValue1))
    }
}