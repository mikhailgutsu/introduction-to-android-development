package Functions

//  Basic function
fun greet() {
    println("Hello, Kotlin!")
}

//  Function with Parameters
fun sum(a: Int, b: Int): Int {
    return a + b
}

//  Function with Default-Parameters
fun greetUser(name: String = "Guest") {
    println("Hello, $name!")
}

//  Single Expression Functions
fun multiply(a: Int, b: Int) = a * b

/////////////////////////////////
fun main()
{
    greet()

    val result = sum(5, 3)
    println(result) // Output: 8

    greetUser()        // Output: Hello, Guest!
    greetUser("Alex")  // Output: Hello, Alex!

    println(multiply(4, 2)) // Output: 8
}