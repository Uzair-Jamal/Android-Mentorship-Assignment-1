package com.example.androidmentorshipassignments.assignment3

//10. Employee Attendance Tracker
// - Create a class `Employee` with properties `name`, `employeeId`, and `attendance` (an array of
//booleans representing days of the month).
// - Implement methods `markAttendance(day: Int, present: Boolean)` and `calculateAttendance()`
//to update and calculate the attendance percentage.
// - Create an array of `Employee` objects and use a loop to print the attendance details of each
//employee.
// - **Bonus:** Add a method `displayAttendance()` to print the attendance details of the employee.

fun main(){

    val employees = arrayOf(
        EmployeeAttendance("Abc",23, Array(30){false}),
        EmployeeAttendance("Efg",24, Array(30){false}),
        EmployeeAttendance("Hij",25, Array(30){false}),
        EmployeeAttendance("Klm",26, Array(30){false})
    )

    employees[0].markAttendance(1,true)
    employees[0].markAttendance(2,true)
    employees[0].markAttendance(3,false)
    employees[0].markAttendance(4,false)

    employees[1].markAttendance(1,false)
    employees[1].markAttendance(2,true)
    employees[1].markAttendance(3,false)
    employees[1].markAttendance(4,false)

    employees[2].markAttendance(1,true)
    employees[2].markAttendance(2,true)
    employees[2].markAttendance(3,true)
    employees[2].markAttendance(4,false)


    for(employee in employees){
        employee.displayAttendance()
        println("Attendance Percentage:%.2f".format(employee.calculateAttendance()))
    }

}

class EmployeeAttendance(val name: String, val employeeId: Int , var attendance : Array<Boolean>){
    fun markAttendance(day: Int, present: Boolean){
        if(day in 1..attendance.size){
            attendance[day - 1] = present
            println("Marked ${if(present) "present" else "absent"} for $name of day $day.")
        }else{
            println("Invalid day: $day")
        }
    }

    fun calculateAttendance():Double{
        val totalDays = attendance.size
        val presentDays = attendance.count{it}
        return ((presentDays / totalDays.toDouble()) * 100)
    }

    fun displayAttendance(){
        println("Employee Name: $name, Employee ID: $employeeId")
        print("Attendance: ")
        for(day in attendance.indices){
            print(if(attendance[day]) "P " else "A ")
        }
    }
}