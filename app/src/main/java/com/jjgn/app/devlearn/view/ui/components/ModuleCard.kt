package com.jjgn.app.devlearn.view.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.view.ui.viewmodel.core.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel

@Composable
fun ModuleCardContent1(
    progress: Int,
    viewModel: AppViewModel = AccessInstance()
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.totalPage[0]
        is Current.JV -> viewModel.totalPage[3]
        is Current.JS -> viewModel.totalPage[6]
        is Current.PY -> viewModel.totalPage[9]
        else -> viewModel.totalPage[12]
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.undraw_code_thinking_re_gka2),
            stringResource(R.string.languageIcon),
            Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.basicsOf) + App.lName,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(
            text = stringResource(R.string.cardDesc1),
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(
            text = "$progress / $pages",
        )
    }
}

@Composable
fun ModuleCardContent2(
    progress: Int,
    viewModel: AppViewModel = AccessInstance()
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.totalPage[1]
        is Current.JV -> viewModel.totalPage[4]
        is Current.JS -> viewModel.totalPage[7]
        is Current.PY -> viewModel.totalPage[10]
        else -> viewModel.totalPage[12]
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.undraw_proud_coder_re_exuy),
            stringResource(R.string.languageIcon),
            Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.fnArray),
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(
            text = stringResource(R.string.fnArrayDesc),
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(text = "$progress / $pages")
    }
}

@Composable
fun ModuleCardContent3(
    progress: Int,
    viewModel: AppViewModel = AccessInstance()
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.totalPage[2]
        is Current.JV -> viewModel.totalPage[5]
        is Current.JS -> viewModel.totalPage[8]
        is Current.PY -> viewModel.totalPage[11]
        else -> viewModel.totalPage[12]
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.undraw_software_engineer_re_tnjc),
            stringResource(R.string.languageIcon),
            Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.oop),
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(
            text = stringResource(R.string.oop_desc),
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(text = "$progress / $pages")
    }
}