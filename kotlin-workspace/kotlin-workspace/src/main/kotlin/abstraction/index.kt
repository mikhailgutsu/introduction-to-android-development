package abstraction

abstract class Vehicle(val name: String) {
    abstract fun move()  // Abstract method (no implementation)

    fun displayInfo() {  // Concrete method (has implementation)
        println("Vehicle Name: $name")
    }
}

class Car(name: String) : Vehicle(name) {
    override fun move() {
        println("$name moves on wheels")
    }
}

class Boat(name: String) : Vehicle(name) {
    override fun move() {
        println("$name moves on water")
    }
}


