package com.jjgn.app.devlearn.data

import android.content.SharedPreferences
import com.jjgn.app.devlearn.R

interface DefaultData {
    // used for SharedPreferences
    val preferenceName: String
        get() = "AppPreferences"
    var preferences: SharedPreferences

    // default value for lang used in Home
    var langName: String

    var totalPages: Int

    // used in Courses
    val coursesList: List<String>
        get() = listOf(
            "Kotlin",
            "Java",
            "Javascript",
            "Python"
        )
    val courseDescription: List<String>
        get() = listOf(
            "Lenguaje de programación moderno y conciso para la plataforma Java. Destaca por su seguridad de tipo y capacidad de interoperabilidad.",
            "Lenguaje de programación popular y ampliamente utilizado. Es orientado a objetos y se caracteriza por su portabilidad y escalabilidad.",
            "Lenguaje de programación interpretado, utilizado principalmente para el desarrollo web. Permite la interacción dinámica con los elementos de una página.",
            "Lenguaje de programación versátil y fácil de aprender. Se utiliza en una amplia gama de aplicaciones, desde desarrollo web hasta análisis de datos."
        )
    val courseLogo: List<Int>
        get() = listOf(
            R.drawable.kotlin_full_color_logo_mark_rgb,
            R.drawable.java_logo_1,
            R.drawable.javascript_39404,
            R.drawable.python_logo_only
        )
}