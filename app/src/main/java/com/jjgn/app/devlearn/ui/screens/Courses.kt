package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(14.dp))
            .verticalScroll(rememberScrollState())

    ) {
        Image(
            painter = painterResource(id = R.drawable.undraw_selection_re_ycpo__1_),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .padding(top = 64.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.selectCourse),
            Modifier
                .padding(
                    top = 64.dp,
                    start = 16.dp,
                    bottom = 64.dp
                )
                .fillMaxWidth(),
            fontSize = 26.sp,
            textAlign = TextAlign.Left
        )
        viewModel.cList.forEachIndexed { index, s ->
            CourseCard(
                title = viewModel.cList[index],
                description = stringResource(viewModel.cDescription[index]),
                logo = viewModel.cLogo[index],
                viewModel = viewModel
            )
            Spacer(Modifier.padding(8.dp))
        }
    }
}