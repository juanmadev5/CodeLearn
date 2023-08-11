package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LogoDev
import androidx.compose.material.icons.filled.SettingsApplications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.R

@Composable
fun AppInfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.padding(top = 64.dp))
        Text(
            text = "Informacion de la aplicación",
            fontSize = 32.sp,
            fontWeight = FontWeight.Light,
            lineHeight = 40.sp
        )
        Spacer(Modifier.padding(top = 64.dp))
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painterResource(id = R.drawable.app_icon_foreground),
                    contentDescription = "app icon",
                    Modifier.fillMaxSize(),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(Modifier.padding(start = 12.dp))
            Text(
                text = stringResource(id = R.string.app_name) + " v1.5",
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.LogoDev,
                contentDescription = "app developer",
                Modifier
                    .size(36.dp)
                    .padding(start = 5.dp)
            )
            Spacer(Modifier.padding(start = 18.dp))
            Text(
                text = "Desarrollador: JM Dev",
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Text(
            text = "Aplicación construida con Jetpack Compose, el kit de herramientas moderno de Android para compilar IU nativas.",
            fontSize = 14.sp
        )
        Image(
            painter = painterResource(id = R.drawable.undraw_android_jr64),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(200.dp)
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.SettingsApplications,
                contentDescription = "app developer",
                Modifier
                    .size(46.dp)
                    .padding(start = 16.dp)
            )
            Spacer(Modifier.padding(start = 16.dp))
            Text(
                text = "Componentes de la aplicación",
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Text(
            text = """
                - Dagger Hilt v2.46.1
                - Accompanist SystemUI Controller v0.17.0
                - Android Core SplashScreen v1.0.1
                - Android Compose Runtime v1.4.3
                - Kotlin Coroutines v1.7.1
                - Android Compose Navigation v2.6.0
                - ViewModel Compose v2.6.1
                - Compose Runtime LiveData v1.4.3
                - Material Icons Extended v1.4.3
                - Compose ConstraintLayout v1.0.1
            """.trimIndent(),
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.padding(8.dp))
    }
}