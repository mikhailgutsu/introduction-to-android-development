package Classes

//  A primary constructor is defined in the class header:
class Car2(val brand: String, val model: String) {
    fun displayInfo() {
        println("Car brand: $brand, model: $model")
    }
}

//  Secondary Constructor
//  A secondary constructor is defined using constructor inside the class:
class Car3 {
    var brand: String
    var model: String

    constructor(brand: String, model: String) {
        this.brand = brand
        this.model = model
    }

    fun displayInfo() {
        println("Car brand: $brand, model: $model")
    }
}


//  Creating an object:
fun main() {
    val myCar = Car2("BMW", "M3")
    myCar.displayInfo()  // Output: Car brand: BMW, model: M3
}
