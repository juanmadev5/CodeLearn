package com.jjgn.app.devlearn.view.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material.icons.filled.ZoomOut
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.defaultClipSize
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import kotlinx.coroutines.delay

@Composable
fun TopBar(
    page: Int,
    textSizeState: MutableState<Boolean>,
    txtSize: Int,
    viewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {

    Card(
        Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(14.dp))
            .padding(start = 8.dp, end = 8.dp)
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier
                        .fillMaxHeight()
                        .width(64.dp)
                        .clip(RoundedCornerShape(defaultClipSize))
                        .clickable { navController.popBackStack() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "",
                        Modifier.padding(8.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
                Spacer(modifier = Modifier.padding(start = 8.dp))
                if (textSizeState.value) {
                    TextSizeState(textSizeState, txtSize)
                } else {
                    CurrentPage(page)
                }
            }

            Box(
                Modifier
                    .fillMaxHeight()
                    .width(110.dp)
            ) {
                Row(
                    Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = {
                            if (viewModel.textSize.intValue < 20) {
                                viewModel.textSize.intValue++
                                textSizeState.value = true
                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ZoomIn,
                            contentDescription = "zoom in",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                    IconButton(
                        onClick = {
                            if (viewModel.textSize.intValue > 0) {
                                viewModel.textSize.intValue--
                                textSizeState.value = true
                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ZoomOut,
                            contentDescription = "zoom out",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CurrentPage(page: Int) {
    Text(
        stringResource(R.string.page) + page,
        fontSize = 14.sp,
        color = MaterialTheme.colorScheme.onSurface,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TextSizeState(zoomState: MutableState<Boolean>, txtSize: Int, delay: Long = 2800) {
    LaunchedEffect(true) {
        delay(delay)
        zoomState.value = false
    }
    if (zoomState.value) {

        Text(
            stringResource(R.string.fontSize) + "$txtSize sp",
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}