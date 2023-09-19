package com.jjgn.app.devlearn.view.ui.controller

import androidx.compose.animation.AnimatedContentTransitionScope
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.view.ui.screens.AppInfoScreen
import com.jjgn.app.devlearn.view.ui.screens.AwaitScreen
import com.jjgn.app.devlearn.view.ui.screens.CourseSelectorScreen
import com.jjgn.app.devlearn.view.ui.screens.HomeScreen
import com.jjgn.app.devlearn.view.ui.screens.InCourseScreen
import com.jjgn.app.devlearn.view.ui.screens.IndexScreen
import com.jjgn.app.devlearn.view.ui.screens.PracticeScreen
import com.jjgn.app.devlearn.view.ui.screens.WelcomeScreen
import com.jjgn.app.devlearn.view.ui.theme.DevLearnTheme
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
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
fun Navigation() {

    val viewModel = AccessInstance<AppViewModel>()
    val navController = rememberNavController()
    val loading = remember { mutableStateOf(true) }
    val route = if (
        viewModel.isSelectedFirstC.value
    ) NavigationRoutes.Home.route else NavigationRoutes.Welcome.route
    val animationSpec = 400

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
                        startDestination = route,
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween(animationSpec)
                            )
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                                animationSpec = tween(animationSpec)
                            )
                        },
                        popEnterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                                animationSpec = tween(animationSpec)
                            )
                        },
                        popExitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                                animationSpec = tween(animationSpec)
                            )
                        }
                    ) {
                        composable(route = NavigationRoutes.Welcome.route) {
                            WelcomeScreen()
                        }
                        composable(route = NavigationRoutes.Home.route) {
                            HomeScreen()
                        }
                        composable(route = NavigationRoutes.Courses.route) {
                            CourseSelectorScreen()
                        }
                        composable(route = NavigationRoutes.InCourse.route) {
                            InCourseScreen()
                        }
                        composable(route = NavigationRoutes.Practice.route) {
                            PracticeScreen()
                        }
                        composable(route = NavigationRoutes.Info.route) {
                            IndexScreen()
                        }
                        composable(route = NavigationRoutes.AppInfo.route) {
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

/***
 * Rutas de navegacion que usa el NavController para navegar entre
 * las distintas pantallas.
 * */
sealed class NavigationRoutes(val route: String) {
    object Welcome : NavigationRoutes("welcome")
    object Home : NavigationRoutes("home")
    object Courses : NavigationRoutes("courses")
    object InCourse : NavigationRoutes("inCourse")
    object Practice : NavigationRoutes("practice")
    object Info : NavigationRoutes("info")
    object AppInfo : NavigationRoutes("app info")
}