package org.example.Coroutines

//  To prevent memory leaks, use coroutineScope {} to manage child coroutines properly.
import kotlinx.coroutines.*

suspend fun fetchUser(): String {
    delay(2000)
    return "User Data"
}

suspend fun fetchPosts(): String {
    delay(3000)
    return "Post Data"
}

suspend fun fetchDataSafely() = coroutineScope {
    val user = async { fetchUser() }
    val posts = async { fetchPosts() }
    println(user.await())
    println(posts.await())
}

//Benefits:
//
//Ensures all coroutines inside complete before exiting.
//Cancels all child coroutines if an error occurs.