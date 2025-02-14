package Coroutines
import kotlinx.coroutines.*

suspend fun fetchData(): String {
    delay(2000) // Simulate network call
    return "Data fetched"
}

fun main() = runBlocking {
    println("Start")
    val result = fetchData() // Suspends execution for 2 seconds
    println(result)
    println("End")
}
