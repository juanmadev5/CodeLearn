@file:OptIn(ExperimentalComposeUiApi::class)

package com.jjgn.app.devlearn.courses.moduletask

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
import com.jjgn.app.devlearn.viewmodel.TestViewModel

/**
 * Cada modulo de cada curso tiene una cantidad de tareas para realizar.
 *
 */

// Modulo 1
@Composable
fun KotlinM1Task1(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask1
    var textvalue by remember { mutableStateOf("print") }
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
@Composable
fun KotlinM1Task2(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask2
    var textvalue by remember { mutableStateOf("") }
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
                "2 - Declara una variable inmutable de tipo String con valor Juan",
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
                                "Juan"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "Juan"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task3(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask3
    var textvalue by remember { mutableStateOf("") }
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
                "3 - Crea dos variables a y b con valor 2 y sumalos",
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
                                "4"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "4"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task4(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask4
    var textvalue by remember { mutableStateOf("""
        val añosExperiencia = 2
        if () {
            
        }
    """.trimIndent()) }
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
                "4 - Completa: Una empresa quiere un programa que contrate automaticamente a gente con 2 años o más" +
                        " de experiencia en el área. Corrige el codigo, debe mostrar Contratado si cumple la condicion de lo contrario No contratado. " +
                        "Las identaciones son de 4 espacios.",
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
                Modifier.size(380.dp, 180.dp)
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
                                "Contratado"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "Contratado"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task5(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask5
    var textvalue by remember { mutableStateOf("""
        val dia = 2
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miercoles")
            4 -> println("Jueves")
        
        }
    """.trimIndent()) }
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
                "5 - Completa la sentencia para imprimir los dias de la semana",
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
                Modifier.size(380.dp, 300.dp)
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
                                "Martes"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "Martes"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task6(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask6
    var textvalue by remember { mutableStateOf("fun sumar()") }
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
                "6 - Crea una funcion que reciba dos numeros a y b tipo entero y imprima la suma de ellos. " +
                        "Ambos recibiran como valor 4 en la llamada.",
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
                Modifier.size(380.dp, 130.dp)
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
                                "8"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "8"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task7(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask7
    var textvalue by remember { mutableStateOf("fun multiplicar(a, b)") }
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
                "7 - modifica la funcion para que reciba dos numeros como parametro" +
                        " y imprima el resultado de la multiplicacion.",
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
                Modifier.size(380.dp, 130.dp)
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
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "a*b = c"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task8(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask8
    var textvalue by remember { mutableStateOf("val num = arrayOf(1, 2, 3, 4, 5)") }
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
                "8 - De la siguiente lista, imprime el numero 3",
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
                Modifier.size(380.dp, 130.dp)
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
                                "3"
                    } else {
                        stringResource(R.string.incorrect) + "\n" + stringResource(R.string.expected) +
                                "3"
                    },
                    fontSize = 12.sp
                )
            }
        }
    }
}
@Composable
fun KotlinM1Task9(
    testViewModel: TestViewModel,
    showBtn: MutableState<Boolean>
) {
    val exercise = testViewModel.ktTask9
    var textvalue by remember { mutableStateOf(
        """
        interface Reproducible {
            fun reproducir()
            fun detener()
            
        }
        class Musica : Reproducible {
            override fun reproducir() {
                println("Reproduciendo música...")
            }
            override fun detener() {
                println("Deteniendo reproducción de música.")
            }
            
        }
        """.trimIndent()
    ) }
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
                "9 - Modifica el siguiente codigo y agregale la funcion de pausar",
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
                Modifier.size(380.dp, 380.dp)
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