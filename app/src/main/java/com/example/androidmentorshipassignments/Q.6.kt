package com.example.androidmentorshipassignments

import java.util.Scanner

//6. Check for Vowel or Consonant
// Write a Kotlin program to check if a given character is a vowel or a consonant.



fun main(){

    val scanner = Scanner(System.`in`)

    println("Enter the Character")
    val char = scanner.nextLine()

    checkCharacter(char)
}

fun checkCharacter(char: String?) {
    if(char?.contains('a') == true || char?.contains('e') == true || char?.contains('i') == true
        || char?.contains('o') == true || char?.contains('u') == true){
        println("Given char $char is a vowel")
    }else{
        println("Given char $char is a consonant")
    }
}