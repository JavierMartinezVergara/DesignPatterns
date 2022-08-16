package pattens.structural.decorator

class ValidatingAddCaptainStarTrekRepository : StarTrekRepository() {
    override fun addCaptain(
        starshipName: String,
        captainName: String
    ) {
        if (captainName.length > 15) {
            throw RuntimeException("$captainName is longer than 20 characters!")
        }
        super.addCaptain(starshipName, captainName)
    }
}