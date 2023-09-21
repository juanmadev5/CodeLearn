package com.jjgn.app.devlearn.view.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.IC_BTN_ICON
import com.jjgn.app.devlearn.view.ui.IC_BTN_SIZE
import com.jjgn.app.devlearn.view.ui.W_S_IMG_SIZE
import com.jjgn.app.devlearn.view.ui.W_TEXT_SIZE
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.defaultClipSize
import com.jjgn.app.devlearn.view.ui.paddingValue3
import com.jjgn.app.devlearn.view.ui.paddingValue4
import kotlinx.coroutines.delay

@Composable
fun WelcomeScreen(navController: NavController = LocalNavigationController.current) {

    var visible1 by remember { mutableStateOf(false) }
    var visible2 by remember { mutableStateOf(false) }
    var visible3 by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(100)
        visible1 = true
        delay(150)
        visible2 = true
        delay(150)
        visible3 = true
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            AnimatedVisibility(
                visible = visible1,
                enter = fadeIn(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY)),
                exit = fadeOut(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.undraw_welcoming_re_x0qo__1_),
                    contentDescription = "",
                    modifier = Modifier
                        .size(W_S_IMG_SIZE)
                        .padding(bottom = paddingValue3)
                )
            }

            AnimatedVisibility(
                visible = visible2,
                enter = fadeIn(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY)),
                exit = fadeOut(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY))
            ) {
                Text(
                    stringResource(R.string.welcome),
                    fontSize = W_TEXT_SIZE,
                    modifier = Modifier.padding(top = paddingValue4, bottom = paddingValue3)
                )
            }

            AnimatedVisibility(
                visible = visible3,
                enter = fadeIn(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY)),
                exit = fadeOut(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY))
            ) {
                Box(
                    Modifier
                        .size(IC_BTN_SIZE)
                        .clip(RoundedCornerShape(defaultClipSize))
                        .background(MaterialTheme.colorScheme.primary)
                        .align(Alignment.CenterHorizontally)
                        .clickable {
                            navController.navigate(NavigationRoutes.Courses.route) {
                                launchSingleTop = true
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = stringResource(R.string.welcomeDesc),
                        Modifier.size(IC_BTN_ICON),
                        tint = MaterialTheme.colorScheme.onSecondary
                    )
                }
            }
        }
    }
}