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
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.ui.AP_BOX_CLIP
import com.jjgn.app.devlearn.ui.AP_BOX_SIZE
import com.jjgn.app.devlearn.ui.AP_DEV_IC
import com.jjgn.app.devlearn.ui.AP_DEV_IC_P
import com.jjgn.app.devlearn.ui.AP_IC2_S
import com.jjgn.app.devlearn.ui.AP_IMG
import com.jjgn.app.devlearn.ui.AP_P_S
import com.jjgn.app.devlearn.ui.AP_SPADD
import com.jjgn.app.devlearn.ui.AP_TXT2_SIZE
import com.jjgn.app.devlearn.ui.AP_TXT_LNH
import com.jjgn.app.devlearn.ui.AP_TXT_SIZE
import com.jjgn.app.devlearn.ui.paddingValue1
import com.jjgn.app.devlearn.ui.paddingValue2
import com.jjgn.app.devlearn.ui.paddingValue4

@Composable
fun AppInfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = paddingValue2, start = paddingValue2, end = paddingValue2)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.padding(top = paddingValue4))
        Text(
            text = "Informacion de la aplicación",
            fontSize = AP_TXT_SIZE,
            fontWeight = FontWeight.Light,
            lineHeight = AP_TXT_LNH
        )
        Spacer(Modifier.padding(top = paddingValue4))
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(AP_BOX_SIZE)
                    .clip(RoundedCornerShape(AP_BOX_CLIP)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painterResource(id = R.drawable.app_icon_foreground),
                    contentDescription = "app icon",
                    Modifier.fillMaxSize(),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(Modifier.padding(start = AP_P_S))
            Text(
                text = stringResource(id = R.string.app_name) + " v1.5",
                fontSize = AP_TXT2_SIZE
            )
        }
        Spacer(modifier = Modifier.padding(top = paddingValue2))


        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.LogoDev,
                contentDescription = "app developer",
                Modifier
                    .size(AP_DEV_IC)
                    .padding(start = AP_DEV_IC_P)
            )
            Spacer(Modifier.padding(start = AP_SPADD))
            Text(
                text = "Desarrollador: JM Dev",
                fontSize = AP_TXT2_SIZE
            )
        }
        Spacer(modifier = Modifier.padding(top = paddingValue2))

        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()) {
            Text(
                text = "Aplicación construida con Jetpack Compose, el kit de herramientas moderno de Android para compilar IU nativas.",
                fontSize = AP_TXT2_SIZE
            )
            Image(
                painter = painterResource(id = R.drawable.undraw_android_jr64),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(AP_IMG)
            )
            Spacer(modifier = Modifier.padding(top = paddingValue1))
        }


        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.SettingsApplications,
                contentDescription = "app developer",
                Modifier
                    .size(AP_IC2_S)
                    .padding(start = paddingValue2)
            )
            Spacer(Modifier.padding(start = paddingValue2))
            Text(
                text = "Componentes de la aplicación",
                fontSize = AP_TXT2_SIZE
            )
        }
        Spacer(modifier = Modifier.padding(top = paddingValue2))

        Text(
            text = """
                - Dagger Hilt v2.46.1
                - Accompanist SystemUI Controller v0.17.0
                - Android Data Store Preferences v1.0.0
                - Android Core SplashScreen v1.0.1
                - Android Compose Runtime v1.4.3
                - Kotlin Coroutines v1.7.1
                - Android Compose Navigation v2.6.0
                - ViewModel Compose v2.6.1
                - Compose Runtime LiveData v1.4.3
                - Material Icons Extended v1.4.3
                - Compose ConstraintLayout v1.0.1
            """.trimIndent(),
            fontSize = AP_TXT2_SIZE
        )
        Spacer(modifier = Modifier.padding(paddingValue1))

    }
}