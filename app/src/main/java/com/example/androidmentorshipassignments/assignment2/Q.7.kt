package com.example.androidmentorshipassignments.assignment2

//07: Array Iteration: Write a Kotlin program that iterates
//over an array of strings and prints each string with its index.

fun main(){
    val arrayString = arrayOf<String>("A","B","C","D")
    arrayString.forEachIndexed { index, s ->
        println("$index -> $s")
    }
}