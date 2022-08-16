package pattens.structural.bridge

class Batton : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE * 3
}
