package Interface

//  Interfaces can have abstract properties (without initialization).
interface Vehicle {
    val maxSpeed: Int
}

//  A class implementing this interface must initialize the property:
class Car11 : Vehicle {
    override val maxSpeed: Int = 240
}

//  Using the class:
fun main() {
    val myCar = Car11()
    println("Max speed: ${myCar.maxSpeed}")  // Output: Max speed: 240
}

//🔹 Note: Interfaces cannot store values, but they can define val properties with a getter:
//interface Vehicle {
//    val maxSpeed: Int
//        get() = 200  // Default implementation
//}
//
//class Car : Vehicle  // No need to override maxSpeed
