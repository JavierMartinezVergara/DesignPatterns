package pattens.structural.decorator

class ValidatingAdd(private val repository: StarTreekRepository) : StarTreekRepository by repository {

    private val maxNameLength = 20
    override fun addCaptain(starshipName: String, captainName: String) {
        require (captainName.length < maxNameLength) {
            "$captainName name is longer than $maxNameLength characters!"
        }
        repository.addCaptain(starshipName, captainName)
    }
}