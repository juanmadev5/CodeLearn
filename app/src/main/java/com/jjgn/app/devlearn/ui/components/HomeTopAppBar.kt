package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun HomeTopAppBar(
    viewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .height(60.dp)
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .clickable {
                        navController.navigate(NavigationRoutes.Courses.route) {
                            launchSingleTop = true
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = App.lName,
                    Modifier.padding(start = 18.dp, end = 18.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(NavigationRoutes.Info.route) {
                        launchSingleTop = true
                    }
                },
                Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(14.dp))
                    .padding(end = 10.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    stringResource(R.string.courseindex),
                    Modifier
                        .size(36.dp)
                        .padding(4.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}