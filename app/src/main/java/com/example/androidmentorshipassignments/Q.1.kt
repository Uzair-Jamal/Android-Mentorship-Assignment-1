package com.example.androidmentorshipassignments

import java.util.Scanner

//1. Check if a Number is Positive or Negative
// Write a Kotlin program to check if a given number is positive, negative, or zero.

fun main() {

    val scanner = Scanner(System.`in`)

    println("Enter the the number")
    val input = scanner.nextInt()

    checkNumber(input)
}

fun checkNumber(num : Int){
    if(num > 0){
        println("positive")
    }
    else if(num < 0){
        println("negative")
    }
    else{
        println("Zero")
    }
}