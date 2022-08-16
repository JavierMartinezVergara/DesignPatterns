package pattens.structural.decorator

class LoggingGetCaptain(private val repository: StarTreekRepository) : StarTreekRepository by repository {

    override fun getCaptain(starshipName: String): String {
        println("Getting captain for $starshipName")
        return repository.getCaptain(starshipName)
    }
}