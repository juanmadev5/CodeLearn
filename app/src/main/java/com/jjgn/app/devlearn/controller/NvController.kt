@file:Suppress("DEPRECATION")

package com.jjgn.app.devlearn.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjgn.app.devlearn.ui.screens.CourseSelectorScreen
import com.jjgn.app.devlearn.ui.screens.HomeScreen
import com.jjgn.app.devlearn.ui.screens.InCourseScreen
import com.jjgn.app.devlearn.ui.screens.PracticeScreen
import com.jjgn.app.devlearn.ui.screens.WelcomeScreen
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import com.jjgn.app.devlearn.viewmodel.TestViewModel

val LocalNvController = staticCompositionLocalOf<NavController> {
    error("NavController not provided")
}
/**
 * Controlador de navegacion de la aplicacion. Permite navegar a las
 * distintas pantallas y muestra el contenido. Utiliza [CompositionLocalProvider] para
 * que se pueda acceder al controlador de navegacion en lugares necesarios sin necesidad
 * de pasar por parametro navController a cada Composable.
 * Se accede al controlador desde [LocalNvController]
 * */
@Composable
fun NvController(
    viewModel: AppViewModel,
    testViewModel: TestViewModel,
    navController: NavHostController = rememberNavController(),
    route: String = if (
        viewModel.pref.getBoolean(viewModel.fSelected, false)
    ) NavigationRoutes.Home.route else NavigationRoutes.Welcome.route
) {
    CompositionLocalProvider(LocalNvController provides navController) {
        NavHost(
            navController = navController,
            startDestination = route
        ) {
            composable(NavigationRoutes.Welcome.route) {
                WelcomeScreen()
            }
            composable(NavigationRoutes.Home.route) {
                HomeScreen(viewModel, testViewModel)
            }
            composable(NavigationRoutes.Courses.route) {
                CourseSelectorScreen(viewModel)
            }
            composable(NavigationRoutes.InCourse.route) {
                InCourseScreen(viewModel, testViewModel)
            }
            composable(NavigationRoutes.Practice.route) {
                PracticeScreen(viewModel, testViewModel)
            }
            composable(NavigationRoutes.Info.route) {

            }
        }
    }
}