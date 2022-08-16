package pattens.creational.prototype

data class User(
    val name: String,
    val role: Role,
    private val permissions: Set<String>,
    val tasks: List<String>,
) {
    fun hasPermission(permission: String) = permission in       permissions
}

enum class Role {
    ADMIN,
    SUPER_ADMIN,
    REGULAR_USER
}