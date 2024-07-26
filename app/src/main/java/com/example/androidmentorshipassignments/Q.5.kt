package com.example.androidmentorshipassignments

import java.util.Scanner

//5. Grade Evaluation   Write a Kotlin program that evaluates the grade of a student based on their marks using the following criteria:
//   - Marks >= 90: Grade A   - Marks >= 80: Grade B
//   - Marks >= 70: Grade C   - Marks >= 60: Grade D
//   - Marks < 60: Grade F

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter Marks for Maths:")
    val marks1 = scanner.nextInt()
    println("Enter Marks for English:")
    val marks2 = scanner.nextInt()

    evaluateGrades(marks1,marks2)
}

fun evaluateGrades(marks1: Int, marks2: Int) {
        if(marks1 >= 90) {
            println("Maths has Grade A")
        }
        else if(marks1 >=80){
            println("Maths has Grade B")
        }
        else if(marks1 >=70){
            println("Maths has Grade C")
        }
        else if(marks1 >=60){
            println("Maths has Grade D")
        }
        else {
            println("Maths has Grade F")
        }

        if(marks2 >= 90) {
            println("English has Grade A")
        }
        else if(marks2 >=80){
            println("English has Grade B")
        }
        else if(marks2 >=70){
            println("English has Grade C")
        }
        else if(marks2 >=60){
            println("English has Grade D")
        }
        else{
            println("English has Grade F")
        }

}

