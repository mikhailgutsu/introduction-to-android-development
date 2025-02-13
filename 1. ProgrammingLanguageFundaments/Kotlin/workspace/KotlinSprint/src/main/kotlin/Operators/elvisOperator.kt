package Operators

fun elvisOperator(){
    // Used for handling null values:
    val name: String? = null
    val length = name?.length ?: 0 // If name == null, returns 0
    println(length) // 0

}