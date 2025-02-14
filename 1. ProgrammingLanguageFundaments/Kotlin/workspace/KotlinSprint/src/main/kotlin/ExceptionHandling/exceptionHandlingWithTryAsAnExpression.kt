package ExceptionHandling

//  In Kotlin, try can return a value.
fun safeDivision(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero!")
        -1  // Return default value
    }
}

fun main() {
    val result = safeDivision(10, 0)
    println(result)  // Output: Cannot divide by zero! -1
}
