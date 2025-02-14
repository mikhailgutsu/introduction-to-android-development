package Collections

//  Kotlin allows you to chain operations for more complex data manipulations.
fun main()
{
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = numbers
        .filter { it % 2 == 0 }  // Get even numbers: [2, 4, 6, 8, 10]
        .map { it * it }         // Square each number: [4, 16, 36, 64, 100]
        .reduce { acc, num -> acc + num } // Sum them up: 220

    println(result) // Output: 220
}