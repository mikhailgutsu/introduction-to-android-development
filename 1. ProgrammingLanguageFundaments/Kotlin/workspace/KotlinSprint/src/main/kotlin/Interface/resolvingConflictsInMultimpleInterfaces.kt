package Interface

//  If two interfaces have methods with the same name, you must explicitly specify which implementation to use.
interface A {
    fun show() {
        println("A")
    }
}

interface B {
    fun show() {
        println("B")
    }
}

class C : A, B {
    override fun show() {
        super<A>.show()  // Explicitly calling A's method
        super<B>.show()  // Explicitly calling B's method
    }
}

fun main() {
    val obj = C()
    obj.show()
}

//  A
//  B