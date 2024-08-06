package com.example.androidmentorshipassignments.assignment3

//2. Library Book System
//- Create a class `Book` with properties `title`, `author`, and `isAvailable` (a boolean).
//- Implement methods `borrowBook()` and `returnBook()` to change the `isAvailable` status.
//- Create an array of `Book` objects representing a library inventory.
//- Use a loop to print the titles and availability status of all books.
//- **Bonus:** Add a method `displayBookInfo()` to print the book's details

fun main(){
    val book1 = Book("A","B",true)
    val book2 = Book("C","D",false)
    val book3 = Book("E","F",false)
    val book4 = Book("G","H",true)

    val books = arrayOf(book1,book2,book3,book4)
    for(book in books){
        book.displayDetails()
        if(book.isAvailable){
            book.borrowBook()
        }
        else{
            book.returnBook()
            }
        }
    }

class Book(val title: String, val author: String, var isAvailable: Boolean){
    fun borrowBook() : Boolean{
        if (isAvailable) {
            isAvailable = false
            println("$title by $author has been borrowed.")
            return isAvailable
        } else {
            println("$title by $author is not available for borrowing.")
            return false
        }
    }

    fun returnBook():Boolean{
        if(!isAvailable){
            isAvailable = true
            println("$title by $author has been returned.")
            return isAvailable
        } else{
            println("$title by $author was not borrowed")
            return false
        }
    }

    fun displayDetails(){
        val availability = if(isAvailable) "Available" else "Not Available"
        println("Title: $title , Author: $author & Availability: $availability")
    }
}