package com.jjgn.app.devlearn.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun AwaitScreen(
    appViewModel: AppViewModel = AccessInstance()
) {
    appViewModel.dataRestorer(LocalContext.current)
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.undraw_loading_re_5axr),
                contentDescription = "",
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .size(300.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text("Cargando...", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }

}