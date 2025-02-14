package ExceptionHandling

//  You can handle exceptions using try-catch blocks.
fun main() {
    try {
        val result = 10 / 0  // This will throw an exception
        println(result)
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero!")  // Output: Cannot divide by zero!
    }
}

//How it Works?
//Code inside try is executed.
//If an exception occurs, catch will handle it.