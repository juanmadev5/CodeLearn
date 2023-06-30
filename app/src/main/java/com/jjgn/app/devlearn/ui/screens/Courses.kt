package com.jjgn.app.devlearn.ui.screens

import android.content.SharedPreferences
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jjgn.app.devlearn.ui.components.CourseCard
import com.jjgn.app.devlearn.viewmodel.AppViewModel

/**
 * Modificacion pendiente
 */
@Composable
fun CourseSelectorScreen(
    viewModel: AppViewModel,
    navController: NavController,
    preference: SharedPreferences
) {
    LazyColumn(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            Text(
                text = "Seleccione un curso",
                Modifier
                    .padding(
                        top = 96.dp,
                        start = 16.dp,
                        bottom = 96.dp
                    )
                    .fillMaxWidth(),
                fontSize = 26.sp,
                textAlign = TextAlign.Left
            )
        }
        items(4) {
            CourseCard(
                title = viewModel.coursesList[it],
                description = viewModel.courseDescription[it],
                logo = viewModel.courseLogo[it],
                viewModel = viewModel,
                navController = navController,
                preferences = preference
            )
            Spacer(Modifier.padding(5.dp))
        }
        item {
            Spacer(Modifier.padding(28.dp))
        }
    }
}