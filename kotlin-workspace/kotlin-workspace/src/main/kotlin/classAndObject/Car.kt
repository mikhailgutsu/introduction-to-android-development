package classAndObject

class Car(private val brand: String, var speed: Int) {
    fun accelerate(amount: Int) {
        speed += amount
        println("$brand -> $speed km/h,")
    }

    fun brake() {
        speed = 0
        println("$brand stopped.")
    }
}