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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.ui.C_BOTTOM_PADDING
import com.jjgn.app.devlearn.ui.C_TOP_IMAGE
import com.jjgn.app.devlearn.ui.C_TOP_PADDING
import com.jjgn.app.devlearn.ui.C_TOP_TEXT_SIZE
import com.jjgn.app.devlearn.ui.components.CourseCard
import com.jjgn.app.devlearn.ui.defaultClipSize
import com.jjgn.app.devlearn.ui.paddingValue1
import com.jjgn.app.devlearn.ui.paddingValue2
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun CourseSelectorScreen(viewModel: AppViewModel = AccessInstance()) {
    val painter = remember { R.drawable.undraw_selection_re_ycpo__1_ }
    val text = remember { R.string.selectCourse }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(defaultClipSize))
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(painter),
            contentDescription = "",
            modifier = Modifier
                .size(C_TOP_IMAGE)
                .padding(top = C_TOP_PADDING)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(text),
            Modifier
                .padding(
                    top = C_TOP_PADDING,
                    start = paddingValue2,
                    bottom = C_BOTTOM_PADDING
                )
                .fillMaxWidth(),
            fontSize = C_TOP_TEXT_SIZE,
            textAlign = TextAlign.Left
        )
        viewModel.cList.forEachIndexed { index, _ ->
            CourseCard(index)
            Spacer(Modifier.padding(paddingValue1))
        }
    }
}