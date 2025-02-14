package ExceptionHandling

//  You can create custom exceptions by extending Exception or RuntimeException.
class InvalidUserException(message: String) : Exception(message)

fun checkUser(username: String) {
    if (username.isEmpty()) {
        throw InvalidUserException("Username cannot be empty")
    }
}

fun main() {
    try {
        checkUser("")
    } catch (e: InvalidUserException) {
        println("Error: ${e.message}")  // Output: Error: Username cannot be empty
    }
}
