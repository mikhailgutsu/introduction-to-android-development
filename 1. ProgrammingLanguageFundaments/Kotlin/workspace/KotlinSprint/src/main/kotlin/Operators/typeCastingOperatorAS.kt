package Operators

fun typeCastingOperatorAS(){
    // Used to cast an object to another type:
    val obj: Any = "Hello"
    val str: String = obj as String
    println(str) // Hello

    // If the casting is impossible, as? returns null:
    val number: Int? = obj as? Int
    println(number) // null
}