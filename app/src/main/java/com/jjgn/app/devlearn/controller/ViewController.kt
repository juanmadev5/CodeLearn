package com.jjgn.app.devlearn.controller

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.ui.screens.AppInfoScreen
import com.jjgn.app.devlearn.ui.screens.AwaitScreen
import com.jjgn.app.devlearn.ui.screens.CourseSelectorScreen
import com.jjgn.app.devlearn.ui.screens.HomeScreen
import com.jjgn.app.devlearn.ui.screens.InCourseScreen
import com.jjgn.app.devlearn.ui.screens.IndexScreen
import com.jjgn.app.devlearn.ui.screens.PracticeScreen
import com.jjgn.app.devlearn.ui.screens.WelcomeScreen
import com.jjgn.app.devlearn.ui.theme.DevLearnTheme
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel
import kotlinx.coroutines.delay

/**
 * Permite acceder al navController sin necesidad de pasarle a cada funcion el
 * navController como parametro
 * */
val LocalNavigationController = staticCompositionLocalOf<NavController> {
    error("NavController not provided")
}

/**
 * Controlador vista y de navegacion de la aplicacion. Permite navegar a las
 * distintas pantallas y muestra el contenido. Utiliza [CompositionLocalProvider] para
 * que se pueda acceder al controlador de navegacion en lugares necesarios sin necesidad
 * de pasar por parametro navController a cada Composable.
 * Se accede al controlador desde [LocalNavigationController]
 * */
@Composable
fun ViewController(
    viewModel: AppViewModel = AccessInstance(),
    navController: NavHostController = rememberNavController(),
    loading: MutableState<Boolean> = remember { mutableStateOf(true) },
    route: String = if (
        viewModel.isSelectedFirstC.value
    ) NavigationRoutes.Home.route else NavigationRoutes.Welcome.route
) {
    LaunchedEffect(true) {
        delay(App.AWAIT_CONTROLLER_DELAY)
        loading.value = false
    }
    DevLearnTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AnimatedVisibility(
                visible = !loading.value,
                enter = fadeIn(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY)),
                exit = fadeOut(tween(durationMillis = App.ANIMATED_VISIBILITY_DELAY))
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
            if (loading.value) {
                AwaitScreen()
            }
        }
    }
}