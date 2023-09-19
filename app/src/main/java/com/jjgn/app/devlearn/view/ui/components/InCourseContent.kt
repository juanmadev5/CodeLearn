package com.jjgn.app.devlearn.view.ui.components

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.view.ui.I_C_BPADD
import com.jjgn.app.devlearn.view.ui.I_C_LINE_H
import com.jjgn.app.devlearn.view.ui.I_C_PADD
import com.jjgn.app.devlearn.view.ui.I_C_TPADD
import com.jjgn.app.devlearn.view.ui.I_PADD1
import com.jjgn.app.devlearn.view.ui.I_PADD2
import com.jjgn.app.devlearn.view.ui.paddingValue1
import com.jjgn.app.devlearn.view.ui.paddingValue5
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import com.jjgn.app.devlearn.view.ui.viewmodel.TestViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InCourseContent(
    buttonNextState: Boolean,
    buttonPrevState: Boolean,
    viewModel: AppViewModel = AccessInstance()
) {
    val page by viewModel.currentPage
    val txtSize by viewModel.textSize
    val textSizeState = remember { mutableStateOf(false) }
    Scaffold(
        Modifier
            .fillMaxSize()
            .padding(
                top = I_PADD2,
                bottom = I_PADD1
            ),
        topBar = { TopBar(page = page, textSizeState, txtSize) },
        content = {
            ContentView(txtSize)
        },
        bottomBar = {
            BottomBar(buttonNextState, buttonPrevState)
        }
    )
}

@Composable
fun ContentView(
    txtSize: Int,
    viewModel: AppViewModel = AccessInstance(),
    testViewModel: TestViewModel = AccessInstance()
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(I_C_PADD)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.padding(top = I_C_TPADD))
        PracticeButton(viewModel, testViewModel)
        Spacer(Modifier.padding(top = I_C_BPADD))
        Text(
            text = viewModel.information.value,
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(
                    start = paddingValue1,
                    end = paddingValue1
                ),
            fontSize = txtSize.sp,
            lineHeight = I_C_LINE_H
        )
        Spacer(Modifier.padding(bottom = paddingValue5))
    }
}