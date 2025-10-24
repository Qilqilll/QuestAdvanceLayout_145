package com.example.testing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3.R

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Text(
            text = "Teknologi Informasi",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4A148C)
        )
        Text(
            text = "Universitas Muhammadiyah Yogyakarta",
            fontSize = 18.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(30.dp))

        // === CARD 1 ===
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(end = 16.dp)
                )
                Column {
                    Text(
                        text = "Muhammad Aqil Firdaus",
                        fontSize = 28.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = "Jawa barat, Bekasi",
                        fontSize = 18.sp,
                        color = Color.Yellow
                    )
                }
            }
        }

        // === CARD 2 ===
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ) {
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(end = 16.dp)
                )
                Column {
                    Text(
                        text = "Damar Sadewa Putra",
                        fontSize = 28.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = "20230140110",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                    Text(
                        text = "Sumatra, Jambi",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }
            }
        }
        // === CARD 3 ===
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red
            )
        ) {
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
