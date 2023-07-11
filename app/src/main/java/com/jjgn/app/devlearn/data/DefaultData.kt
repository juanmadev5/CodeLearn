package com.jjgn.app.devlearn.data

import android.content.SharedPreferences
import com.jjgn.app.devlearn.R

/**
 * Propiedades que AppViewModel implementa. Varios son por defecto.
 * */
interface DefaultData {

    val pName: String
        get() = "AppPreferences"

    val cStateValue: String
        get() = "current_state"

    val zValue: String
        get() = "zoom_value"

    val mCurrentPage: String
        get() = "current_page-"

    var pref: SharedPreferences

    var lName: String

    var tlPages: Int

    val cList: List<String>
        get() = listOf(
            "Kotlin",
            "Java",
            "Javascript",
            "Python"
        )

    val cDescription: List<Int>
        get() = listOf(
            R.string.ktDesc,
            R.string.jvDesc,
            R.string.jsDesc,
            R.string.pyDesc
        )

    val cLogo: List<Int>
        get() = listOf(
            R.drawable.kotlin_full_color_logo_mark_rgb,
            R.drawable.java_logo_1,
            R.drawable.javascript_39404,
            R.drawable.python_logo_only
        )
}