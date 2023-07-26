package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun ModuleCardContent1(
    progress: Int,
    viewModel: AppViewModel = AccessInstance()
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.tPages[0]
        is Current.JV -> viewModel.tPages[3]
        is Current.JS -> viewModel.tPages[6]
        is Current.PY -> viewModel.tPages[9]
        else -> viewModel.tPages[12]
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.basics),
            stringResource(R.string.languageIcon),
            Modifier
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(Modifier.padding(top = 16.dp))
        Text(
            text = stringResource(R.string.basicsOf) + viewModel.lName,
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
        is Current.KT -> viewModel.tPages[1]
        is Current.JV -> viewModel.tPages[4]
        is Current.JS -> viewModel.tPages[7]
        is Current.PY -> viewModel.tPages[10]
        else -> viewModel.tPages[12]
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.functions),
            stringResource(R.string.languageIcon),
            Modifier
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(Modifier.padding(top = 16.dp))
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
        Text(text = "$progress / $pages",)
    }
}

@Composable
fun ModuleCardContent3(
    progress: Int,
    viewModel: AppViewModel = AccessInstance()
) {
    val pages = when (viewModel.currentState.value) {
        is Current.KT -> viewModel.tPages[2]
        is Current.JV -> viewModel.tPages[5]
        is Current.JS -> viewModel.tPages[8]
        is Current.PY -> viewModel.tPages[11]
        else -> viewModel.tPages[12]
    }
    Column(
        modifier = viewModel.md
    ) {
        Image(
            painter = painterResource(id = R.drawable.oop),
            stringResource(R.string.languageIcon),
            Modifier
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(Modifier.padding(top = 16.dp))
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
        Text(text = "$progress / $pages",)
    }
}