package com.jjgn.app.devlearn.view.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.data.course.module.Module
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.controller.testAssignationController
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import com.jjgn.app.devlearn.view.ui.viewmodel.TestViewModel

/**
 * El boton que permite ir a la pantalla de practica aparece
 * solo en las paginas que se deben hacer practica.
 * */
@Composable
fun PracticeButton(
    appViewModel: AppViewModel,
    testViewModel: TestViewModel,
    navController: NavController = LocalNavigationController.current
) {

    val isEnabled = remember { mutableStateOf(false) }

    when (appViewModel.currentState.value) {
        Current.KT -> {
            when (appViewModel.currentMState.collectAsState().value) {
                Module.KTM1 -> {
                    when (appViewModel.currentPage.value) {
                        3, 7, 14, 18, 19, 27 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.KTM2 -> {
                    when (appViewModel.currentPage.value) {
                        4, 6 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.KTM3 -> {
                    when (appViewModel.currentPage.value) {
                        11 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                else -> {}
            }

        }

        Current.JS -> {
            when (appViewModel.currentMState.collectAsState().value) {
                Module.JSM1 -> {
                    when (appViewModel.currentPage.value) {
                        3, 7, 13 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.JSM2 -> {
                    when (appViewModel.currentPage.value) {
                        2, 8 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.JSM3 -> {
                    when (appViewModel.currentPage.value) {
                        else -> isEnabled.value = false
                    }
                }

                Module.NM -> {

                }

                else -> {}
            }
        }

        Current.JV -> {
            when (appViewModel.currentMState.collectAsState().value) {
                Module.JVM1 -> {
                    when (appViewModel.currentPage.value) {
                        3, 14 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.JVM2 -> {
                    when (appViewModel.currentPage.value) {
                        else -> isEnabled.value = false
                    }
                }

                Module.JVM3 -> {
                    when (appViewModel.currentPage.value) {
                        1 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                else -> {}
            }
        }

        Current.PY -> {
            when (appViewModel.currentMState.collectAsState().value) {
                Module.PYM1 -> {
                    when (appViewModel.currentPage.value) {
                        2, 6, 12 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.PYM2 -> {
                    when (appViewModel.currentPage.value) {
                        1 -> isEnabled.value = true
                        else -> isEnabled.value = false
                    }
                }

                Module.PYM3 -> {
                    when (appViewModel.currentPage.value) {
                        else -> isEnabled.value = false
                    }
                }

                else -> {}
            }
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
            horizontalArrangement = Arrangement.Start
        ) {
            Button(
                onClick = {
                    testAssignationController(appViewModel, testViewModel)
                    navController.navigate(NavigationRoutes.Practice.route) {
                        launchSingleTop = true
                    }
                },
                Modifier
                    .padding(end = 16.dp)
                    .wrapContentHeight()
            ) {
                Spacer(modifier = Modifier.padding(top = 30.dp))
                Icon(
                    imageVector = Icons.Filled.AutoAwesome,
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "Practicar")
            }
        }
    }
}