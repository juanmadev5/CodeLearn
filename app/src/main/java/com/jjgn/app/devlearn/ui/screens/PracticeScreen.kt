package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjgn.app.devlearn.ui.components.Container1
import com.jjgn.app.devlearn.viewmodel.PracticeViewModel

@Composable
fun PracticeScreen() {
    val viewModel = hiltViewModel<PracticeViewModel>()
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 8.dp)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(90.dp)
        ) {
            Text(
                text = "Pon a prueba lo aprendido",
                Modifier.padding(start = 20.dp, top = 32.dp),
                fontSize = 21.sp,
                fontWeight = FontWeight.Light
            )
        }
        Container1(viewModel)
    }
}