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
import com.jjgn.app.devlearn.ui.screens.AppInfoScreen
import com.jjgn.app.devlearn.ui.screens.CourseSelectorScreen
import com.jjgn.app.devlearn.ui.screens.HomeScreen
import com.jjgn.app.devlearn.ui.screens.InCourseScreen
import com.jjgn.app.devlearn.ui.screens.IndexScreen
import com.jjgn.app.devlearn.ui.screens.PracticeScreen
import com.jjgn.app.devlearn.ui.screens.WelcomeScreen
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

/**
 * Permite acceder al navController sin necesidad de pasarle a cada funcion el
 * navController como parametro
 * */
val LocalNavigationController = staticCompositionLocalOf<NavController> {
    error("NavController not provided")
}

/**
 * Controlador de navegacion de la aplicacion. Permite navegar a las
 * distintas pantallas y muestra el contenido. Utiliza [CompositionLocalProvider] para
 * que se pueda acceder al controlador de navegacion en lugares necesarios sin necesidad
 * de pasar por parametro navController a cada Composable.
 * Se accede al controlador desde [LocalNavigationController]
 * */
@Composable
fun NvController(
    viewModel: AppViewModel = AccessInstance(),
    navController: NavHostController = rememberNavController(),
    route: String = if (
        viewModel.isSelectedFirstC.value
    ) NavigationRoutes.Home.route else NavigationRoutes.Welcome.route
) {
    CompositionLocalProvider(LocalNavigationController provides navController) {
        NavHost(
            navController = navController,
            startDestination = route
        ) {
            composable(NavigationRoutes.Welcome.route) {
                WelcomeScreen()
            }
            composable(NavigationRoutes.Home.route) {
                HomeScreen()
            }
            composable(NavigationRoutes.Courses.route) {
                CourseSelectorScreen()
            }
            composable(NavigationRoutes.InCourse.route) {
                InCourseScreen()
            }
            composable(NavigationRoutes.Practice.route) {
                PracticeScreen()
            }
            composable(NavigationRoutes.Info.route) {
                IndexScreen()
            }
            composable(NavigationRoutes.AppInfo.route) {
                AppInfoScreen()
            }
        }
    }
}