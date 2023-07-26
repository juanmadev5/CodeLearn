package com.jjgn.app.devlearn.controller

sealed class NavigationRoutes(val route: String) {
    object Welcome : NavigationRoutes("welcome")
    object Home : NavigationRoutes("home")
    object Courses : NavigationRoutes("courses")
    object InCourse : NavigationRoutes("inCourse")
    object Practice : NavigationRoutes("practice")
    object Info : NavigationRoutes("app info")
}