package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.jjgn.app.devlearn.ui.theme.DevLearnTheme

@Composable
fun Preferences() {
    var autoDarkMode by remember { mutableStateOf(true) }
    var onlyDarkMode by remember { mutableStateOf(false) }
    var onlyLightMode by remember { mutableStateOf(false) }
    if (onlyLightMode) {
        DevLearnTheme(darkTheme = false) {}
    } else if (onlyDarkMode) {
        DevLearnTheme(darkTheme = true) {}
    }

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Preferencias",
            Modifier.padding(top = 32.dp, start = 32.dp),
            fontSize = 16.sp
        )
        Card(
            Modifier
                .fillMaxWidth()
                .height(290.dp)
                .padding(top = 60.dp)
        ) {
            ConstraintLayout(Modifier.fillMaxSize()) {
                val (
                    description,
                    button1,
                    button2,
                    button3,
                    desc1,
                    desc2,
                    desc3
                ) = createRefs()
                Text(
                    "Modo de color de la aplicacion",
                    Modifier.constrainAs(description) {
                        start.linkTo(parent.start, 18.dp)
                        top.linkTo(parent.top, 18.dp)
                    },
                    fontSize = 16.sp
                )
                RadioButton(
                    selected = autoDarkMode, onClick = {
                        autoDarkMode = true
                        onlyDarkMode = false
                        onlyLightMode = false
                    },
                    Modifier.constrainAs(button1) {
                        top.linkTo(description.bottom, 16.dp)
                        start.linkTo(parent.start, 16.dp)
                    }
                )
                Text(
                    "Definido por el sistema",
                    Modifier.constrainAs(desc1) {
                        top.linkTo(button1.top)
                        start.linkTo(button1.end, 16.dp)
                        bottom.linkTo(button1.bottom)
                    }
                )
                RadioButton(
                    selected = onlyLightMode, onClick = {
                        autoDarkMode = false
                        onlyDarkMode = false
                        onlyLightMode = true
                    },
                    Modifier.constrainAs(button2) {
                        top.linkTo(button1.bottom, 8.dp)
                        start.linkTo(parent.start, 16.dp)
                    }
                )
                Text(
                    "Modo claro",
                    Modifier.constrainAs(desc2) {
                        top.linkTo(button2.top)
                        start.linkTo(button2.end, 16.dp)
                        bottom.linkTo(button2.bottom)
                    }
                )
                RadioButton(
                    selected = onlyDarkMode,
                    onClick = {
                        autoDarkMode = false
                        onlyDarkMode = true
                        onlyLightMode = false
                    },
                    Modifier.constrainAs(button3) {
                        top.linkTo(button2.bottom, 8.dp)
                        start.linkTo(parent.start, 16.dp)
                    }
                )
                Text(
                    "Modo oscuro",
                    Modifier.constrainAs(desc3) {
                        top.linkTo(button3.top)
                        start.linkTo(button3.end, 16.dp)
                        bottom.linkTo(button3.bottom)
                    }
                )
            }


            Column(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {

                Spacer(Modifier.padding(top = 10.dp))

            }
        }
    }
}