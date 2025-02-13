package Operators

fun typeCheckOperatorIS(){
    // Checks if an object belongs to a certain type:
    val text: Any = "Kotlin"
    if (text is String) {
        println(text.length) // 6
    }

    // The !is operator checks if an object does not belong to a certain type:
    if (text !is Int) {
        println("This is not a number") // This is not a number
    }
}