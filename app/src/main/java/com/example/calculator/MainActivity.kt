package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calc()
                }
            }
        }
    }
}

@Composable
fun Calc() {
    var count by remember { mutableStateOf("0") }
    Surface(
        modifier= Modifier
            .fillMaxSize()
            .padding(10.dp),
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.90f)
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = count,
                    fontSize = 50.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentHeight()


                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.25f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "1",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "1"
                                } else {
                                    count += "1"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "2",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "2"
                                } else {
                                    count += "2"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "3",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "3"
                                } else {
                                    count += "3"
                                }
                            }
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.25f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "4",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "4"
                                } else {
                                    count += "4"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "5",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "5"
                                } else {
                                    count += "5"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "6",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "6"
                                } else {
                                    count += "6"
                                }
                            }

                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.25f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "7",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "7"
                                } else {
                                    count += "7"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "8",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "8"
                                } else {
                                    count += "8"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "9",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "9"
                                } else {
                                    count += "9"
                                }
                            }
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.25f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "0",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count == "0") {
                                    count = "0"
                                } else {
                                    count += "0"
                                }
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "+",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                count += "+"
                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(.33f)
                ) {
                    Text(
                        text = "-",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                count += "-"
                            }
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.15f)
            ) {
                Column(
                    modifier = Modifier
                        .weight(.5f)
                ) {
                    Text(
                        text = "Enter",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (count.contains("+")) {
                                    val terms = count.split("+")
                                    count = (terms[0].toInt() + terms[1].toInt()).toString()
                                } else if (count.contains("-")) {
                                    val terms = count.split("-")
                                    count = (terms[0].toInt() - terms[1].toInt()).toString()
                                }

                            }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(.5f)
                ) {
                    Text(
                        text = "Clear",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                count = "0"
                            }
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalcPreview() {
    Calc()
}