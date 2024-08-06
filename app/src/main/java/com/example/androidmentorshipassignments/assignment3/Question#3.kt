package com.example.androidmentorshipassignments.assignment3

import android.annotation.SuppressLint

//3. Employee Salary Calculator
// - Create a base class `Employee` with properties `name`, `id`, and `salary`.
// - Create a subclass `Manager` that inherits from `Employee` and adds a property `bonus`.
// - Implement a method `calculateTotalSalary()` in the `Manager` class to return the total salary
//including the bonus.
// - Create an array of `Manager` objects and use a loop to print the total salary of each manager.
// - **Bonus:** Add a method `displayEmployeeDetails()` to print all details of the employee.

fun main(){

    val manager1 = Manager("Shafqat",5,90000,5000)
    val manager2 = Manager("Hadi",1,60000,3000)
    val manager3 = Manager("Umar",3,70000,9000)
    val manager4 = Manager("Farooq",4,40000,11000)

    val managers = arrayOf(manager1,manager2,manager3,manager4)

    for(manager in managers){
        manager.displayEmployeeDetails()
        println("Total Salary for ${manager.name} Manager:${manager.calculateTotalSalary()}")
        println()
    }

}

open class Employee( val name: String,  val id: Int, val salary:Int){

    open fun displayEmployeeDetails(){
        println("Employee Name: $name")
        println("Employee id: $id")
        println("Employee salary: $salary")
    }
}

class Manager(name: String, id: Int, salary: Int, private val bonus: Int): Employee(name,id,salary){
    fun calculateTotalSalary():Int{
        return bonus + salary
    }
    override fun displayEmployeeDetails(){
        super.displayEmployeeDetails()
        println("Bonus: $bonus")
    }

}