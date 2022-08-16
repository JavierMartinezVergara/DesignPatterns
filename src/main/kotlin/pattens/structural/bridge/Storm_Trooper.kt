package pattens.structural.bridge

const val RIFLE_DAMAGE = 3L
const val REGULAR_SPEED: Meters = 1

data class Storm_Trooper(
    private val weapon: Weapon,
    private val legs: Legs
) : Trooper {
    override fun move(x: Long, y: Long) {
        legs.move()
    }

    override fun attackRebel(x: Long, y: Long) {
        weapon.attack(x, y)
    }
}

typealias PointsOfDamage = Long
typealias Meters = Int

interface Weapon {
    fun attack(x: Long, y: Long): PointsOfDamage
}

interface Legs {
    fun move(): Meters
}
