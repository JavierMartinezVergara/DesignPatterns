package pattens.structural.decorator

interface StarTreekRepository {
    fun getCaptain(starshipName: String): String
    fun addCaptain(starshipName: String, captainName: String)

}