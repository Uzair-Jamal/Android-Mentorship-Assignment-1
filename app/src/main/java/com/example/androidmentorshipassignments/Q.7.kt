package com.example.androidmentorshipassignments

import java.util.Scanner

//7. Calculate Electricity Bill
// Write a Kotlin program to calculate the electricity bill based on the following criteria:
// - For the first 100 units: Rs. 1 per unit
// - For the next 100 units: Rs. 1.5 per unit
// - Beyond 200 units: Rs. 2 per unit

fun main(){

    val scanner = Scanner(System.`in`)

    println("Enter the units in the Electricity Bill:")
    val units = scanner.nextInt()

    println(electricityBill(units))
}
var finalBill = 0.0
fun electricityBill(units: Int): Double {
    if(units <= 100){
        finalBill = units * 1.0
    }
    else if(units > 100 && units <= 200){
        finalBill = (100 * 1.0) + ((units-100) * 1.5)
    }else if(units > 200){
        finalBill = (100 * 1.0)+ (100*1.5) + ((units - 200) * 2)
    }
    return finalBill
}
