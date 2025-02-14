package ExceptionHandling

fun fetchData(): String {
    return try {
        val response = "Server Data"  // Simulating API call
        if (response.isEmpty()) {
            throw Exception("No data received")
        }
        response
    } catch (e: Exception) {
        "Error: ${e.message}"
    }
}

fun main() {
    val data = fetchData()
    println(data)  // Output: Server Data
}
