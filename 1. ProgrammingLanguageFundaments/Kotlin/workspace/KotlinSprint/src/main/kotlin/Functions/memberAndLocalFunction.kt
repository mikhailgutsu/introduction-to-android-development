package Functions

//  Member Function (Inside a Class)
class Person(val name: String) {
    fun greet() {
        println("Hello, my name is $name")
    }
}

//  Local Function (Inside Another Function)
fun printMessage() {
    fun formatMessage(msg: String): String {
        return msg.uppercase()
    }
    println(formatMessage("hello"))
}

//////////////////////////////////////////////////
fun main()
{
    val person = Person("Alex")
    person.greet() // Output: Hello, my name is Alex

    printMessage() // Output: HELLO
}