package pattens.creational.abstractfactory

data class ServerConfigurationImpl(
    override val properties: List<Property>
) : ServerConfiguration