package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.ui.CI_IMG_SIZE
import com.jjgn.app.devlearn.ui.CI_TXT2_SIZE
import com.jjgn.app.devlearn.ui.CI_TXT_SIZE
import com.jjgn.app.devlearn.ui.paddingValue1
import com.jjgn.app.devlearn.ui.paddingValue2
import com.jjgn.app.devlearn.ui.paddingValue3
import com.jjgn.app.devlearn.ui.paddingValue4
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun IndexScreen(
    appViewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {
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
            """
                Módulo 1
                - Pág. 1  Presentación
                - Pág. 2  Variables
                - Pág. 4  Tipos de datos
                - Pág. 8  Operadores
                - Pág. 12  Estructuras de control
                - Pág. 15  Bucles
                
                Módulo 2
                - Pág. 1  Funciones
                - Pág. 4  Funciones anónimas y de flecha
                - Pág. 7  Arreglos
                
                Módulo 3
                - Pág. 1  Programación Orientada a Objetos
                - Pág. 3  Clases
                - Pág. 5  Herencia
                - Pág. 6  Objetos
                - Pág. 10  Objetos como parámetros y retornos
                - Pág. 11  Objetos anidados
                - Pág. 12  Propiedades
                - Pág. 14  Acceso a propiedades del objeto
                - Pág. 17  Métodos
            """.trimIndent()
        }

        Current.JV -> {
            """
                Módulo 1
                - Pág. 2  Variables
                - Pág. 6  Tipos de datos
                - Pág. 7  Conversión de tipos
                - Pág. 9  Operadores
                - Pág. 12  Estructuras de control
                
                Módulo 2
                - Listas
                
                Módulo 3
                - Pág. 1  Clases
                - Pág. 2  Objetos
                - Pág. 3  Encapsulación
                - Pág. 4  Herencia
                - Pág. 5  Polimorfismo
                - Pág. 6  Abstracción
                - Pág. 7  Interfaz
                - Pág. 9  Manejos de excepciones
            """.trimIndent()
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
            .padding(top = paddingValue2, start = paddingValue2, end = paddingValue2)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.padding(top = paddingValue3))
        Image(
            painter = painterResource(id = R.drawable.undraw_diary_re_4jpc__1_),
            contentDescription = "",
            modifier = Modifier
                .size(CI_IMG_SIZE)
        )
        Text(
            text = "Índice del curso",
            Modifier.padding(top = paddingValue4),
            fontSize = 32.sp,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.padding(paddingValue2))
        Text(
            text = courseIndex,
            fontSize = CI_TXT_SIZE
        )
        Spacer(Modifier.padding(paddingValue2))
        Card(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clickable {
                    navController.navigate(NavigationRoutes.AppInfo.route)
                }
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(paddingValue2)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Informacion de la aplicacion",
                        fontSize = CI_TXT2_SIZE,
                        fontWeight = FontWeight.Bold
                    )
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "app info icon",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(paddingValue1))
    }
}