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
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.ui.P_BOX_H
import com.jjgn.app.devlearn.ui.P_PADD_E
import com.jjgn.app.devlearn.ui.P_PADD_T
import com.jjgn.app.devlearn.ui.P_TXT_PADD_S
import com.jjgn.app.devlearn.ui.P_TXT_PADD_T
import com.jjgn.app.devlearn.ui.P_TXT_SIZE
import com.jjgn.app.devlearn.ui.components.Container1
import com.jjgn.app.devlearn.ui.components.Container10
import com.jjgn.app.devlearn.ui.components.Container11
import com.jjgn.app.devlearn.ui.components.Container12
import com.jjgn.app.devlearn.ui.components.Container13
import com.jjgn.app.devlearn.ui.components.Container14
import com.jjgn.app.devlearn.ui.components.Container15
import com.jjgn.app.devlearn.ui.components.Container16
import com.jjgn.app.devlearn.ui.components.Container17
import com.jjgn.app.devlearn.ui.components.Container18
import com.jjgn.app.devlearn.ui.components.Container19
import com.jjgn.app.devlearn.ui.components.Container2
import com.jjgn.app.devlearn.ui.components.Container20
import com.jjgn.app.devlearn.ui.components.Container21
import com.jjgn.app.devlearn.ui.components.Container3
import com.jjgn.app.devlearn.ui.components.Container4
import com.jjgn.app.devlearn.ui.components.Container5
import com.jjgn.app.devlearn.ui.components.Container6
import com.jjgn.app.devlearn.ui.components.Container7
import com.jjgn.app.devlearn.ui.components.Container8
import com.jjgn.app.devlearn.ui.components.Container9
import com.jjgn.app.devlearn.ui.paddingValue1
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@Composable
fun PracticeScreen(
    navController: NavController = LocalNavigationController.current
) {
    val show = remember {
        mutableStateOf(false)
    }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = paddingValue1)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(P_BOX_H)
        ) {
            Text(
                text = stringResource(R.string.exam),
                Modifier.padding(start = P_TXT_PADD_S, top = P_TXT_PADD_T),
                fontSize = P_TXT_SIZE,
                fontWeight = FontWeight.Light
            )
        }
        MainContainer(show)
        if (show.value) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(top = P_PADD_T, end = P_PADD_E),
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
                7 -> Container7(testViewModel, show)
                8 -> Container8(testViewModel, show)
                9 -> Container9(testViewModel, show)
            }
        }

        Current.JS -> {
            when (testViewModel.cTest.collectAsState().value) {
                13 -> Container14(testViewModel, show)
                14 -> Container15(testViewModel, show)
                15 -> Container16(testViewModel, show)
                17 -> Container17(testViewModel, show)
                18 -> Container18(testViewModel, show)
            }
        }

        Current.JV -> {
            when (testViewModel.cTest.collectAsState().value) {
                10 -> Container19(testViewModel, show)
                101 -> Container20(testViewModel, show)
                12 -> Container21(testViewModel, show)
            }
        }

        Current.PY -> {
            when (testViewModel.cTest.collectAsState().value) {
                19 -> Container10(testViewModel, show)
                20 -> Container11(testViewModel, show)
                21 -> Container12(testViewModel, show)
                22 -> Container13(testViewModel, show)
                23 -> Container16(testViewModel, show)
            }
        }

        null -> {
            TODO()
        }
    }
}