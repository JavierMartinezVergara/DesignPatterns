package pattens.creational.abstractfactory


class AbstractFactoryImpl {
    private val portProperty = property("port: 8080")

    fun abstractMethod(){
        if(portProperty is IntProperty){
            val port: Int? = portProperty.value as? Int
            println(port)
        }
    }

    fun property(prop: String): Property {
        val (name, value) = prop.split(":")

        return when (name) {
            "port" -> IntProperty(name, value.trim().toInt())
            "environment" -> StringProperty(name, value.trim())
            else -> throw RuntimeException("Unknown property: $name")
        }
    }

    fun server(propertyStrings: List<String>):
            ServerConfiguration {
        val parsedProperties = mutableListOf<Property>()
        for (p in propertyStrings) {
            parsedProperties += property(p)
        }
        return ServerConfigurationImpl(parsedProperties)
    }
}