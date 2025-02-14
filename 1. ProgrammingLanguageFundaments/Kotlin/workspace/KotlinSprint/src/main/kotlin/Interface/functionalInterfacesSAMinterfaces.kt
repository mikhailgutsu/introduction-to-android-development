package Interface

//  A functional interface (or SAM interface) has only one abstract method. It allows lambda expressions.
fun interface ClickListener {
    fun onClick()
}

fun setClickListener(listener: ClickListener) {
    listener.onClick()
}

fun main() {
    setClickListener {
        println("Button clicked!")  // Lambda function
    }
}

//  Button clicked!