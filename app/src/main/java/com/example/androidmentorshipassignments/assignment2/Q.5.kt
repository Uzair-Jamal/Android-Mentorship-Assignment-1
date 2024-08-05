package com.example.androidmentorshipassignments.assignment2

//05: Break and Continue: Create a Kotlin program using a for loop that prints numbers from 1 to 20.
//However, the loop should skip the number 13 and stop if it reaches 18.

fun main(){

    for(i in 1..20){
        when(i){
            13 -> continue
            18 -> break
            else -> println(i)
        }
    }
}
