package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.jjgn.app.devlearn.viewmodel.PracticeViewModel

/**
 * Cada modulo de cada curso tiene una cantidad de tareas para realizar.
 *
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KotlinM1Task1(practiceViewModel: PracticeViewModel) {
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
            button
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
                text = if (textvalue1 == practiceViewModel.r1) {
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