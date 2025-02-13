package Functions

//  Adding a capitalizeFirstLetter() function to the String class:
fun String.capitalizeFirstLetter(): String {
    return this.replaceFirstChar { it.uppercase() }
}

//  Extension Function on Custom Class
class Car(val brand: String, val model: String)

fun Car.fullName(): String {
    return "$brand $model"
}

//  Nullable Receiver in Extension Function
fun String?.safeLength(): Int {
    return this?.length ?: 0
}

//Extension Function for Collections
//Adding a function to List<Int>:
fun List<Int>.sumOfSquares(): Int {
    return this.sumOf { it * it }
}

///////////////////////
fun main()
{
    val name = "alex"
    println(name.capitalizeFirstLetter()) // Output: Alex

    val myCar = Car("Mercedes", "E-Class")
    println(myCar.fullName()) // Output: Mercedes E-Class

    val nullableString: String? = null
    println(nullableString.safeLength()) // Output: 0

    val numbers = listOf(1, 2, 3)
    println(numbers.sumOfSquares()) // Output: 14

}