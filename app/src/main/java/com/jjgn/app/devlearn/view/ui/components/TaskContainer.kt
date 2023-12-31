@file:OptIn(ExperimentalComposeUiApi::class)

package com.jjgn.app.devlearn.view.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.jjgn.app.devlearn.data.course.moduletask.JSTask1
import com.jjgn.app.devlearn.data.course.moduletask.JSTask2
import com.jjgn.app.devlearn.data.course.moduletask.JSTask3
import com.jjgn.app.devlearn.data.course.moduletask.JSTask4
import com.jjgn.app.devlearn.data.course.moduletask.JSTask5
import com.jjgn.app.devlearn.data.course.moduletask.JVTask1
import com.jjgn.app.devlearn.data.course.moduletask.JVTask2
import com.jjgn.app.devlearn.data.course.moduletask.JVTask3
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task1
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task2
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task3
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task4
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task5
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task6
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task7
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task8
import com.jjgn.app.devlearn.data.course.moduletask.KotlinM1Task9
import com.jjgn.app.devlearn.data.course.moduletask.PythonM1Task1
import com.jjgn.app.devlearn.data.course.moduletask.PythonM1Task2
import com.jjgn.app.devlearn.data.course.moduletask.PythonM1Task3
import com.jjgn.app.devlearn.data.course.moduletask.PythonM1Task4
import com.jjgn.app.devlearn.view.ui.viewmodel.TestViewModel

// Kotlin
@Composable
fun Container1(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task1(testViewModel, show)
    }
}

@Composable
fun Container2(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task2(testViewModel, show)
    }
}

@Composable
fun Container3(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task3(testViewModel, show)
    }
}

@Composable
fun Container4(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task4(testViewModel, show)
    }
}

@Composable
fun Container5(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task5(testViewModel, show)
    }
}

@Composable
fun Container6(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task6(testViewModel, show)
    }
}

@Composable
fun Container7(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task7(testViewModel, show)
    }
}

@Composable
fun Container8(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task8(testViewModel, show)
    }
}

@Composable
fun Container9(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task9(testViewModel, show)
    }
}

// Python
@Composable
fun Container10(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        PythonM1Task1(testViewModel, show)
    }
}

@Composable
fun Container11(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        PythonM1Task2(testViewModel, show)
    }
}

@Composable
fun Container12(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        PythonM1Task3(testViewModel, show)
    }
}

@Composable
fun Container13(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        PythonM1Task4(testViewModel, show)
    }
}

@Composable
fun Container14(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JSTask1(testViewModel, show)
    }
}

@Composable
fun Container15(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JSTask2(testViewModel, show)
    }
}

@Composable
fun Container16(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JSTask3(testViewModel, show)
    }
}

@Composable
fun Container17(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JSTask4(testViewModel, show)
    }
}

@Composable
fun Container18(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JSTask5(testViewModel, show)
    }
}

@Composable
fun Container19(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JVTask1(testViewModel, show)
    }
}

@Composable
fun Container20(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JVTask2(testViewModel, show)
    }
}

@Composable
fun Container21(testViewModel: TestViewModel, show: MutableState<Boolean>) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(14.dp))
    ) {
        JVTask3(testViewModel, show)
    }
}