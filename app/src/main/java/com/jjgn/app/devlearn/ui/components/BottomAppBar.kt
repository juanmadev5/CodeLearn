package com.jjgn.app.devlearn.ui.components

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.ui.B_A_BTN_H
import com.jjgn.app.devlearn.ui.B_A_H
import com.jjgn.app.devlearn.ui.B_A_PADD
import com.jjgn.app.devlearn.ui.B_A_W
import com.jjgn.app.devlearn.ui.defaultClipSize
import com.jjgn.app.devlearn.ui.paddingValue1
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun BottomBar(
    buttonNextState: Boolean,
    buttonPrevState: Boolean,
    navController: NavController = LocalNavigationController.current,
    viewModel: AppViewModel = AccessInstance()
) {
    var nxtButton by remember { mutableStateOf("") }
    nxtButton = if (buttonNextState) {
        stringResource(R.string.next)
    } else {
        stringResource(R.string.go_to_home)
    }
    Card(
        Modifier
            .fillMaxWidth()
            .height(70.dp)
            .clip(RoundedCornerShape(defaultClipSize))
            .padding(start = paddingValue1, end = paddingValue1)
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(start = B_A_PADD, end = B_A_PADD),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    viewModel.prevPage()
                },
                Modifier
                    .height(B_A_H)
                    .width(B_A_W),
                enabled = buttonPrevState
            ) {
                Icon(
                    imageVector = Icons.Filled.NavigateBefore,
                    contentDescription = stringResource(R.string.prev_page2)
                )
                Text(
                    stringResource(R.string.prev_page)
                )
            }
            Button(
                onClick = {
                    if (!buttonNextState) {
                        navController.popBackStack()
                    } else {
                        viewModel.nextPage()
                    }
                },
                Modifier
                    .height(B_A_BTN_H)
                    .wrapContentWidth()
            ) {
                Text(
                    nxtButton
                )
                Icon(
                    imageVector = Icons.Filled.NavigateNext,
                    contentDescription = stringResource(R.string.next_page)
                )
            }
        }
    }
}