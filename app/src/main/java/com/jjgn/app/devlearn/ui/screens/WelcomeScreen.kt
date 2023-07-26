package com.jjgn.app.devlearn.ui.screens

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes

@Composable
fun WelcomeScreen(navController: NavController = LocalNavigationController.current) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.undraw_welcoming_re_x0qo__1_),
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
            )
            Spacer(modifier = Modifier.padding(30.dp))
            Text(
                stringResource(R.string.welcome),
                fontSize = 26.sp
            )
            Spacer(Modifier.padding(top = 60.dp))
            IconButton(
                onClick = { navController.navigate(NavigationRoutes.Courses.route) },
                Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = stringResource(R.string.welcomeDesc),
                    Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.onSecondary
                )
            }
        }
    }
}