package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun IndexScreen(appViewModel: AppViewModel = AccessInstance()) {
    val courseIndex = when (appViewModel.currentState.value) {
        Current.KT -> {
            """
                    Módulo 1
                    - Pág. 1  Presentación
                    - Pág. 2  Variables
                    - Pág. 4  Tipos de datos
                    - Pág. 8  Conversion y casting de tipos
                    - Pág. 13  Operadores
                    - Pág. 17  Estructuras de control
                    - Pág. 24  Funciones y modularidad básica
                    - Pág. 31  Manejo de errores
                    - Pág. 38  Programación funcional
                    
                    Módulo 2
                    - Pág. 2  Funciones avanzadas
                    - Pág. 5  Arreglos
                    
                    Módulo 3
                    - Pág. 2  Clases y objetos
                    - Pág. 4  Herencia
                    - Pág. 6  Polimorfismo
                    - Pág. 8  Modificadores de acceso
                    - Pág. 10  Interfaces
                    - Pág. 12  Sobrecarga de operadores
                """.trimIndent()
        }

        Current.JS -> {
            TODO()
        }
        Current.JV -> {
            TODO()
        }
        Current.PY -> {
            """
                Módulo 1
                - Pág. 1  Presentación
                - Pág. 2  Variables
                - Pág. 3  Tipos de datos
                - Pág. 5  Declaración de variables y reglas de nombramiento
                - Pág. 8  Operadores
                - Pág. 12  Estructuras de control
                - Pág. 18  Excepciones
                
                Módulo 2
                - Pág. 1  Colecciones de datos
                - Pág. 3  Tuplas
                - Pág. 5  Diccionarios
                - Pág. 8  Funciones
                - Pág. 10  Parámetros y argumentos
                - Pág. 11  Módulos y paquetes
                - Pág. 14  Organización del código en paquetes
                - Pág. 15  Programación funcional
               
               Módulo 3
               - Pág. 1  Clases y objetos
               - Pág. 3  Atributos y métodos de clases
               - Pág. 4  Métodos de clase
               - Pág. 5  Creación de instancias de objetos
               - Pág. 6  Encapsulación y Modificadores de acceso
               - Pág. 7  Herencia
               - Pág. 10  Métodos y atributos heredados
               - Pág. 13  Polimorfismo
               - Pág. 16  Métodos estáticos y de clase
               
            """.trimIndent()
        }
        null -> {
            TODO()
        }
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.padding(top = 30.dp))
        Image(
            painter = painterResource(id = R.drawable.undraw_diary_re_4jpc__1_),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
        )
        Text(
            text = "Índice del curso",
            Modifier.padding(top = 54.dp),
            fontSize = 32.sp,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = courseIndex,
            fontSize = 16.sp
        )
        Spacer(Modifier.padding(16.dp))
        Card(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        text = "Informacion de la aplicacion",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "app info icon",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
                Spacer(Modifier.padding(top = 16.dp))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Image(painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "app icon", Modifier.size(40.dp))
                    Spacer(Modifier.padding(start = 8.dp))
                    Text(
                        text = stringResource(id = R.string.app_name) + " v1.2",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}