package pattens.creational.abstractfactory

interface Parser {
    fun property(prop: String): Property
    fun server(propertyStrings: List<String>): ServerConfiguration
}