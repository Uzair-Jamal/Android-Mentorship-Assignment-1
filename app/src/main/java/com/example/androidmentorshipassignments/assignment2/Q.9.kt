package com.example.androidmentorshipassignments.assignment2

import java.util.Scanner

//09: Do-While Loop: Create a Kotlin program using a do-while loop that prompts the user to enter a
//number until they enter a negative number.
//Afterward, the program should print the sum of all entered positive numbers.
fun main(){
    var sum = 0
    var num: Int

    do{
        println("Enter Numbers:")
        num = readln().toInt()

        if(num>=0){
            sum += num
        }
    }while(num>=0)

    println("The sum of entered positive numbers are: $sum")

}