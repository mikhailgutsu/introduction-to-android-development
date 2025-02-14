package org.example.Coroutines

//  Kotlin provides built-in coroutine scopes:
//
//    GlobalScope.launch {} – Runs a coroutine globally (not recommended).
//    runBlocking {} – Blocks the main thread until execution completes.
//    CoroutineScope {} – A structured way to manage coroutines in a given scope.
import kotlinx.coroutines.*

fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        println("Running in background thread")
    }
    Thread.sleep(1000) // Give coroutine time to execute
}
