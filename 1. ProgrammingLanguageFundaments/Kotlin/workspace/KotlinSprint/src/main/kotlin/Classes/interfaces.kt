package Classes

//  An interface is like an abstract class but without state (no properties with values).
interface Driveable {
    fun drive()
}

class Car5 : Driveable {
    override fun drive() {
        println("Car is driving")
    }
}

fun main() {
    val myCar = Car5()
    myCar.drive()  // Output: Car is driving
}
