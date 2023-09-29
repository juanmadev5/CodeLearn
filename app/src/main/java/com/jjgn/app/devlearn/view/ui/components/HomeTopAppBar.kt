package com.jjgn.app.devlearn.view.ui.components

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatListBulleted
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import com.jjgn.app.devlearn.view.ui.viewmodel.core.AccessInstance

@SuppressLint("SwitchIntDef")
@Composable
fun HomeTopAppBar() {
    val navController: NavController = LocalNavigationController.current
    val orientation = LocalConfiguration.current
    val viewModel: AppViewModel = AccessInstance()

    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 20.dp)
    ) {
        when (orientation.orientation) {
            Configuration.ORIENTATION_PORTRAIT -> {
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
                            .clip(RoundedCornerShape(14.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = viewModel.courseDataManager.getLangName(viewModel.currentState),
                            Modifier.padding(start = 18.dp, end = 18.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Box(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp)
                    ) {
                        Row(
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
                                Row(
                                    Modifier.padding(start = 8.dp, end = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.FormatListBulleted,
                                        contentDescription = stringResource(R.string.courses),
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                    Text(
                                        text = stringResource(R.string.courses),
                                        Modifier.padding(start = 8.dp),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.padding(start = 8.dp))
                            Box(
                                Modifier
                                    .height(60.dp)
                                    .wrapContentWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .clickable {
                                        navController.navigate(NavigationRoutes.Info.route) {
                                            launchSingleTop = true
                                        }
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    Modifier.padding(start = 8.dp, end = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.MoreVert,
                                        stringResource(R.string.index),
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                    Text(
                                        text = stringResource(R.string.index),
                                        Modifier.padding(start = 8.dp),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Configuration.ORIENTATION_LANDSCAPE -> {
                Box(
                    Modifier
                        .height(60.dp)
                        .wrapContentWidth()
                        .padding(8.dp)
                        .clip(RoundedCornerShape(14.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = viewModel.courseDataManager.getLangName(viewModel.currentState),
                        Modifier.padding(start = 18.dp, end = 18.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
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
                    Row(
                        Modifier.padding(start = 8.dp, end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Filled.FormatListBulleted,
                            contentDescription = stringResource(R.string.courses),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = stringResource(R.string.courses),
                            Modifier.padding(start = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Box(
                    Modifier
                        .height(60.dp)
                        .wrapContentWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .clickable {
                            navController.navigate(NavigationRoutes.Info.route) {
                                launchSingleTop = true
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        Modifier.padding(start = 8.dp, end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            stringResource(R.string.index),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = stringResource(R.string.index),
                            Modifier.padding(start = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }


}