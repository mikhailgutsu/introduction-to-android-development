package Coroutines

//  Use async to execute multiple coroutines in parallel and await to get their results.
import kotlinx.coroutines.*

suspend fun fetchUser(): String {
    delay(2000)
    return "User Data"
}

suspend fun fetchPosts(): String {
    delay(3000)
    return "Post Data"
}

fun main() = runBlocking {
    val user = async { fetchUser() }
    val posts = async { fetchPosts() }

    println("Loading...")

    println(user.await()) // Waits for fetchUser() to complete
    println(posts.await()) // Waits for fetchPosts() to complete

    println("Done!")
}

/*
* Loading...
User Data
Post Data
Done!
* */