package pattens.structural.adapter

object AdapterImpl {

    fun cellPhone(chargeCable: UsbTypeC) {
        if (chargeCable.hasPower) {
            println("I've Got The Power!")
        } else {
            println("No power")
        }
    }

    fun usPowerOutlet(): USPlug {
        return object : USPlug {
            override val hasPower = 1
        }
    }

    fun charger(plug: EUPlug): UsbMini {
        return object : UsbMini {
            override val hasPower=Power.valueOf(plug.hasPower)
        }
    }

}

fun USPlug.toEUplug() : EUPlug{
    val hasPower = if (this.hasPower == 1) "TRUE" else "FALSE"
    return object : EUPlug {
        override val hasPower = hasPower
    }
}

fun UsbMini.toUsbTypeC(): UsbTypeC {
    val hasPower = this.hasPower == Power.TRUE
    return object : UsbTypeC {
        override val hasPower = hasPower
    }
}