package com.example.androidmentorshipassignments

fun main(){

    val arrayList = arrayListOf<Any>(12,"212",11,"hello")
    println(arrayList.size)
    arrayList.add(1)
    println(arrayList.size)
    arrayList.remove(12)
    println("Last index: ${arrayList.lastIndex}")

    val arrayTest = ArrayList<Test>()
    arrayTest.add(Test("Uzair",23))

    val hashMap = HashMap<Int,String>()
    println(hashMap.size)
    hashMap.put(2,"Hash Map")
    println(hashMap.size)
    println(hashMap)

}

data class Test(val name: String, val age: Int)