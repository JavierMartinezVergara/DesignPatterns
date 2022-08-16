import pattens.creational.abstractfactory.AbstractFactoryImpl
import pattens.creational.builder.Mail
import pattens.creational.factory.CheesePieceImpl
import pattens.creational.staticfactory.Server
import pattens.structural.adapter.AdapterImpl
import pattens.structural.adapter.AdapterImpl.charger
import pattens.structural.adapter.AdapterImpl.usPowerOutlet
import pattens.structural.adapter.toEUplug
import pattens.structural.adapter.toUsbTypeC
import pattens.structural.bridge.BrigdeImpl
import pattens.structural.decorator.DecoratorImpl

fun main() {
    // Factory Method
    val piece = CheesePieceImpl.createPiece("paq")

    println(piece)

    // Static Factory Method
    val server = Server.withPort(400)
    println(server)

    // Abstract Factory Method
    println(AbstractFactoryImpl().server(listOf("port: 808", "environment: production")))

    // Builder
    val build = Mail(to = listOf("javier.com", "javier2.com")).message("Hello").build()
    println(build)

    // Decorator
    DecoratorImpl.decoratorImpl()

    // Adapter
    AdapterImpl.cellPhone(charger(usPowerOutlet().toEUplug()).toUsbTypeC())

    // Bridge
    BrigdeImpl.getStormTroopers()
}
