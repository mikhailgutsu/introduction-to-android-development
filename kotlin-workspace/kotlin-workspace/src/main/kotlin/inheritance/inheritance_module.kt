package inheritance

// Абстрактный класс Shape (Форма)
// Abstract class Shape (Form)
abstract class Shape(val name: String) {
    abstract fun draw() // Абстрактный метод, который должен быть реализован в дочерних классах
                        // Abstract method that must be implemented in child classes
}

// Parent class Vehicle (Transport)
// Родительский класс Vehicle (Транспорт)
open class Vehicle(val model: String) {
    open fun drive() {
        println("$model is moving on the road.")
    }
}

// Child class Car (Car), inherits Vehicle
// Дочерний класс Car (Машина), наследует Vehicle
class Car(model: String, val brand: String) : Vehicle(model) {
    override fun drive() {
        super.drive() // Вызов родительского метода
                      // Calling the parent method
        println("The car $brand $model is driving fast!")
    }
}

// Child class Circle (Circle), inherits Shape
// Дочерний класс Circle (Круг), наследует Shape
class Circle(name: String, val radius: Double) : Shape(name) {
    override fun draw() {
        println("Drawing a $name with radius $radius")
    }
}

// Another class with protected properties
// Еще один класс с protected свойствами
open class Animal(val species: String) {
    protected fun makeSound() {
        println("$species makes a sound.")
    }
}

// Child class Dog (Dog), inherits Animal
// Дочерний класс Dog (Собака), наследует Animal
class Dog(species: String) : Animal(species) {
    fun bark() {
        makeSound() // Можно вызывать protected метод только внутри дочернего класса
                    // Can call the protected method only inside the child class
        println("The dog barks loudly!")
    }
}

