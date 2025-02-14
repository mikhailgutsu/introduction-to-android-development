package Interface

//  A class can implement multiple interfaces.
interface Driveable11 {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Driveable11, Flyable {
    override fun drive() {
        println("Flying car is driving")
    }

    override fun fly() {
        println("Flying car is flying")
    }
}

fun main() {
    val myCar = FlyingCar()
    myCar.drive()  // Output: Flying car is driving
    myCar.fly()    // Output: Flying car is flying
}
