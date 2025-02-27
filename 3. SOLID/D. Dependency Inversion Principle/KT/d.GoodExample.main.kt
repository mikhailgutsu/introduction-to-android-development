interface Notifier {
    fun send(message: String)
}

class EmailNotification : Notifier {
    override fun send(message: String) {
        println("Sending email: $message")
    }
}

class SMSNotification : Notifier {
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}

// Теперь NotificationService зависит от интерфейса Notifier, а не от конкретного класса
class NotificationService(private val notifier: Notifier) {
    fun sendNotification(message: String) {
        notifier.send(message)
    }
}

// Использование
fun main() {
    val emailNotifier: Notifier = EmailNotification()
    val smsNotifier: Notifier = SMSNotification()

    val emailService = NotificationService(emailNotifier)
    val smsService = NotificationService(smsNotifier)

    emailService.sendNotification("Hello via Email!")  // ✅ Работает
    smsService.sendNotification("Hello via SMS!")  // ✅ Работает
}
