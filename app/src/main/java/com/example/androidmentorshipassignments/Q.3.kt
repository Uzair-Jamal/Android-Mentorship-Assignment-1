package com.example.androidmentorshipassignments

import java.util.Scanner

// 3. Find the Largest of Three Numbers
// Write a Kotlin program to find the largest among three numbers.

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter 1st Number:")
    val num1 = scanner.nextInt()
    println("Enter 2nd Number:")
    val num2 = scanner.nextInt()
    println("Enter 3rd Number:")
    val num3 = scanner.nextInt()

    checkTheLargestNumber(num1,num2,num3)
}

fun checkTheLargestNumber(num1: Int, num2: Int, num3: Int) {
        if(num1 >= num2 && num1 >= num3 ){
            println("$num1 is the Largest Number")
        }
        else if(num2 >= num1 && num2 >= num3){
            println("$num2 is the largest Number")
        }
        else if(num3 >= num1 && num3 >= num2 ){
            println("$num3 is the Largest Number")
        }
    }

