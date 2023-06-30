@file:Suppress("DEPRECATION")

package com.jjgn.app.devlearn.controller

import android.content.Context
import android.preference.PreferenceManager
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjgn.app.devlearn.ui.screens.CourseSelectorScreen
import com.jjgn.app.devlearn.ui.screens.HomeScreen
import com.jjgn.app.devlearn.ui.screens.InCourseScreen
import com.jjgn.app.devlearn.ui.screens.Preferences
import com.jjgn.app.devlearn.ui.screens.WelcomeScreen
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun NvController(
    viewModel: AppViewModel,
    context: Context
) {
    val navController = rememberNavController()
    val preferences = PreferenceManager.getDefaultSharedPreferences(context)
    val firstCourseSelected = preferences.getBoolean("firstCourseSelected", false)
    val route = if (firstCourseSelected) {
        NavigationRoutes.Home.route
    } else {
        NavigationRoutes.Welcome.route
    }
    NavHost(
        navController = navController,
        startDestination = route
    ) {
        composable(NavigationRoutes.Welcome.route) {
            WelcomeScreen(navController)
        }
        composable(NavigationRoutes.Home.route) {
            HomeScreen(navController, viewModel, context)
        }
        composable(NavigationRoutes.Courses.route) {
            CourseSelectorScreen(
                viewModel,
                navController,
                preferences
            )
        }
        composable(NavigationRoutes.InCourse.route) {
            InCourseScreen(viewModel, context, navController)
        }
        composable(NavigationRoutes.Practice.route) {

        }
        composable(NavigationRoutes.Preferences.route) {
            Preferences()
        }
    }
}

sealed class NavigationRoutes(val route: String) {
    object Welcome : NavigationRoutes("welcome")
    object Home : NavigationRoutes("home")
    object Courses : NavigationRoutes("courses")
    object InCourse : NavigationRoutes("inCourse")
    object Practice : NavigationRoutes("practice")
    object Preferences : NavigationRoutes("preferences")
}