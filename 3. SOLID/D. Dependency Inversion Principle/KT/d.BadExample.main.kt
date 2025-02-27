class EmailNotification {
    fun sendEmail(message: String) {
        println("Sending email: $message")
    }
}

class NotificationService {
    private val emailNotification = EmailNotification() // Жёсткая зависимость

    fun sendNotification(message: String) {
        emailNotification.sendEmail(message)
    }
}
