interface Flyable {
    fun fly()
}

open class Bird

class Sparrow : Bird(), Flyable {
    override fun fly() {
        println("Sparrow is flying")
    }
}

class Penguin : Bird() {
    fun swim() {
        println("Penguin is swimming")
    }
}

// Функция теперь принимает только тех, кто умеет летать
fun makeBirdFly(bird: Flyable) {
    bird.fly()
}

fun main() {
    val sparrow = Sparrow()
    val penguin = Penguin()

    makeBirdFly(sparrow) // ✅ Всё ок
    // makeBirdFly(penguin) // ❌ Ошибка компиляции - теперь нельзя передать пингвина, который не умеет летать
}
