package com.example.androidmentorshipassignments.assignment3

//1. Student Management System
// - Create a class `Student` with properties `name`, `rollNumber`, and `marks` (an array of integers).
// - Implement a method `calculateAverage()` in the `Student` class to calculate and return the
//average marks of the student.
// - Create an array of `Student` objects and use a loop to print the name, roll number, and average
//marks of each student.
// - **Bonus:** Add a method `displayDetails()` to print all details of the student.

fun main(){

    val student1 = Student("Ali",31, arrayOf(34,67,88,44,22,13,12))
    val student2 = Student("Umair",32, arrayOf(23,13,65,32,65,23,11))
    val student3 = Student("Nadir",33, arrayOf(33,23,15,42,66,28,19))

    val students = arrayOf(student1,student2,student3)

    for(student in students){
        println("Student Name: ${student.name}")
        println("Student's Roll Number: ${student.rollNumber}")
        println("Student Marks Average: ${student.calculateAverage()}")
        student.displayDetails()
        println()
    }
}

class Student(val name:String, val rollNumber: Int, val marks: Array<Int>){
    fun calculateAverage():Int{
        val averageMarks =  marks.sum()
        return  averageMarks / marks.size
    }
    fun displayDetails(){
        println("Marks of the Student: ${marks.joinToString(", ")}")
    }
}