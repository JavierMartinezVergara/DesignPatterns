package pattens.structural.decorator

object DecoratorImpl {

    val starTrekRepository = DefaultStarTrekRepository()
    val withValidating = ValidatingAdd(starTrekRepository)
    val withLoggingAndValidating = LoggingGetCaptain(withValidating)

    fun decoratorImpl(){
        withLoggingAndValidating.getCaptain("USS Enterprise")
        withLoggingAndValidating.addCaptain("USS Voyager","Kathryn Janeway")
    }

}