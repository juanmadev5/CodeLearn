package com.jjgn.app.devlearn.view.ui.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.jjgn.app.devlearn.App
import com.jjgn.app.devlearn.R
import com.jjgn.app.devlearn.data.course.Current
import com.jjgn.app.devlearn.view.ui.CARD_HEIGHT
import com.jjgn.app.devlearn.view.ui.C_BOTTOM_PADDING
import com.jjgn.app.devlearn.view.ui.C_TOP_IMAGE
import com.jjgn.app.devlearn.view.ui.C_TOP_PADDING
import com.jjgn.app.devlearn.view.ui.DESC_W
import com.jjgn.app.devlearn.view.ui.IMG_SIZE
import com.jjgn.app.devlearn.view.ui.PADD1
import com.jjgn.app.devlearn.view.ui.PADD2
import com.jjgn.app.devlearn.view.ui.TXT2_SIZE
import com.jjgn.app.devlearn.view.ui.TXT_SIZE
import com.jjgn.app.devlearn.view.ui.controller.LocalNavigationController
import com.jjgn.app.devlearn.view.ui.controller.NavigationRoutes
import com.jjgn.app.devlearn.view.ui.defaultClipSize
import com.jjgn.app.devlearn.view.ui.paddingValue1
import com.jjgn.app.devlearn.view.ui.paddingValue2
import com.jjgn.app.devlearn.view.ui.viewmodel.AccessInstance
import com.jjgn.app.devlearn.view.ui.viewmodel.AppViewModel
import com.jjgn.app.devlearn.view.ui.C_TOP_TEXT_SIZE as C_TOP_TEXT_SIZE1

@SuppressLint("SwitchIntDef")
@Composable
fun CourseSelectorScreen() {

    val orientation = LocalConfiguration.current

    when (orientation.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(defaultClipSize))
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(R.drawable.undraw_selection_re_ycpo__1_),
                    contentDescription = "",
                    modifier = Modifier
                        .size(C_TOP_IMAGE)
                        .padding(top = C_TOP_PADDING)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = stringResource(R.string.selectCourse),
                    Modifier
                        .padding(
                            top = C_TOP_PADDING,
                            start = paddingValue2,
                            bottom = C_BOTTOM_PADDING
                        )
                        .fillMaxWidth(),
                    fontSize = C_TOP_TEXT_SIZE1,
                    textAlign = TextAlign.Left
                )
                App.cList.forEachIndexed { index, _ ->
                    CourseCard(index)
                    Spacer(Modifier.padding(paddingValue1))
                }
            }
        }
        Configuration.ORIENTATION_LANDSCAPE -> {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(defaultClipSize))
                    .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.wrapContentSize().padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Text(
                            text = stringResource(R.string.selectCourse),
                            Modifier.fillMaxWidth(),
                            fontSize = C_TOP_TEXT_SIZE1,
                            textAlign = TextAlign.Left
                        )
                        Image(
                            painter = painterResource(R.drawable.undraw_selection_re_ycpo__1_),
                            contentDescription = "",
                            modifier = Modifier.size(C_TOP_IMAGE)
                        )
                    }
                }
                App.cList.forEachIndexed { index, _ ->
                    CourseCard(index)
                    Spacer(Modifier.padding(paddingValue1))
                }
            }
        }
    }
}
@Composable
fun CourseCard(
    index: Int,
    viewModel: AppViewModel = AccessInstance(),
    navController: NavController = LocalNavigationController.current
) {
    val title = App.cList[index]
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
                painter = painterResource(id = App.cLogo[index]),
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
                text = stringResource(App.cDescription[index]),
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