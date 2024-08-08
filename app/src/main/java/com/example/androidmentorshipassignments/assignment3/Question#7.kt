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

    val course1 = Course("Operating System","os123")
    val course2 = Course("Computer Programming","cp123")
    val course3 = Course("Discrete Structures","ds123")

    val student1 = Studentt("Alice", 101)
    val student2 = Studentt("Bob", 102)
    val student3 = Studentt("Catherine", 103)
    val student4 = Studentt("David", 104)
    val student5 = Studentt("Elon", 105)

    course1.enrollStudent(student1)
    course2.enrollStudent(student2)
    course3.enrollStudent(student3)
    course3.enrollStudent(student5)
    course2.enrollStudent(student1)
    course3.enrollStudent(student1)

    course2.removeStudent(student2)
    course1.removeStudent(student4)

    val courses = arrayOf(course1,course2,course3)

    for(course in courses){
        course.displayCourseInfo()
        println()
    }

}

data class Studentt(val name: String, val rollNumber: Int)

class Course(val courseName: String, val courseCode: String){

    private val enrolledStudentsCount = ArrayList<Studentt>()

    fun enrollStudent(student: Studentt):Boolean{
            enrolledStudentsCount.add(student)
            println("${student.name} enrolled in ${courseName}")
            return true
    }

    fun removeStudent(student: Studentt){
        if(enrolledStudentsCount.remove(student)){
            println("${student.name} removed from ${courseName}")
        }
        else{
            println("${student.name} is not enrolled in ${courseName}")
        }
    }

    fun displayCourseInfo() {
        println("Course Name: $courseName,\n Course Code: $courseCode")
        if (enrolledStudentsCount.isEmpty()) {
            println("No enrolled students")
        } else {
            println("Enrolled Students are:")
            for (student in enrolledStudentsCount) {
                println("- ${student.name} (ID: ${student.rollNumber})")
            }
        }
    }
}
