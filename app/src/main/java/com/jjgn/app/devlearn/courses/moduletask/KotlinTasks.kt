package com.jjgn.app.devlearn.courses.moduletask

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.viewmodel.TestViewModel

/**
 * Cada modulo de cada curso tiene una cantidad de tareas para realizar.
 *
 */


// Module 1
@Composable
fun KotlinM1Task1(testViewModel: TestViewModel, navController: NavController) {
    var textvalue1 by remember { mutableStateOf("") }
    var show by remember {
        mutableStateOf(false)
    }
    ConstraintLayout(
        Modifier
            .fillMaxSize()
    ) {
        val (
            description,
            textField,
            correction,
            button,
            btnHome
        ) = createRefs()
        Text(
            "1 - Imprimir un Hola Mundo en consola",
            Modifier
                .constrainAs(description) {
                    top.linkTo(parent.top, 18.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end, 16.dp)
                },
            fontSize = 16.sp,
            textAlign = TextAlign.Right
        )
        OutlinedTextField(
            value = textvalue1,
            onValueChange = {
                textvalue1 = it
                show = false
            },
            Modifier
                .size(340.dp, 120.dp)
                .constrainAs(textField) {
                    top.linkTo(description.bottom, 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        if (show) {
            Text(
                text = if (textvalue1 == testViewModel.r1) {
                    "Correcto. \nResultado: Hola mundo"
                } else {
                    "Incorrecto. \nSe esperaba: Hola mundo"
                },
                Modifier
                    .constrainAs(correction) {
                        top.linkTo(textField.bottom, 24.dp)
                        start.linkTo(textField.start)
                    },
                fontSize = 12.sp
            )
        }
        Button(
            onClick = {
                show = true
                if (textvalue1 == testViewModel.r1) {
                    testViewModel.mCounterSum()
                    testViewModel.mUnlocked[1] = true
                }
            },
            Modifier
                .constrainAs(button) {
                    bottom.linkTo(parent.bottom, 20.dp)
                    end.linkTo(textField.end)
                }
        ) {
            Text("verificar")
        }
    }
}
@Composable
fun KotlinM1Task2(testViewModel: TestViewModel, navController: NavController) {
    var textvalue1 by remember { mutableStateOf("") }
    var show by remember {
        mutableStateOf(false)
    }
    ConstraintLayout(
        Modifier
            .fillMaxSize()
    ) {
        val (
            description,
            textField,
            correction,
            button,
            btnHome
        ) = createRefs()
        Text(
            "1 - Imprimir un Hola Mundo en consola",
            Modifier
                .constrainAs(description) {
                    top.linkTo(parent.top, 18.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end, 16.dp)
                },
            fontSize = 16.sp,
            textAlign = TextAlign.Right
        )
        OutlinedTextField(
            value = textvalue1,
            onValueChange = {
                textvalue1 = it
                show = false
            },
            Modifier
                .size(340.dp, 120.dp)
                .constrainAs(textField) {
                    top.linkTo(description.bottom, 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        if (show) {
            Text(
                text = if (textvalue1 == testViewModel.r1) {
                    "Correcto. \nResultado: Hola mundo"
                } else {
                    "Incorrecto. \nSe esperaba: Hola mundo"
                },
                Modifier
                    .constrainAs(correction) {
                        top.linkTo(textField.bottom, 24.dp)
                        start.linkTo(textField.start)
                    },
                fontSize = 12.sp
            )
            Button(
                onClick = {
                    testViewModel.mUnlocked[1] = true
                    navController.navigate(NavigationRoutes.Home.route)
                },
                Modifier.constrainAs(btnHome) {
                    start.linkTo(parent.start, 8.dp)
                    bottom.linkTo(parent.bottom, 8.dp)
                }
            ) {
                Text("Ir a inicio")
            }
        }
        Button(
            onClick = {
                show = true
            },
            Modifier
                .constrainAs(button) {
                    bottom.linkTo(parent.bottom, 20.dp)
                    end.linkTo(textField.end)
                }
        ) {
            Text("verificar")
        }
    }
}

