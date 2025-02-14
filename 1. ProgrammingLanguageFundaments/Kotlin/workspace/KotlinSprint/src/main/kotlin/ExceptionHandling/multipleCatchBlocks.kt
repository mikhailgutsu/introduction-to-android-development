package ExceptionHandling

//  You can handle multiple exceptions separately.
fun main() {
    try {
        val numbers = arrayOf(1, 2, 3)
        println(numbers[5])  // Out of bounds
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Index is out of bounds!")
    } catch (e: Exception) {  // Catch any other exception
        println("Some error occurred: ${e.message}")
    }
}
