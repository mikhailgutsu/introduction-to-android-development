package SealedClasses

//  Sealed classes work well with when, ensuring exhaustiveness checking.
fun getVehicleInfo(vehicle: Vehicle): String {
    return when (vehicle) {
        is Vehicle.Car -> "Car brand: ${vehicle.brand}"
        is Vehicle.Bike -> "Bike type: ${vehicle.type}"
    }
}

fun main() {
    val myCar = Vehicle.Car("Mercedes")
    println(getVehicleInfo(myCar)) // Output: Car brand: Mercedes
}

//  Why is this useful?
//  The compiler ensures all cases are covered in when.
//  If you add a new subclass of Vehicle, the compiler will warn you to update when.