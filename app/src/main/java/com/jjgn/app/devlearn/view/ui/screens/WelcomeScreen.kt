package com.jjgn.app.devlearn.view.ui.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
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

@SuppressLint("SwitchIntDef")
@Composable
fun WelcomeScreen() {

    val navController: NavController = LocalNavigationController.current
    val orientation = LocalConfiguration.current

    val constraintSet = ConstraintSet {
        val components = listOf(
            createRefFor(WelcomeScreenComponents.img),
            createRefFor(WelcomeScreenComponents.txt),
            createRefFor(WelcomeScreenComponents.btn)
        )

        constrain(components[0]) {
            when (orientation.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                }

                Configuration.ORIENTATION_LANDSCAPE -> {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                }
            }
        }
        constrain(components[1]) {
            when (orientation.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> {
                    top.linkTo(components[0].bottom, 16.dp)
                    start.linkTo(components[0].start)
                    end.linkTo(components[0].end)

                }

                Configuration.ORIENTATION_LANDSCAPE -> {
                    top.linkTo(components[0].top)
                    start.linkTo(components[0].end)
                    bottom.linkTo(components[0].bottom)
                }
            }
        }
        constrain(components[2]) {
            when (orientation.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> {
                    top.linkTo(components[1].bottom, 24.dp)
                    start.linkTo(components[1].start)
                    end.linkTo(components[1].end)
                }

                Configuration.ORIENTATION_LANDSCAPE -> {
                    top.linkTo(components[1].top)
                    start.linkTo(components[1].end, 16.dp)
                    bottom.linkTo(components[1].bottom)
                }
            }
        }

    }

    Box(
        contentAlignment = Alignment.Center
    ) {
        ConstraintLayout(
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(), constraintSet = constraintSet
        ) {
            Image(
                painter = painterResource(id = R.drawable.undraw_welcoming_re_x0qo__1_),
                contentDescription = "",
                modifier = Modifier
                    .size(W_S_IMG_SIZE)
                    .padding(bottom = paddingValue3)
                    .layoutId(WelcomeScreenComponents.img)
            )
            Text(
                stringResource(R.string.welcome),
                fontSize = W_TEXT_SIZE,
                modifier = Modifier.layoutId(WelcomeScreenComponents.txt)
            )
            Box(
                Modifier
                    .size(IC_BTN_SIZE)
                    .clip(RoundedCornerShape(defaultClipSize))
                    .background(MaterialTheme.colorScheme.primary)
                    .clickable {
                        navController.navigate(NavigationRoutes.Courses.route) {
                            launchSingleTop = true
                        }
                    }
                    .layoutId(WelcomeScreenComponents.btn),
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

sealed class WelcomeScreenComponents(id: String) {
    object img : WelcomeScreenComponents("image")
    object txt : WelcomeScreenComponents("text")
    object btn : WelcomeScreenComponents("button")
}