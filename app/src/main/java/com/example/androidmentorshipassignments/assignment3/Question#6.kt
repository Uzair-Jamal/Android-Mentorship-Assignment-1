package com.example.androidmentorshipassignments.assignment3

//6. Library Membership System
// - Create a class `Member` with properties `name`, `memberId`, and `borrowedBooks` (an array of
//`Book` objects).
// - Implement methods `borrowBook(book: Book)` and `returnBook(book: Book)` to add and remove
//books from the `borrowedBooks` array.
// - Create an array of `Member` objects and use a loop to print the details of all borrowed books for
//each member.
// - **Bonus:** Add a method `displayMemberInfo()` to print the member's details.

fun main(){
    val member1 = Member("Ali",10, arrayOf())
    val member2 = Member("Chris",11, arrayOf())
    val member3 = Member("Emily",12, arrayOf())
    val member4 = Member("Garfield",13, arrayOf())
    val member5 = Member("Imran",14, arrayOf())

    val book1 = Bookk("B","BB",true)
    val book2 = Bookk("D","DD",false)
    val book3 = Bookk("F","FF",true)
    val book4 = Bookk("H","HH",false)
    val book5 = Bookk("J","JJ",true)

    member1.borrowBook(book1)
    member2.borrowBook(book2)
    member3.borrowBook(book3)
    member4.borrowBook(book4)
    member5.borrowBook(book5)

    member1.returnBook(book1)
    member2.returnBook(book2)

    val members = arrayOf(member1,member2,member3,member4,member5)

    for(member in members){
        member.displayMemberInfo()
    }

}
data class Bookk(val title: String, val author: String, var isAvailable:Boolean)
class Member(val memberName:String, val memberId: Int, var borrowedBooks: Array<Bookk>){
    var borrowBookCount = ArrayList<Bookk>()

    fun borrowBook(book: Bookk): Boolean{
        if(book.isAvailable){
            book.isAvailable = false
            borrowBookCount += book
            println("$memberName with $memberId MemberID borrowed ${book.title} by ${book.author}")
            return true
        }
        else {
            println("${book.title} by ${book.author} is not Available")
            return false
        }
    }

    fun returnBook(book:Bookk): Boolean{
        if(!book.isAvailable && borrowBookCount.contains(book)){
            book.isAvailable = true
            borrowedBooks = borrowedBooks.filter { it != book }.toTypedArray()
            println("${book.title} by ${book.author} is returned by $memberName having this $memberId MemberID")
            return true
        }
        else{
            println("$memberName having $memberId MemberID doesn't return the ${book.title} by ${book.author}")
            return false
        }
    }

    fun displayMemberInfo(){
        println("Member Name: $memberName, Member Id: $memberId")
        if(borrowBookCount.isEmpty()){
            println("No book borrowed")
        }else{
            println("Borrowed books are:")
            for(book in borrowBookCount){
                println("- ${book.title} by ${book.author} is borrowed")
            }
        }

    }

}
