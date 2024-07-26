package com.example.androidmentorshipassignments

import java.util.Scanner

// 4. Check for Leap Year
// Write a Kotlin program to check if a given year is a leap year.

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the year:")
    val year = scanner.nextInt()

    checkLeapYear(year)
}

fun checkLeapYear(year: Int) {
    if((year%400==0)||(year%100 != 0 && year%4 == 0)){
    println("$year is a Leap year")
    }
    else(
        println("$year is Not a Leap year")
    )
}
