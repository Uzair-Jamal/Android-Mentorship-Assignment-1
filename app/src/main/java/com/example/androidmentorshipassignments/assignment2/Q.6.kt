package com.example.androidmentorshipassignments.assignment2
//06: Function with Default Parameters: Write a Kotlin function that calculates the area of a rectangle.
//The function should have default parameters for the width and height.
fun main(){
    val defaultArea = area()
    println("Default Area: %.2f".format(defaultArea))
    val customWidth = area(b = 76.5)
    println("Custom Width Area: %.2f".format(customWidth))
    val customLength = area(l = 34.2)
    println("Custom Length Area: %.2f".format(customLength))
    val customLengthWidth = area(11.3,4.6)
    println("Custom Length and Area: %.2f".format(customLengthWidth))
}

fun area(l:Double=34.4, b:Double=12.3):Double{
    return l*b
}