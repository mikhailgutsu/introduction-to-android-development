package ExceptionHandling

//  You can manually throw exceptions using throw.
fun validateAge(age: Int) {
    if (age < 18) {
        throw IllegalArgumentException("Age must be 18 or older")
    }
    println("Valid age")
}

fun main() {
    try {
        validateAge(16)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")  // Output: Error: Age must be 18 or older
    }
}
