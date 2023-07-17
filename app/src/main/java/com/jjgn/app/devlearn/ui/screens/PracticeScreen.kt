package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNvController
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.ui.components.Container1
import com.jjgn.app.devlearn.ui.components.Container2
import com.jjgn.app.devlearn.ui.components.Container3
import com.jjgn.app.devlearn.ui.components.Container4
import com.jjgn.app.devlearn.ui.components.Container5
import com.jjgn.app.devlearn.ui.components.Container6
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@Composable
fun PracticeScreen(
    navController: NavController = LocalNvController.current
) {
    val show = remember {
        mutableStateOf(false)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 8.dp)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(90.dp)
        ) {
            Text(
                text = stringResource(R.string.exam),
                Modifier.padding(start = 20.dp, top = 32.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Light
            )
        }
        MainContainer(show)
        if (show.value) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(top = 8.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Button(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Text(text = stringResource(R.string.go_home))
                }
            }
        }
    }
}

@Composable
fun MainContainer(
    show: MutableState<Boolean>,
    appViewModel: AppViewModel = AccessInstance(),
    testViewModel: TestViewModel = AccessInstance()
) {
    when (appViewModel.currentState.value) {
        Current.KT -> {
            when (testViewModel.cTest.collectAsState().value) {
                1 -> Container1(testViewModel, show)
                2 -> Container2(testViewModel, show)
                3 -> Container3(testViewModel, show)
                4 -> Container4(testViewModel, show)
                5 -> Container5(testViewModel, show)
                6 -> Container6(testViewModel, show)
            }
        }

        Current.JS -> {
            TODO()
        }

        Current.JV -> {
            TODO()
        }

        Current.PY -> {
            TODO()
        }

        null -> {
            TODO()
        }
    }
}