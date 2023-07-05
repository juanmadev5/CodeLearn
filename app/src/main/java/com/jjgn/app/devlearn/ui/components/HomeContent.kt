package com.jjgn.app.devlearn.ui.components

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.ModuleViewModel

@Composable
fun HomeContent(
    viewModel: AppViewModel,
    moduleViewModel: ModuleViewModel,
    navController: NavController,
    context: Context
) {
    viewModel.dataRestorer(context)
    val m1Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.ktm1p
            is Current.JV -> viewModel.jvm1p
            is Current.JS -> viewModel.jsm1p
            is Current.PY -> viewModel.pym1p
            else -> viewModel.currentPageValue
        }
    }
    val m2Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.ktm2p
            is Current.JV -> viewModel.jvm2p
            is Current.JS -> viewModel.jsm2p
            is Current.PY -> viewModel.pym2p
            else -> viewModel.currentPageValue
        }
    }
    val m3Progress = remember {
        when (viewModel.currentState.value) {
            is Current.KT -> viewModel.ktm3p
            is Current.JV -> viewModel.jvm3p
            is Current.JS -> viewModel.jsm3p
            is Current.PY -> viewModel.pym3p
            else -> viewModel.currentPageValue
        }
    }

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.padding(top = 30.dp))
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .height(80.dp)
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .clickable {
                        navController.navigate(NavigationRoutes.Courses.route)
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = viewModel.langName,
                    Modifier.padding(24.dp),
                    fontSize = 20.sp
                )
            }
            IconButton(
                onClick = { navController.navigate(NavigationRoutes.Preferences.route) },
                Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(14.dp))
                    .padding(end = 10.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    "",
                    Modifier
                        .size(36.dp)
                        .padding(4.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }

        Spacer(Modifier.padding(top = 30.dp))
        Card(
            Modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(14.dp))
                .clickable {
                    viewModel.selectedModule(1)
                    viewModel.loader()
                    navController.navigate(NavigationRoutes.InCourse.route)
                }

        ) {
            ModuleCardContent1(
                currentLanguage = viewModel.langName,
                m1Progress,
                viewModel
            )
        }
        Spacer(Modifier.padding(top = 20.dp))
        Card(
            Modifier
                .fillMaxWidth()
                .height(600.dp)
                .clip(RoundedCornerShape(14.dp))
                .clickable {
                    if (moduleViewModel.unlockModule2()) {
                        viewModel.selectedModule(2)
                        viewModel.loader()
                        navController.navigate(NavigationRoutes.InCourse.route)
                    }
                }
        ) {
            ModuleCardContent2(m2Progress, viewModel, moduleViewModel)
        }
        Spacer(Modifier.padding(top = 20.dp))
        Card(
            Modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(14.dp))
                .clickable {
                    if (moduleViewModel.unlockModule3()) {
                        viewModel.selectedModule(3)
                        viewModel.loader()
                        navController.navigate(NavigationRoutes.InCourse.route)
                    }
                }
        ) {
            ModuleCardContent3(m3Progress, viewModel, moduleViewModel)
        }
    }
}
