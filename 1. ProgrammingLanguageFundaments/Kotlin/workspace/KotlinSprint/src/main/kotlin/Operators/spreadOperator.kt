package Operators

fun spreadOperator(){
    // Used to pass an array into a function that expects a vararg:
    fun printNumbers(vararg numbers: Int) {
        for (num in numbers) {
            println(num)
        }
    }

    val nums = intArrayOf(1, 2, 3)
    printNumbers(*nums) // passes the array as vararg
}