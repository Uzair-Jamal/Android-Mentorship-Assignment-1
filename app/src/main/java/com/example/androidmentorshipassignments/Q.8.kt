package com.example.androidmentorshipassignments

import java.util.Scanner

//8. Check for Voting Eligibility
//Write a Kotlin program to check if a person is eligible to vote. The person must be at least 18 years old.

fun main(){

    val scanner = Scanner(System.`in`)
    println("Enter your Age:")
    val age = scanner.nextInt()

    checkEligibility(age)
}

fun checkEligibility(age: Int) {
    if(age>= 18){
        println("Person is Eligible")
    }
    else{
        println("Person is Ineligible")
    }
}
