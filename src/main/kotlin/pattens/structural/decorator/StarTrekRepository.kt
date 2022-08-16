package pattens.structural.decorator

open class StarTrekRepository {
    private val starshipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")

    open fun getCaptain(starshipName: String): String {
        return starshipCaptains[starshipName] ?: "Unknown"
    }

    open fun addCaptain(starshipName: String, captainName: String) {
        starshipCaptains[starshipName] = captainName
    }
}