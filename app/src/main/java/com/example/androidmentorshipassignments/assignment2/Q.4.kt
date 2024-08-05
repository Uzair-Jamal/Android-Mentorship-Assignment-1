package com.example.androidmentorshipassignments.assignment2

import java.util.Scanner

//04: Nested If: Write a Kotlin program that takes three numbers from the user and prints the
// largest one using nested if statements.

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the first Number: ")
    val num1 = scanner.nextInt()
    println("Enter the second Number: ")
    val num2 = scanner.nextInt()
    println("Enter third Number: ")
    val num3 = scanner.nextInt()

    largestNumber(num1,num2, num3)

}

fun largestNumber(num1: Int, num2: Int, num3: Int):Int {
    var largest = 0
    if (num1 >= num2) {
        if(num1 >= num3){
            largest = num1
            println("The largest Number is: $largest")
        }else{
            largest = num3
            println("The largest Number is: $largest")
        }
    }else{
        if(num2>=num3){
            largest = num2
            println("The largest number is: $largest")
        }else{
            largest = num3
            println("The largest Number is: $largest")
        }
    }
    return largest
}