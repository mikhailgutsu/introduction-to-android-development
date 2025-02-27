open class Bird {
    open fun fly() {
        println("This bird is flying")
    }
}

class Sparrow : Bird() {
    override fun fly() {
        println("Sparrow is flying")
    }
}

class Penguin : Bird() {
    override fun fly() {
        throw UnsupportedOperationException("Penguins can't fly!")
    }
}

fun makeBirdFly(bird: Bird) {
    bird.fly() // Если передать Penguin, получим исключение!
}

fun main() {
    val sparrow = Sparrow()
    val penguin = Penguin()

    makeBirdFly(sparrow) // ✅ Всё ок
    makeBirdFly(penguin) // ❌ Ошибка, пингвин не умеет летать!
}
