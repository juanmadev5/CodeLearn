package com.jjgn.app.devlearn.ui.components

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateBefore
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun BottomBar(
    viewModel: AppViewModel,
    buttonNextState: Boolean,
    buttonPrevState: Boolean,
    context: Context,
    navController: NavController
) {
    var nxtButton by remember { mutableStateOf("") }
    nxtButton = if (buttonNextState) {
        "Siguiente"
    } else {
        "Ir a inicio"
    }
    Card(
        Modifier
            .fillMaxWidth()
            .height(70.dp)
            .clip(RoundedCornerShape(14.dp))
            .padding(start = 8.dp, end = 8.dp)
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    viewModel.prevPage()
                    viewModel.dataSaver(context)
                },
                Modifier.height(48.dp).width(140.dp),
                enabled = buttonPrevState
            ) {
                Icon(
                    imageVector = Icons.Filled.NavigateBefore,
                    contentDescription = "Prev page"
                )
                Text(
                    "Anterior"
                )
            }
            Button(
                onClick = {
                    if (!buttonNextState) {
                        navController.popBackStack()
                    } else {
                        viewModel.nextPage()
                    }
                    viewModel.dataSaver(context)
                },
                Modifier.height(48.dp).wrapContentWidth()
            ) {
                Text(
                    nxtButton
                )
                Icon(
                    imageVector = Icons.Filled.NavigateNext,
                    contentDescription = "Next page"
                )
            }
        }
    }
}