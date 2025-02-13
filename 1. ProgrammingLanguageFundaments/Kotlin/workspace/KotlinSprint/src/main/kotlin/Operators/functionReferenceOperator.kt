package Operators

fun functionReferenceOperator(){
    // Used to get a reference to a function:
    fun greet() {
        println("Hello")
    }

    val func = ::greet
    func() // Hello

}