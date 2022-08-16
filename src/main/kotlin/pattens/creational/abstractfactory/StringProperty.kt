package pattens.creational.abstractfactory

data class StringProperty(
    override val name: String,
    override val value: String
) : Property
