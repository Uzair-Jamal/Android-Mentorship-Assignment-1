package com.example.androidmentorshipassignments

import java.util.Scanner

fun main(){

    // four types of functions

    // function without arguments
    add1()
    // function with arguments
    add2(11,66)
    // function having both arguments and return types
    println(add3(45,11))
    // function with return type only
    println(add4())

    val c = add2()
    println(c)

    val data2 = arrayOf<Int>()
    //data2.set(0,12) -> gives error because array is Immutable(initially it has 0 size)
    //data2.set(8,1)
    println(data2.contentToString())
    val data = arrayOf(1,2,3,4,5,6,7)
    println(data[2])
    println(data.get(4))

    val names = arrayOf("Jhon","Peter","Smith")
    val names1 = arrayOf("Jhon","Peter","Smith",2,3,5,6)

    // changing value at index
    names[2]="Uzair"

    // Getting the digits at the given index
    println(names.get(2).substring(2))

    // changing value at index using built in function
    names.set(1,"Numan")

    val names2 = intArrayOf(2,3,5,6)
    println(names[2])
    println("names array : ${names.contentToString()}")

    for(i in names){
        println(i)
    }

    // find index of the variable
    println(names1.indexOf("Peter"))

    // Print as per the indices
    names1.forEach {
        println(it)
    }

    // Print as per the indices and values
    names2.forEachIndexed{ index, value ->
      println("$index -> $value")
    }

    // change this array into a list of String
     println(names2.contentToString())

    // Create new array with Array
    val newArray = Array<Int?>(4){null}
    newArray.forEachIndexed { index, i ->
        newArray[index] = Scanner(System.`in`).nextInt()
    }

    newArray.forEachIndexed { index , i->
        println("Index: $index Value: $i")
    }
}
fun add1(){
    val a=10
    val b=15
    val sum = a+b
    println(sum)
}
fun add2(a:Int=23, b:Int=22){
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
