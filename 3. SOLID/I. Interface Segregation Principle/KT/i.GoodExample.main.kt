interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class OfficeWorker : Workable, Eatable {
    override fun work() {
        println("Office worker is working")
    }

    override fun eat() {
        println("Office worker is eating")
    }
}

class Robot : Workable {
    override fun work() {
        println("Robot is working")
    }
}

// Функции теперь принимают только нужный тип
fun makeWork(worker: Workable) {
    worker.work()
}

fun makeEat(person: Eatable) {
    person.eat()
}

// Использование
fun main() {
    val officeWorker = OfficeWorker()
    val robot = Robot()

    makeWork(officeWorker) // ✅ Работает
    makeWork(robot) // ✅ Работает
    makeEat(officeWorker) // ✅ Работает
    // makeEat(robot) // ❌ Ошибка компиляции - робот не ест, и это хорошо!
}
