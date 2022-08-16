package pattens.structural.adapter

interface UsbMini {
    val hasPower: Power
}

enum class Power {
    TRUE, FALSE
}