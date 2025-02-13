package Functions

//  Kotlin supports anonymous functions using lambdas:
val add: (Int, Int) -> Int = { a, b -> a + b }

//  Shorter version:
val multiply = { a: Int, b: Int -> a * b }

fun main()
{
    println(add(2, 3)) // Output: 5
    println(multiply(4, 2)) // Output: 8
}