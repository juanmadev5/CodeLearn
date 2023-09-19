package com.jjgn.app.devlearn.view.ui.screens

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
import androidx.compose.ui.res.painterResource
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.AS_BPADD
import com.jjgn.app.devlearn.view.ui.AS_IMG_S

@Composable
fun AwaitScreen() {
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
                    .padding(bottom = AS_BPADD)
                    .size(AS_IMG_S)
                    .align(Alignment.CenterHorizontally)
            )
            Text("Cargando...", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}