package com.example.androidmentorshipassignments

import java.lang.String.format
import java.util.Scanner

//10. Simple Calculator
//Write a Kotlin program that acts as a simple calculator to perform addition,
// subtraction, multiplication, and division based on user input.

fun main(){

    val scanner = Scanner(System.`in`)

    println("Enter the first number:")
    val num1 = scanner.nextDouble()
    println("Enter the second number:")
    val num2 = scanner.nextDouble()

    scanner.nextLine()

    println("Enter the operator:")
    val oper = scanner.nextLine()

    calculator(num1,num2,oper)
}

fun calculator(num1:Double,num2:Double,oper: String){
    var addition = 0.0
    var subtraction = 0.0
    var mult = 0.0
    var div = 0.0
    if(num1!= null && num2!=null){
        if(oper=="+") {
            addition = num1 + num2
            println("Addition: $addition")
        }else if(oper == "-") {
            if(num1 > num2){
                subtraction = num1 - num2
            }
            else if(num2 > num1 ){
                subtraction = num2 - num1
            }
            println("Subtraction:%.2f".format(subtraction))
        }else if(oper=="*"){
        mult = num1 * num2
        println("Multiplication:%.2f".format(mult))
        }else if(oper=="/"){
            if(num1!=0.0 && num2!=0.0){
                div = num1 / num2
                println("Division: %.2f".format(div))
            }
        }
    }else {
        println("Kindly write numbers correctly")
    }
}
