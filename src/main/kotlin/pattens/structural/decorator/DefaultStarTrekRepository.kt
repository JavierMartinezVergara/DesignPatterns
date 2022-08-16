package pattens.structural.decorator

class DefaultStarTrekRepository : StarTreekRepository {
    private val starshipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")
    override fun getCaptain(starshipName: String): String {
        return starshipCaptains[starshipName] ?: "Unknown"
    }

    override fun addCaptain(starshipName: String, captainName: String) {
        starshipCaptains[starshipName] = captainName
    }
}