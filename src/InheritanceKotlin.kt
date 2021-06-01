import kotlin.math.floor

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 15.5)

    with(squareCabin) {
        println("\n Square Cabin \n===============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room ? ${hasRoom()}")
        println("Area of the room: ${floorArea()}")

    }

    with(roundHut) {
        println("\n Round Hut \n===============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room ? ${hasRoom()}")
        println("Area of the room: ${floorArea()}")
    }

    with(roundTower) {
        println("\n Round Hut \n===============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has Room ? ${hasRoom()}")
        println("Area of the room: ${floorArea()}")
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }

    abstract fun floorArea(): Double

}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }

}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return Math.PI * radius * radius
    }
}

class RoundTower(residents: Int, radius: Double, val floor: Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floor

    override fun floorArea(): Double {
        return super.floorArea() * floor
    }
}