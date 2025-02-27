interface Worker {
    fun work()
    fun eat()
}

class OfficeWorker : Worker {
    override fun work() {
        println("Office worker is working")
    }

    override fun eat() {
        println("Office worker is eating")
    }
}

class Robot : Worker {
    override fun work() {
        println("Robot is working")
    }

    override fun eat() {
        throw UnsupportedOperationException("Robots don't eat!")
    }
}
