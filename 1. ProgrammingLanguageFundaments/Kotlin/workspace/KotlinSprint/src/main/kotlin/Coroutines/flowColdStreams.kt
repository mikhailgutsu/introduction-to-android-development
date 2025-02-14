package Coroutines

//  A Flow is an asynchronous sequence of multiple values emitted over time.
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun fetchNumbers(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000) // Simulating delay
        emit(i) // Emits values
    }
}

fun main() = runBlocking {
    fetchNumbers().collect { value ->
        println("Received: $value")
    }
}

//Received: 1
//Received: 2
//Received: 3
//Received: 4
//Received: 5