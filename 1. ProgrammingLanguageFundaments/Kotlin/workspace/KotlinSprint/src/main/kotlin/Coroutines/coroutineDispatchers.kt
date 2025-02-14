package Coroutines

//Kotlin provides different dispatchers for different use cases:
//
//Dispatchers.Default – For CPU-intensive tasks.
//Dispatchers.IO – For network and database operations.
//Dispatchers.Main – For UI updates in Android.

import kotlinx.coroutines.*

//fun main() = runBlocking {
//    launch(Dispatchers.IO) { // Background thread
//        println("Fetching data on ${Thread.currentThread().name}")
//    }
//}