package ExceptionHandling

//Unchecked Exceptions
//  (e.g., NullPointerException, ArithmeticException) → Handled at runtime, no need to declare in function signature.
//Checked Exceptions
//  (e.g., IOException) → Kotlin does not force you to handle checked exceptions like Java.

fun readFile() {
    throw java.io.IOException("File not found") // No need to declare `throws IOException`
}
