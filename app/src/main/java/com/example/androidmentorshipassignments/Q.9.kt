package com.example.androidmentorshipassignments

import java.util.Scanner

// 9. Check for Palindrome
// Write a Kotlin program to check if a given string is a palindrome (reads the same backward as forward).

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the String:")
    val input = scanner.nextLine()

    println(checkPalindrome(input))
    println(checkPalindrome2nd(input))
    println(checkPalindrome3rd(input))
    println(checkPalindrome4th(input))
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

fun checkPalindrome2nd(input:String):Boolean{
    if(input.reversed() == input){
        return true
    }else{
        return false
    }
}

fun checkPalindrome3rd(input:String):Boolean{
    val len = input.length
    for(i in 0..len/2){
        if(input[i]==input[len - 1 -i]){
            return true
        }
    }
    return false
}

fun checkPalindrome4th(input:String):Boolean{
    var reverseString = ""
    for(i in input.length - 1 downTo 0){
        reverseString += input[i]
    }
    return reverseString == input
}

