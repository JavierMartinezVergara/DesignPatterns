package pattens.structural.decorator

class LoggingGetCaptainStarTrekRepository : StarTrekRepository() {
    override fun getCaptain(starshipName: String): String {
        println("Getting captain for $starshipName")
        return super.getCaptain(starshipName)
    }
}