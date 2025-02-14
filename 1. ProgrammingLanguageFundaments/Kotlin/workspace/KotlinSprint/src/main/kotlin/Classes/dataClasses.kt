package Classes

//  A data class is used for storing data. It automatically generates toString(), equals(), hashCode(), and copy() methods.
data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("Alex", 23)
    val user2 = user1.copy(age = 24)

    println(user1) // Output: User(name=Alex, age=23)
    println(user2) // Output: User(name=Alex, age=24)
}
