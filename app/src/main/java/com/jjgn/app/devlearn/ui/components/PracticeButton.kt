package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.LocalNvController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.controller.testAssignationController
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

/**
 * El boton que permite ir a la pantalla de practica aparece
 * solo en las paginas que se deben hacer practica.
 * */
@Composable
fun PracticeButton(
    appViewModel: AppViewModel,
    testViewModel: TestViewModel,
    navController: NavController = LocalNvController.current
) {

    val isEnabled = remember { mutableStateOf(false) }

    when (appViewModel.currentState.value) {
        Current.KT -> {
            when (appViewModel.cPageValue.collectAsState().value) {
                3, 7, 14, 18, 19, 27 -> isEnabled.value = true
                else -> isEnabled.value = false
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
    if (isEnabled.value) {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    testAssignationController(appViewModel, testViewModel)
                    navController.navigate(NavigationRoutes.Practice.route)
                },
                Modifier.padding(end = 16.dp)
            ) {
                Text(text = "Practicar")
            }
        }
    }
}