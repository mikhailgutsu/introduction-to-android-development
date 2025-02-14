package Interface

//  Unlike Java, Kotlin allows default method implementations in interfaces.
interface Driveable {
    fun drive() {
        println("Driving...")
    }
}

//  Now, a class implementing Driveable is not required to override drive():
class Car : Driveable

fun main() {
    val myCar = Car()
    myCar.drive()  // Output: Driving...
}

//  However, a class can override the method if needed:
class Truck : Driveable {
    override fun drive() {
        println("Truck is driving")
    }
}