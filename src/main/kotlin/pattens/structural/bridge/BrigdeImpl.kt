package pattens.structural.bridge

object BrigdeImpl {

    fun getStormTroopers() {
        val stormTrooper = Storm_Trooper(Rifle(), RegularLegs())
        println(stormTrooper)
        val flameTrooper = Storm_Trooper(Flamethrower(), RegularLegs())
        println(flameTrooper.toString())
        val scoutTooper = Storm_Trooper(Rifle(), AthleticLegs())
        println(scoutTooper)
    }
}
