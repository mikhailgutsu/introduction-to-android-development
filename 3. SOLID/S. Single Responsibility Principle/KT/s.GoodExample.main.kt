class UserService(
    private val userRepository: UserRepository,
    private val logger: Logger
) {
    fun addUser(name: String) {
        println("Adding user: $name")
        userRepository.saveUser(name)
        logger.log("User $name added")
    }

    fun removeUser(name: String) {
        println("Removing user: $name")
        userRepository.deleteUser(name)
        logger.log("User $name removed")
    }
}

class UserRepository {

    fun saveUser(name: String) {
        println("Saving user to DB: $name")
    }

    fun deleteUser(name: String) {
        println("Deleting user from DB: $name")
    }
}

class Logger {

    fun log(messege: String) {
        println("LOG: $message")
    }
}

/////////////////

fun main() {

    val userRepository = UserRepository()
    val logger = Logger()

    val userService = UserService(userRepository, logger)

    userService.added("Mihai")
    userService.removeUser("Mihai")
}