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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.jjgn.app.devlearn.controller.LocalNavigationController
import com.jjgn.app.devlearn.controller.NavigationRoutes
import com.jjgn.app.devlearn.states.Current
import com.jjgn.app.devlearn.ui.CARD_HEIGHT
import com.jjgn.app.devlearn.ui.DESC_W
import com.jjgn.app.devlearn.ui.IMG_SIZE
import com.jjgn.app.devlearn.ui.PADD1
import com.jjgn.app.devlearn.ui.PADD2
import com.jjgn.app.devlearn.ui.TXT2_SIZE
import com.jjgn.app.devlearn.ui.TXT_SIZE
import com.jjgn.app.devlearn.viewmodel.AccessInstance
import com.jjgn.app.devlearn.viewmodel.AppViewModel

@Composable
fun CourseCard(
    index: Int,
    viewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {
    val title = viewModel.cList[index]
    Card(
        Modifier
            .fillMaxWidth()
            .height(CARD_HEIGHT)
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
                navController.navigate(NavigationRoutes.Home.route) {
                    launchSingleTop = true
                }
            }
    ) {
        ConstraintLayout(Modifier.fillMaxSize()) {
            val (cTitle, cDesc, cLogo) = createRefs()
            Image(
                painter = painterResource(id = viewModel.cLogo[index]),
                "",
                Modifier
                    .constrainAs(cLogo) {
                        top.linkTo(parent.top, PADD1)
                        start.linkTo(parent.start, PADD1)
                    }
                    .size(IMG_SIZE)
            )
            Text(
                text = title,
                Modifier.constrainAs(cTitle) {
                    top.linkTo(cLogo.top)
                    start.linkTo(cLogo.end, PADD1)
                    bottom.linkTo(cLogo.bottom)
                },
                fontSize = TXT_SIZE
            )
            Text(
                text = stringResource(viewModel.cDescription[index]),
                Modifier
                    .constrainAs(cDesc) {
                        start.linkTo(parent.start, PADD1)
                        bottom.linkTo(parent.bottom, PADD2)
                        end.linkTo(parent.end, PADD1)
                    }
                    .width(DESC_W)
                    .wrapContentHeight(),
                fontSize = TXT2_SIZE
            )
        }
    }
}