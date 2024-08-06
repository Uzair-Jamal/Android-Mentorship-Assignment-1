package com.example.androidmentorshipassignments.assignment3

//5. Animal Sound Simulator
// - Create a base class `Animal` with an abstract method `makeSound()`.
// - Create subclasses `Dog`, `Cat`, and `Cow` that inherit from `Animal` and implement the
//`makeSound()` method.
// - Create an array of `Animal` objects and use a loop to call the `makeSound()` method for each
//animal, printing the respective sounds.
// - **Bonus:** Add a method `displayAnimalInfo()` to print the animal's details.

fun main(){
    val cat = Cat()
    val dog = Dog()
    val cow = Cow()

    val animals = arrayOf(cat,dog,cow)

    for(animal in animals){
        animal.makeSound()
        animal.displayAnimalInfo()
        println()
    }

}

abstract class Animal{
    abstract fun makeSound()
    abstract fun displayAnimalInfo()
}

class Dog: Animal(){
    override fun makeSound() {
        println("Bark")
    }

    override fun displayAnimalInfo() {
        println("This is a Dog")
    }
}

class Cat: Animal(){
    override fun makeSound() {
        println("Meow")
    }

    override fun displayAnimalInfo() {
        println("This is a Cat")
    }
}

class Cow: Animal(){
    override fun makeSound() {
        println("Moo")
    }

    override fun displayAnimalInfo() {
        println("This is a Cow")
    }
}