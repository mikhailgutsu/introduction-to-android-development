interface Payment {
    fun process(amount: Double)
}

class PayPalPayment : Payment {
    override fun process(amount: Double) {
        println("Processing PayPal payment of $$amount")
    }
}

class CreditCardPayment : Payment {
    override fun process(amount: Double) {
        println("Processing Credit Card payment of $$amount")
    }
}

// Новый тип оплаты (добавляем без изменения существующего кода)
class CryptoPayment : Payment {
    override fun process(amount: Double) {
        println("Processing Crypto payment of $$amount")
    }
}

class PaymentProcessor {
    fun processPayment(payment: Payment, amount: Double) {
        payment.process(amount)
    }
}

// Использование
fun main() {
    val processor = PaymentProcessor()

    val paypal = PayPalPayment()
    val creditCard = CreditCardPayment()
    val crypto = CryptoPayment() // Добавили новый способ без изменения старого кода

    processor.processPayment(paypal, 100.0)
    processor.processPayment(creditCard, 200.0)
    processor.processPayment(crypto, 300.0) // Работает без изменения PaymentProcessor!
}
