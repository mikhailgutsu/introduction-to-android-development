package Classes

class Car {
    //  Properties
    var brand: String = "Unknown"
    var model: String = "Unknown"

    //  Method
    fun displayInfo() {
        println("Car brand: $brand, model: $model")
    }
}

fun main()
{
    val myCar = Car() // Creating an object

    myCar.brand = "Mercedes"
    myCar.model = "E-Class"

    myCar.displayInfo()  // Output: Car brand: Mercedes, model: E-Class
}