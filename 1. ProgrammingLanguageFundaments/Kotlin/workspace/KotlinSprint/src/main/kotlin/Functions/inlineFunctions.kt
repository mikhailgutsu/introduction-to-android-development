package Functions

//  Used to optimize higher-order functions by reducing function call overhead.
inline fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main()
{
    val inlineResult = performOperation(3, 4) { x, y -> x * y }
    println(inlineResult) // Output: 12
}