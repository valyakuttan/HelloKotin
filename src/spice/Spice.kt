package spice

fun main(args: Array<String>) {

    val curry = Curry("very spicy")
    println("Curry has a hotness of ${curry.heat}")
    println("Curry has a color of ${curry.color}")
}

class Curry(spiciness: String): Spice("Curry",
    spiciness), Grinder, SpiceColor by YellowColor {
    override fun prepareSpice() {
        println("Preparing Curry")
        grind()
    }

}

object YellowColor: SpiceColor {
    override val color: String
        get() = "yellow"

}

interface SpiceColor {
    val color: String
}

interface Grinder {

    fun grind() {
        println("Grinding")
    }
}

abstract class Spice(val name: String, val spiciness: String = "mild"): SpiceColor {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()
}

class CommonSpice(
    name: String,
    spiciness: String = "mild",
    color: SpiceColor = YellowColor,
): SpiceColor by color, Spice(name, spiciness){

    override fun prepareSpice() {
        println("Spice prepared")
    }

}

fun makeSalt() = CommonSpice("Salt")

val commonSpices = listOf(
    CommonSpice("curry", "mild"),
    CommonSpice("pepper", "medium"),
    CommonSpice("cayenne", "spicy"),
    CommonSpice("ginger", "mild"),
    CommonSpice("red curry", "medium"),
    CommonSpice("green curry", "mild"),
    CommonSpice("hot pepper", "extremely spicy")
)