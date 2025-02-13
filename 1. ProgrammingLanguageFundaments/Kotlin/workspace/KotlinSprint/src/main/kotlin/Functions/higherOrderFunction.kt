package Functions

//  A function that takes another function as a parameter or returns a function.
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

/////////////////////
fun main()
{
    val sumResult = operateOnNumbers(4, 5) { x, y -> x + y }
    println(sumResult) // Output: 9

}