package com.jjgn.app.devlearn.view.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
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

@Composable
fun WelcomeScreen(navController: NavController = LocalNavigationController.current) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.undraw_welcoming_re_x0qo__1_),
                contentDescription = "",
                modifier = Modifier
                    .size(W_S_IMG_SIZE)
            )
            Spacer(modifier = Modifier.padding(paddingValue3))
            Text(
                stringResource(R.string.welcome),
                fontSize = W_TEXT_SIZE
            )
            Spacer(Modifier.padding(top = paddingValue4))
            IconButton(
                onClick = {
                    navController.navigate(NavigationRoutes.Courses.route) {
                        launchSingleTop = true
                    }
                },
                Modifier
                    .size(IC_BTN_SIZE)
                    .clip(RoundedCornerShape(defaultClipSize))
                    .background(MaterialTheme.colorScheme.primary)
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