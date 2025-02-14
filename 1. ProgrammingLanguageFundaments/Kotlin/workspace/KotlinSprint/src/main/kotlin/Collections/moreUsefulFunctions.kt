package Collections

//      any {} – Checks if at least one element matches a condition.
//      all {} – Checks if all elements match a condition.
//      count {} – Counts the elements matching a condition.
//      groupBy {} – Groups elements by a specified key.
//      sortedBy {} – Sorts elements based on a condition.

fun main()
{
    val words = listOf("apple", "banana", "cherry", "date")

    // Check if any word starts with 'b'
    println(words.any { it.startsWith("b") }) // Output: true

    // Count words with length > 5
    println(words.count { it.length > 5 }) // Output: 2 (banana, cherry)

    // Group words by their length
    val grouped = words.groupBy { it.length }
    println(grouped) // Output: {5=[apple], 6=[banana, cherry], 4=[date]}
}

//  map transforms elements.
//  filter selects elements based on a condition.
//  reduce accumulates values into a single result.
//  fold is similar to reduce but starts with an initial value.
//  You can apply these functions to lists, sets, and maps for efficient data manipulation.