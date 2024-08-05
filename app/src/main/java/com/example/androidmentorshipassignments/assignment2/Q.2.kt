package com.example.androidmentorshipassignments.assignment2

import java.util.Scanner

//02: Functions: Write a function in Kotlin that takes two numbers as parameters and returns their sum.
fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter first Number: ")
    val num1 = scanner.nextInt()
    println("Enter Second Number: ")
    val num2 = scanner.nextInt()

    if(num1 !=0 && num2 != 0){
        println("Sum: ${sum(num1,num2)}")
    }else{
        println("Kindly give both the numbers")
    }
}

fun sum(num1: Int, num2:Int):Int{
    return num1+num2
}