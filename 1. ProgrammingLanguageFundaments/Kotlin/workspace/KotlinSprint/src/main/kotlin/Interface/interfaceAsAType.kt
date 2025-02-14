package Interface

//  An interface can be used as a type in function parameters.
fun startVehicle(vehicle: Driveable) {
    vehicle.drive()
}

fun main() {
    val myCar = Car()
    startVehicle(myCar)  // Output: Car is driving
}
