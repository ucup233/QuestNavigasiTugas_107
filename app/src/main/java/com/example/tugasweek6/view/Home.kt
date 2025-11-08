package com.example.tugasweek6.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.tugasweek6.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Home(
    modifier : Modifier = Modifier,
    onSubmitBtnClick: () -> Unit
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Text(text = "Selamat Datang",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A0DAD),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(70.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.logo_umy),
            contentDescription = "Logo Umy",
            modifier = Modifier
                .size(180.dp)
                .padding(2.dp)
        )
        Spacer(modifier = Modifier.height(50.dp)
        )

    }
}
