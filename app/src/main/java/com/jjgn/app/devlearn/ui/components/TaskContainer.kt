package com.jjgn.app.devlearn.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.jjgn.app.devlearn.viewmodel.PracticeViewModel

@Composable
fun Container1(practiceViewModel: PracticeViewModel) {
    Spacer(Modifier.padding(top = 16.dp))
    Card(
        Modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(RoundedCornerShape(14.dp))
    ) {
        KotlinM1Task1(practiceViewModel)
    }
}