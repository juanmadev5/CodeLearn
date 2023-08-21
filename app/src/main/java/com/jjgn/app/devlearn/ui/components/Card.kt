package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun CourseCard(
    title: String,
    description: String,
    logo: Int,
    viewModel: AppViewModel,
    navController: NavController = LocalNavigationController.current
) {
    Card(
        Modifier
            .fillMaxWidth()
            .height(228.dp)
            .clip(RoundedCornerShape(20.dp))
            .clickable {
                viewModel.isSelectedFirstC.value = true
                when (title) {
                    "Python" -> {
                        viewModel.setCurrentState(Current.PY)
                    }

                    "Javascript" -> {
                        viewModel.setCurrentState(Current.JS)
                    }

                    "Kotlin" -> {
                        viewModel.setCurrentState(Current.KT)
                    }

                    "Java" -> {
                        viewModel.setCurrentState(Current.JV)
                    }
                }
                viewModel.loader()
                navController.navigate(NavigationRoutes.Home.route)
            }
    ) {
        ConstraintLayout(Modifier.fillMaxSize()) {
            val (cTitle, cDesc, cLogo) = createRefs()
            Image(
                painter = painterResource(id = logo),
                "",
                Modifier
                    .constrainAs(cLogo) {
                        top.linkTo(parent.top, 24.dp)
                        start.linkTo(parent.start, 24.dp)
                    }
                    .size(45.dp)
            )
            Text(
                text = title,
                Modifier.constrainAs(cTitle) {
                    top.linkTo(cLogo.top)
                    start.linkTo(cLogo.end, 24.dp)
                    bottom.linkTo(cLogo.bottom)
                },
                fontSize = 20.sp
            )
            Text(
                text = description,
                Modifier
                    .constrainAs(cDesc) {
                        start.linkTo(parent.start, 24.dp)
                        bottom.linkTo(parent.bottom, 20.dp)
                        end.linkTo(parent.end, 24.dp)
                    }
                    .width(325.dp)
                    .wrapContentHeight(),
                fontSize = 14.sp
            )
        }
    }
}