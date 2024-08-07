package com.example.androidmentorshipassignments.assignment3

//7. Course Enrollment System
// - Create a class `Course` with properties `courseName`, `courseCode`, and `enrolledStudents` (an
//array of `Student` objects).
// - Implement methods `enrollStudent(student: Student)` and `removeStudent(student: Student)` to
//add and remove students from the `enrolledStudents` array.
// - Create an array of `Course` objects and use a loop to print the course details and the names of
//all enrolled students.
// - **Bonus:** Add a method `displayCourseInfo()` to print the course's details.

fun main(){

    val course1 = Course("Operating System","os123", arrayOf() )
    val course2 = Course("Computer Programming","cp123", arrayOf() )
    val course3 = Course("Discrete Structures","ds123", arrayOf() )

    val student1 = Studentt("Alice", 1)
    val student2 = Studentt("Bob", 2)
    val student3 = Studentt("Catherine", 3)
    val student4 = Studentt("David", 4)
    val student5 = Studentt("Elon", 5)

    course1.enrollStudent(student1)
    course2.enrollStudent(student2)
    course3.enrollStudent(student3)

    course2.removeStudent(student5)
    course1.removeStudent(student4)

    val courses = arrayOf(course1,course2,course3)

    for(course in courses){
        course.displayCourseInfo()
    }

}

data class Studentt(val name: String, val rollNumber: Int)

class Course(val courseName: String, val courseCode: String, var enrolledStudents: Array<Studentt>){

    var enrollStudentsCount : Array<Studentt> = enrolledStudents

    fun enrollStudent(student: Studentt):Boolean{
        if(enrolledStudents.isEmpty()){
            enrollStudentsCount += student
            println("${student.name} enrolled in ${student.rollNumber}")
            return true
        }else
        {
            println("${student.name} is already enrolled in $courseName having CourseCode: $courseCode")
            return false
        }
    }

    fun removeStudent(student: Studentt):Boolean{
        if(enrolledStudents.isNotEmpty()){
            val newEnrolledStudents = Array(enrollStudentsCount.size -1 ){Studentt("",0)}
            var index = 0
            for (i in enrollStudentsCount){
                if(i != student){
                    newEnrolledStudents[index] = i
                    index++
                }
            }
            enrolledStudents = newEnrolledStudents
            println("${student.name} removed from ${courseName}")
            return true
        }
        else{
            println("${student.name} is not enrolled in ${courseName}")
            return false
        }
    }

    fun displayCourseInfo() {
        println("Course Name: $courseName, Course Code: $courseCode")
        if (enrolledStudents.isEmpty()) {
            println("No enrolled students")
        } else {
            println("Enrolled Students:")
            for (student in enrolledStudents) {
                println("- ${student.name} (ID: ${student.rollNumber})")
            }
        }
        println()
    }
}
}