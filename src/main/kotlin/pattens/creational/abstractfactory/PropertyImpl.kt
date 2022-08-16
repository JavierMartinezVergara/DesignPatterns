package pattens.creational.abstractfactory

data class PropertyImpl(
    override val name: String,
    override val value: Any
) : Property