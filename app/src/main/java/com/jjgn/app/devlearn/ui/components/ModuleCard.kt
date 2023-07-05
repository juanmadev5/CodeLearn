package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
import com.jjgn.app.devlearn.viewmodel.ModuleViewModel
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun ModuleCardContent1(
    currentLanguage: String,
    progress: MutableStateFlow<Int>,
    viewModel: AppViewModel
) {
    val currentProgress by progress.collectAsState()
    val pages by when (viewModel.currentState.value) {
        is Current.KT -> viewModel.ktm1.collectAsState()
        is Current.JV -> viewModel.jvm1.collectAsState()
        is Current.JS -> viewModel.jsm1.collectAsState()
        is Current.PY -> viewModel.pym1.collectAsState()
        else -> viewModel.nm.collectAsState()
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
            text = "$currentProgress / $pages",
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
fun ModuleCardContent2(progress: MutableStateFlow<Int>, viewModel: AppViewModel, moduleViewModel: ModuleViewModel) {
    val currentProgress by progress.collectAsState()
    var tit by remember { mutableStateOf("Termina el módulo 1 para seguir.") }
    var desc by remember { mutableStateOf("") }
    if (moduleViewModel.unlockModule2()) {
        tit = "Funciones y arreglos"
        desc = "Aprende a usar las funciones y las listas."
    }
    val pages by when (viewModel.currentState.value) {
        is Current.KT -> viewModel.ktm2.collectAsState()
        is Current.JV -> viewModel.jvm2.collectAsState()
        is Current.JS -> viewModel.jsm2.collectAsState()
        is Current.PY -> viewModel.pym2.collectAsState()
        else -> viewModel.nm.collectAsState()
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
            text = "$currentProgress / $pages",
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
fun ModuleCardContent3(progress: MutableStateFlow<Int>, viewModel: AppViewModel, moduleViewModel: ModuleViewModel) {
    val currentProgress by progress.collectAsState()
    var tit by remember { mutableStateOf("Termina el módulo 2 para seguir.") }
    var desc by remember { mutableStateOf("") }
    if (moduleViewModel.unlockModule2()) {
        tit = "Programacion orientada a objetos"
        desc = ""
    }
    val pages by when (viewModel.currentState.value) {
        is Current.KT -> viewModel.ktm3.collectAsState()
        is Current.JV -> viewModel.jvm3.collectAsState()
        is Current.JS -> viewModel.jsm3.collectAsState()
        is Current.PY -> viewModel.pym3.collectAsState()
        else -> viewModel.nm.collectAsState()
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
            text = "$currentProgress / $pages",
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