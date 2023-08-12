package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun HomeContent(
    viewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {
    val m1Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.mPage[0]
            is Current.JV -> viewModel.mPage[3]
            is Current.JS -> viewModel.mPage[6]
            is Current.PY -> viewModel.mPage[9]
            else -> viewModel.mPage[12]
        }
    }
    val m2Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.mPage[1]
            is Current.JV -> viewModel.mPage[4]
            is Current.JS -> viewModel.mPage[7]
            is Current.PY -> viewModel.mPage[10]
            else -> viewModel.mPage[12]
        }
    }
    val m3Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.mPage[2]
            is Current.JV -> viewModel.mPage[5]
            is Current.JS -> viewModel.mPage[8]
            is Current.PY -> viewModel.mPage[11]
            else -> viewModel.mPage[12]
        }
    }

    LazyColumn(
        Modifier
            .fillMaxSize(),
        userScrollEnabled = true
    ) {
        item {
            HomeTopAppBar()
            Spacer(Modifier.padding(top = 16.dp))
        }
        item {
            Card(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        viewModel.selectedModule(1)
                        viewModel.loader()
                        navController.navigate(NavigationRoutes.InCourse.route)
                    }
            ) {
                ModuleCardContent1(m1Progress)
            }
            Spacer(Modifier.padding(top = 20.dp))
        }
        item {
            Card(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        viewModel.selectedModule(2)
                        viewModel.loader()
                        navController.navigate(NavigationRoutes.InCourse.route)
                    }
            ) {
                ModuleCardContent2(m2Progress)
            }
            Spacer(Modifier.padding(top = 20.dp))
        }
        item {
            Card(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        viewModel.selectedModule(3)
                        viewModel.loader()
                        navController.navigate(NavigationRoutes.InCourse.route)
                    }
            ) {
                ModuleCardContent3(m3Progress)
            }
            Spacer(modifier = Modifier.padding(8.dp))
        }
    }
}