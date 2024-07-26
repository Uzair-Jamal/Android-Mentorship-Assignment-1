package com.example.androidmentorshipassignments

import java.util.Scanner

//2. Check for Even or Odd Number
//Write a Kotlin program to check if a given number is even or odd.

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter a number")
    val input = scanner.nextInt()
    checkEvenOdd(input)
}

fun checkEvenOdd(num: Int){
    if(num%2==0){
        println("$num is an Even Number")
    }
    else{
        println("$num is an Odd Number")
    }
}
