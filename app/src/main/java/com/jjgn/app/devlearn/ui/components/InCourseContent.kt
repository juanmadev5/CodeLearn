package com.jjgn.app.devlearn.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InCourseContent(
    viewModel: AppViewModel,
    buttonNextState: Boolean,
    buttonPrevState: Boolean,
    testViewModel: TestViewModel
) {
    val page by viewModel.cPageValue.collectAsState()
    val txtSize by viewModel.textSize.collectAsState()
    val textSizeState = remember { mutableStateOf(false) }
    Scaffold(
        Modifier
            .fillMaxSize()
            .padding(top = 24.dp, bottom = 16.dp),
        topBar = { TopBar(page = page, viewModel, textSizeState, txtSize) },
        content = {
            ContentView(viewModel, txtSize, testViewModel)
        },
        bottomBar = {
            BottomBar(viewModel, buttonNextState, buttonPrevState)
        }
    )
}

@Composable
fun ContentView(
    viewModel: AppViewModel,
    txtSize: Int,
    testViewModel: TestViewModel
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(12.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.padding(top = 70.dp))

        Text(
            text = viewModel.information.value,
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 6.dp, end = 6.dp),
            fontSize = txtSize.sp,
            lineHeight = 26.sp,
            textAlign = TextAlign.Justify
        )
        PracticeButton(viewModel, testViewModel)
        Spacer(Modifier.padding(bottom = 90.dp))
    }
}