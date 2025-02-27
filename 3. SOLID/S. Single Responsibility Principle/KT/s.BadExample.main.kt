class UserManager {

    fun addUser(name: String) {
        println("Adding user: $name")
        Database.saveUser(name)
        Logger.log("User $name added")
    }

    fun removeUser(name: String) {
        println("Removing user: $name")
        Database.deleteUser(name)
        Logger.log("User $name removed")
    }
}

object Database {

    fun saveUser(name: String) {
        println("Saving user to DB: $name")
    }

    fun deleteUser(name: String) {
        println("Deleting user from DB: $name")
    }
}

object Logger {

    fun log(messege: String) {
        println("LOG: $message")
    }
}