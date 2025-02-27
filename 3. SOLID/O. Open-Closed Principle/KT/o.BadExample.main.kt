class PaymentProcessor {
    fun processPayment(type: String, amount: Double) {
        when (type) {
            "PayPal" -> println("Processing PayPal payment of $$amount")
            "CreditCard" -> println("Processing Credit Card payment of $$amount")
            else -> throw IllegalArgumentException("Unsupported payment type")
        }
    }
}