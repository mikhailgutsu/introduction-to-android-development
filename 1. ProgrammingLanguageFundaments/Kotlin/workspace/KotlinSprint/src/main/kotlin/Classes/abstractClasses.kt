package Classes

//  An abstract class cannot be instantiated and must be inherited.
abstract class Animal {
    abstract fun makeSound()
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()  // Output: Woof!
}
