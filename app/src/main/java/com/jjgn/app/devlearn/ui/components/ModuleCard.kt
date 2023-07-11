package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@Composable
fun ModuleCardContent1(
    currentLanguage: String,
    progress: Int,
    viewModel: AppViewModel
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.tPages[0]
        is Current.JV -> viewModel.tPages[3]
        is Current.JS -> viewModel.tPages[6]
        is Current.PY -> viewModel.tPages[9]
        else -> viewModel.tPages[12]
    }
    ConstraintLayout(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        val (title, description, progressBar, image) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.programmingillustration), "",
            Modifier.constrainAs(image) {
                top.linkTo(parent.top, 8.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Text(
            text = "Conceptos basicos de $currentLanguage",
            Modifier.constrainAs(title) {
                top.linkTo(image.bottom, 16.dp)
                start.linkTo(image.start)
                end.linkTo(image.end)
            },
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = "Aprenda sobres lo basico de $currentLanguage como las variables y como se declaran," +
                    "los tipos de datos, los operadores y las estructuras de control.",
            Modifier.constrainAs(description) {
                top.linkTo(title.bottom, 10.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
        Text(
            text = "$progress / $pages",
            Modifier
                .constrainAs(progressBar) {
                    top.linkTo(description.bottom, 2.dp)
                    start.linkTo(parent.start, 20.dp)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end, 20.dp)
                }
        )
    }
}

@Composable
fun ModuleCardContent2(
    progress: Int,
    viewModel: AppViewModel,
    testViewModel: TestViewModel
) {
    var tit by remember { mutableStateOf("Termina el módulo 1 para seguir.") }
    var desc by remember { mutableStateOf("") }
    val currentUnlckState = when (viewModel.currentState.value) {
        is Current.KT -> testViewModel.mUnlocked[1]
        is Current.JV -> testViewModel.mUnlocked[3]
        is Current.JS -> testViewModel.mUnlocked[5]
        is Current.PY -> testViewModel.mUnlocked[7]
        else -> testViewModel.mUnlocked[0]
    }
    if (currentUnlckState) {
        tit = "Funciones y arreglos"
        desc = "Aprende a usar las funciones y las listas."
    }
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.tPages[1]
        is Current.JV -> viewModel.tPages[4]
        is Current.JS -> viewModel.tPages[7]
        is Current.PY -> viewModel.tPages[10]
        else -> viewModel.tPages[12]
    }
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (title, description, progressBar, image) = createRefs()
        Text(
            text = tit,
            Modifier.constrainAs(title) {
                top.linkTo(parent.top, 24.dp)
                start.linkTo(parent.start, 24.dp)
            }
        )
        Text(
            text = desc,
            Modifier.constrainAs(description) {
                top.linkTo(title.bottom, 10.dp)
                start.linkTo(parent.start, 24.dp)
                end.linkTo(parent.end)
            }
        )
        Text(
            text = "$progress / $pages",
            Modifier
                .constrainAs(progressBar) {
                    top.linkTo(description.bottom, 2.dp)
                    start.linkTo(parent.start, 20.dp)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end, 20.dp)
                }
        )
    }
}

@Composable
fun ModuleCardContent3(
    progress: Int,
    viewModel: AppViewModel,
    testViewModel: TestViewModel
) {
    var tit by remember { mutableStateOf("Termina el módulo 2 para seguir.") }
    var desc by remember { mutableStateOf("") }
    val currentUnlckState = when (viewModel.currentState.value) {
        is Current.KT -> testViewModel.mUnlocked[2]
        is Current.JV -> testViewModel.mUnlocked[4]
        is Current.JS -> testViewModel.mUnlocked[6]
        is Current.PY -> testViewModel.mUnlocked[8]
        else -> testViewModel.mUnlocked[1]
    }
    if (currentUnlckState) {
        tit = "Programacion orientada a objetos"
        desc = ""
    }
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.tPages[2]
        is Current.JV -> viewModel.tPages[5]
        is Current.JS -> viewModel.tPages[8]
        is Current.PY -> viewModel.tPages[11]
        else -> viewModel.tPages[12]
    }
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (title, description, progressBar, image) = createRefs()
        Text(
            text = tit,
            Modifier.constrainAs(title) {
                top.linkTo(parent.top, 24.dp)
                start.linkTo(parent.start, 24.dp)
            }
        )
        Text(
            text = desc,
            Modifier.constrainAs(description) {
                top.linkTo(title.bottom, 10.dp)
                start.linkTo(parent.start, 24.dp)
                end.linkTo(parent.end)
            }
        )
        Text(
            text = "$progress / $pages",
            Modifier
                .constrainAs(progressBar) {
                    top.linkTo(description.bottom, 2.dp)
                    start.linkTo(parent.start, 20.dp)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end, 20.dp)
                }
        )
    }
}