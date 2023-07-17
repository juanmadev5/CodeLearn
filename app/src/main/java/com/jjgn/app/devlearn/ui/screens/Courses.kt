package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.ui.components.CourseCard
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun CourseSelectorScreen(viewModel: AppViewModel = AccessInstance()) {
    LazyColumn(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            Text(
                text = stringResource(R.string.selectCourse),
                Modifier
                    .padding(
                        top = 96.dp,
                        start = 16.dp,
                        bottom = 96.dp
                    )
                    .fillMaxWidth(),
                fontSize = 26.sp,
                textAlign = TextAlign.Left
            )
        }
        items(4) {
            CourseCard(
                title = viewModel.cList[it],
                description = stringResource(viewModel.cDescription[it]),
                logo = viewModel.cLogo[it],
                viewModel = viewModel
            )
            Spacer(Modifier.padding(5.dp))
        }
        item {
            Spacer(Modifier.padding(28.dp))
        }
    }
}