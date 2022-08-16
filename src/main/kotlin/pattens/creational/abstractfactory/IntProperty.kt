package pattens.creational.abstractfactory

data class IntProperty(
    override val name: String,
    override val value: Int
) : Property