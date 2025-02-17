package polymorphism

interface Animal {
    fun makeSound()
}

class Dog : Animal {
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat : Animal {
    override fun makeSound() {
        println("Meow!")
    }
}

// Function that takes an Animal, demonstrating polymorphism
fun playWithAnimal(animal: Animal) {
    animal.makeSound()
}

