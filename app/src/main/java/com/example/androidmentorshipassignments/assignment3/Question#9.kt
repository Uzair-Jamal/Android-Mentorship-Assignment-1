package com.example.androidmentorshipassignments.assignment3

//9. Library Inventory System
// - Create a class `Library` with properties `books` (an array of `Book` objects) and `librarianName`.
// - Implement methods `addBook(book: Book)` and `removeBook(book: Book)` to manage the
//books array.
// - Use a loop to print all books' details and the librarian's name.
// - **Bonus:** Add a method `displayLibraryInfo()` to print the library's details

fun main(){

    val library = Library(arrayListOf(), "Harry")

    val book1 = LibraryBook("Merchant Of Venice", "Shakespeare", true)
    val book2 = LibraryBook("Harry Potter", "JK Rowling", false)
    val book3 = LibraryBook("Hamlet", "Shakespeare", true)
    val book4 = LibraryBook("Twelfth Night", "Shakespeare", true)
    val book5 = LibraryBook("Macbeth", "Shakespeare", false)

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)
    library.addBook(book4)
    library.addBook(book5)

    library.removeBook(book1)

    library.displayLibraryInfo()
}

data class LibraryBook(val title: String, val author: String, var isAvailable: Boolean)

class Library(val books: ArrayList<LibraryBook>, val librarianName: String){

    fun addBook(book: LibraryBook){
        if(!books.contains(book)){
            books.add(book)
            println("The Book ${book.title} by ${book.author} is added in the inventory")
        }
        else{
            println("The Book ${book.title} by ${book.author} is already present in the inventory")
        }
    }

    fun removeBook(book: LibraryBook){
        if(books.contains(book)){
            books.remove(book)
            println("The Book ${book.title} by ${book.author} has been removed from the inventory")
        }
        else{
            println("The Book ${book.title} by ${book.author} is not available in the inventory")
        }
    }

    fun displayLibraryInfo(){
        println("Library managed by: $librarianName,\nbooks in the library are:")
        for(book in books){
        println("${book.title} by ${book.author} (available: ${book.isAvailable})")
        }
    }
}
