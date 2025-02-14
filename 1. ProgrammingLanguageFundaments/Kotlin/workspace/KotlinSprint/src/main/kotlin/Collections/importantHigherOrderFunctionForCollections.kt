package Collections

fun main()
{
    //      MAP
    // Used to transform each element of a collection.
    // Returns a new list with transformed elements.
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers) // Output: [1, 4, 9, 16, 25]

    //      FILTER
    // Used to select elements that satisfy a given condition.
    // Returns a new list with only the elements that match the condition.
    val numbers1 = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers1.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4]

    //      REDUCE
    // Used to accumulate values starting from the first element.
    // It applies a function that takes an accumulator and each element in the collection.
    // Returns a single result.
    val numbers2 = listOf(1, 2, 3, 4, 5)
    val sum = numbers2.reduce { acc, num -> acc + num }
    println(sum) // Output: 15 (1 + 2 + 3 + 4 + 5)

    //      FOLD (Alternative to reduce with an Initial Value)
    // Similar to reduce, but starts with an initial value.
    val numbers3 = listOf(1, 2, 3, 4, 5)
    val sum1 = numbers3.fold(10) { acc, num -> acc + num }
    println(sum1) // Output: 25 (10 + 1 + 2 + 3 + 4 + 5)
}