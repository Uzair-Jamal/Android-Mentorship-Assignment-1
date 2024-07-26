package com.example.androidmentorshipassignments

import java.util.Scanner

// 9. Check for Palindrome
// Write a Kotlin program to check if a given string is a palindrome (reads the same backward as forward).

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the String:")
    val input = scanner.nextLine()

    println(checkPalindrome(input))
}

fun checkPalindrome(input: String):Boolean {
    val len = input.length
    for(i in 0 until len / 2 ){
        if(input[i] == input[len - 1 -i]){
            return true
        }
    }
    return false
}
