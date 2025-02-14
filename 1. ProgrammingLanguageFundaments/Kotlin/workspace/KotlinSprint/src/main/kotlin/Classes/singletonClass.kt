package Classes

//  A singleton in Kotlin is created using the object keyword.
object Database {
    fun connect() {
        println("Connected to database")
    }
}

fun main() {
    Database.connect()  // Output: Connected to database
}
