package ExceptionHandling

//  The finally block always executes, whether an exception occurs or not.
fun main() {
    try {
        println("Trying to open a file...")
        throw Exception("File not found")  // Simulated error
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("Closing the file...")  // Always executes
    }
}
