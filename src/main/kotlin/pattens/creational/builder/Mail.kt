package pattens.creational.builder

data class Mail(
    val to: List<String>,
    private var _message: String? = null,
    private var _cc: List<String>? = null,
    private var _title: String? = null,
    private var _important: Boolean? = null
) {
    fun message(message: String) = apply {
        _message = message
    }

    fun cc(cc: List<String>) = apply {
        _cc = cc
    }

    fun build(): Mail {
        if (to.isEmpty()) throw RuntimeException("To property is empty")
        return Mail(to, _message, _cc, _title, _important)

    }
}