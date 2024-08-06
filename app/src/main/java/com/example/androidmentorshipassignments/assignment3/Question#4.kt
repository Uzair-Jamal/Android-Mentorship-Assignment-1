package com.example.androidmentorshipassignments.assignment3


//4. Shopping Cart System
//Assignment Batch 9
// - Create a class `Product` with properties `productName`, `price`, and `quantity`.
// - Implement a method `totalCost()` in the `Product` class to return the total cost (price * quantity).
// - Create an array of `Product` objects representing a shopping cart.
// - Use a loop to calculate and print the total cost of all products in the cart.
// - **Bonus:** Add a method `displayProductInfo()` to print the product's details.

fun main(){
    val product1 = Product("A",233.56,3)
    val product2 = Product("B",133.56,4)
    val product3 = Product("C",333.56,5)
    val product4 = Product("D",433.56,6)
    val product5 = Product("E",533.56,7)

    val cart = arrayOf(product1,product2,product3,product4,product5)

    var totalCartCost = 0.0
    for(products in cart){
        products.displayProductInfo()
        val totalCost = products.totalCost()
        println("Product total price with Quantity: $${String.format("%.2f",totalCost)}")
        println()
        totalCartCost += totalCost
    }
    println("Total price after adding all the products in the cart: $$totalCartCost")
}

class Product(val productName: String, val price: Double, val quantity: Int){
    fun totalCost():Double{
        return price * quantity
    }
    fun displayProductInfo(){
        println("Product Name: $productName")
        println("Product price: $$price")
        println("Product Quantity: $quantity")
    }
}