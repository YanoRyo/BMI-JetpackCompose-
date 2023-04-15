package com.example.bmicalculatorjetpackcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow
import kotlin.math.roundToInt

class MainViewModel: ViewModel() {
    var height by mutableStateOf("")
    var weight by mutableStateOf("")
    var bmi by mutableStateOf(0f)

    // bmi = 体重 / 身長 ** 2
    fun calculateBMI() {
        val heightNumber = height.toFloatOrNull()?.div(100) ?: 0f
        val weightNumber = height.toFloatOrNull() ?: 0f

        bmi = if(heightNumber > 0f && weightNumber > 0){
            (weightNumber / heightNumber.pow(2) * 10).roundToInt() / 10f
        }else{
            0f
        }
    }

}