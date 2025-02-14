package Classes

//  Kotlin supports inheritance using the open keyword because classes are final by default.

//  Base Class (Superclass)
open class Vehicle(val brand: String) {
    open fun showBrand() {
        println("Brand: $brand")
    }
}

//  Derived Class (Subclass)
class Car4(brand: String, val model: String) : Vehicle(brand) {
    override fun showBrand() {
        println("Car brand: $brand, model: $model")
    }
}

//  Using the Classes
fun main() {
    val myCar = Car4("Audi", "A6")
    myCar.showBrand()  // Output: Car brand: Audi, model: A6
}
