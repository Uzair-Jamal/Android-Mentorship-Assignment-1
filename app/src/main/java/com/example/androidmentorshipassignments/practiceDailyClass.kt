package com.example.androidmentorshipassignments

fun main(){

    // four types of functions

    // function without arguments
    add1()
    // function with arguments
    add2(30,23)
    // function having both arguments and return types
    println(add3(45,11))
    // function with return type only
    println(add4())

}
fun add1(){
    val a=10
    val b=15
    val sum = a+b
    println(sum)
}
fun add2(a:Int, b:Int){
    val sum = a+b
    println(sum)
}
fun add3(a:Int,b:Int):Int {
    val sum = a+b
    return sum
}
fun add4():Int{
    val a = 50
    val b = 67
    val sum = a+b
    return sum
}
