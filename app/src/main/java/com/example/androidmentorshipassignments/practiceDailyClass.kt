package com.example.androidmentorshipassignments

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

    val data = arrayOf(1,2,3,4,5,6,7)
    println(data[2])
    println(data.get(4))

    val names = arrayOf("Jhon","Peter","Smith")
    val names1 = arrayOf("Jhon","Peter","Smith",2,3,5,6)
    val names2 = intArrayOf(2,3,5,6)
    println(names[2])

    for(i in names){
        println(i)
    }
    names1.forEach {
        println(it)
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
