package encapsulation

class Employee(name: String, age: Int, val position: String) : Person(name, age) {

    fun showProtectedFromParent() {

        println("Employee accessing protected info: $protectedInfo")
        showProtectedInfo()
    }

    fun showInternalFromParent() {

        println("Employee accessing internal info: $internalInfo")
        showInternalInfo()
    }
}