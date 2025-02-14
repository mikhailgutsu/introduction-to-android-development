package Coroutines

//  Use try-catch inside coroutines to handle errors properly.
import kotlinx.coroutines.*

suspend fun faultyFunction() {
    delay(1000)
    throw Exception("Something went wrong")
}

fun main() = runBlocking {
    try {
        faultyFunction()
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}
