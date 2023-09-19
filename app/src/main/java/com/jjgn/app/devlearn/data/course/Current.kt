package com.jjgn.app.devlearn.data.course

sealed class Current {
    object PY : Current()
    object JS : Current()
    object KT : Current()
    object JV : Current()
}