@file:OptIn(
    ExperimentalComposeUiApi::class, ExperimentalComposeUiApi::class,
    ExperimentalComposeUiApi::class
)

package com.jjgn.app.devlearn.data.course.moduletask

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.viewmodel.TestViewModel

@ExperimentalComposeUiApi
@Composable
fun PythonM1Task1(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.pyTask1
    var textvalue by remember { mutableStateOf("prin") }
    var btnTextValue by remember { mutableStateOf("Verificar") }
    var show by remember {
        mutableStateOf(false)
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp)
        ) {
            Text(
                "1 - Imprime un Hola mundo",
                fontSize = 16.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    show = true
                    keyboardController?.hide()
                    btnTextValue = "Verificado"
                    if (textvalue == exercise) {
                        showBtn.value = true
                        testViewModel.mCounterSum()
                    }
                }
            ) {
                Text(btnTextValue)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 12.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = textvalue,
                onValueChange = {
                    textvalue = it
                    show = false
                    showBtn.value = false
                    btnTextValue = "Verificar"
                },
                Modifier.size(380.dp, 120.dp)
            )
        }

        if (show) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
            ) {
                Text(
                    text = if (textvalue == exercise) {
                        stringResource(R.string.correct) + "\n" + stringResource(R.string.result) +
                                "Hola mundo"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "Hola mundo"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}

@ExperimentalComposeUiApi
@Composable
fun PythonM1Task2(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.pyTask2
    var textvalue by remember {
        mutableStateOf(
            """
        numCadena = "22"
        numero = int()
    """.trimIndent()
        )
    }
    var btnTextValue by remember { mutableStateOf("Verificar") }
    var show by remember {
        mutableStateOf(false)
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp)
        ) {
            Text(
                "2 - Convierte el valor de numCadena a Int",
                fontSize = 16.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    show = true
                    keyboardController?.hide()
                    btnTextValue = "Verificado"
                    if (textvalue == exercise) {
                        showBtn.value = true
                        testViewModel.mCounterSum()
                    }
                }
            ) {
                Text(btnTextValue)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 12.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = textvalue,
                onValueChange = {
                    textvalue = it
                    show = false
                    showBtn.value = false
                    btnTextValue = "Verificar"
                },
                Modifier.size(380.dp, 120.dp)
            )
        }

        if (show) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
            ) {
                Text(
                    text = if (textvalue == exercise) {
                        stringResource(R.string.correct) + "\n" + stringResource(R.string.result) +
                                "22"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "22"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun PythonM1Task3(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.pyTask3
    var textvalue by remember {
        mutableStateOf(
            """
                if
            """.trimIndent()
        )
    }
    var btnTextValue by remember { mutableStateOf("Verificar") }
    var show by remember {
        mutableStateOf(false)
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp)
        ) {
            Text(
                "3 - Haz que se imprima Contratado si edad es mayor de 18, de lo contrario No contratado",
                fontSize = 16.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    show = true
                    keyboardController?.hide()
                    btnTextValue = "Verificado"
                    if (textvalue == exercise) {
                        showBtn.value = true
                        testViewModel.mCounterSum()
                    }
                }
            ) {
                Text(btnTextValue)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 12.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = textvalue,
                onValueChange = {
                    textvalue = it
                    show = false
                    showBtn.value = false
                    btnTextValue = "Verificar"
                },
                Modifier.size(380.dp, 200.dp)
            )
        }

        if (show) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
            ) {
                Text(
                    text = if (textvalue == exercise) {
                        stringResource(R.string.correct)
                    } else {
                        stringResource(R.string.incorrect)
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun PythonM1Task4(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.pyTask4
    var textvalue by remember {
        mutableStateOf(
            """
                colores = 
            """.trimIndent()
        )
    }
    var btnTextValue by remember { mutableStateOf("Verificar") }
    var show by remember {
        mutableStateOf(false)
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp)
        ) {
            Text(
                "4 - Crea una lista que contenga los colores rojo, verde, azul",
                fontSize = 16.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    show = true
                    keyboardController?.hide()
                    btnTextValue = "Verificado"
                    if (textvalue == exercise) {
                        showBtn.value = true
                        testViewModel.mCounterSum()
                    }
                }
            ) {
                Text(btnTextValue)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 12.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = textvalue,
                onValueChange = {
                    textvalue = it
                    show = false
                    showBtn.value = false
                    btnTextValue = "Verificar"
                },
                Modifier.size(380.dp, 120.dp)
            )
        }

        if (show) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
            ) {
                Text(
                    text = if (textvalue == exercise) {
                        stringResource(R.string.correct)
                    } else {
                        stringResource(R.string.incorrect)
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}