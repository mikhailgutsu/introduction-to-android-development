package Operators

fun safeCallOperator(){
    // Prevents NullPointerException:
    val text: String? = null
    println(text?.length) // null (does not cause an error)
}