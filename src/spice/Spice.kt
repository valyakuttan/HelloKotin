package spice

fun main(args: Array<String>) {

    val curry = Curry("very spicy")
    println("Curry has a hotness of ${curry.heat}")
    println("Curry has a color of ${curry.color}")

    val spices = commonSpices + listOf(curry, Salt)
    for (spice in spices)
        useSpice(spice)

}

// sealed class can be used in when statement
fun useSpice(spice: Spice) = when (spice) {
    is Curry -> println("Curry")
    is Salt  -> println("Salt")
    is CommonSpice -> println(spice.name)
}

class Curry(spiciness: String): Spice("Curry",
    spiciness), Grinder, SpiceColor by YellowColor {
    override fun prepareSpice() {
        println("Preparing Curry")
        grind()
    }

}

object YellowColor: SpiceColor {
    override val color: Color
        get() = Color.YELLOW

}

interface SpiceColor {
    val color: Color
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00),
    WHITE(0xFFFFFF);
}
interface Grinder {

    fun grind() {
        println("Grinding")
    }
}

sealed class Spice(
    val name: String,
    val spiciness: String = "mild"
): SpiceColor {

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

object Salt: Spice("Salt"),
    SpiceColor by WhiteColor{
    override fun prepareSpice() {
        println("make salt")
    }
}

object  WhiteColor : SpiceColor {
    override val color: Color
        get() = Color.WHITE

}
val commonSpices = listOf(
    CommonSpice("curry", "mild"),
    CommonSpice("pepper", "medium"),
    CommonSpice("cayenne", "spicy"),
    CommonSpice("ginger", "mild"),
    CommonSpice("red curry", "medium"),
    CommonSpice("green curry", "mild"),
    CommonSpice("hot pepper", "extremely spicy")
)