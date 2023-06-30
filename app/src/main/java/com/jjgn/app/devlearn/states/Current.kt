package com.jjgn.app.devlearn.states

sealed class Current {
    object PY : Current()
    object JS : Current()
    object KT : Current()
    object JV : Current()
}