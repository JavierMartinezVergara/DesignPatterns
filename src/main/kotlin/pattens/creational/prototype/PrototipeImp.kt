package pattens.creational.prototype

object PrototipeImp {

    // In real application this would be a database of users
    val allUsers = mutableListOf<User>()
    fun createUser(name: String, role: Role) {
        for (u in allUsers) {
            if (u.role == role) {
            allUsers += u.copy(name = name)
            return
            }}
        // Handle case that no other user with such a role exists
    }
}