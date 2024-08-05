package com.example.androidmentorshipassignments.assignment2

//03: Arrays: Define an array of integers in Kotlin and write a function that returns the sum of all elements in the array.
fun main(){
    val arrayIntegers = arrayOf(23,5,34,312,124,5,232,6,68,9,67)
    arraySum(arrayIntegers)
}

fun arraySum(array:Array<Int>){
    var sum = 0
    array.forEach {
        sum += it
    }
    println(sum)

}
