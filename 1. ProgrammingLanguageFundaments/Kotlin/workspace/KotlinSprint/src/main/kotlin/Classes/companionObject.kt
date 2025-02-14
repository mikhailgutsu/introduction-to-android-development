package Classes

//  If you need static members inside a class, use companion object.
class Car6 {
    companion object {
        fun getCarType(): String {
            return "Sedan"
        }
    }
}

fun main() {
    println(Car6.getCarType())  // Output: Sedan
}
