package aquarium

// Interface delegation let's you add features to a class via composition
// Composition is use an instance of a class rather than inheriting from it

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    val shark = Shark()
    println("Plecostomus has color ${pleco.color}")
    pleco.eat()

    println("Shark has color ${shark.color}")
    shark.eat()

}

// Every access to color property is delegated to an access to
// the color property of GlodColor
class Plecostomus: FishAction by PrintFishAction("plecostomus eat a lot of algae"),
    FishColor by GoldColor

// singleton pattern in Kotlin
object GoldColor: FishColor {
    override val color = "gold"
}

// Interface delegation is used to implement the FishColor interface
// every access to color property is delegated to the color property
// of color property of fishColor
class Shark(fishColor: FishColor = GrayColor): FishAction, FishColor by fishColor {
    override fun eat() {
        println("shark hunt and eat other fishes")
    }

}

object GrayColor: FishColor {
    override val color: String
        get() = "gray"

}

class PrintFishAction(private val food: String): FishAction {
    override fun eat() {
        println(food)
    }

}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}
