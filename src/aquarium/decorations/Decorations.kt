package aquarium.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")

    println(d1 == d2) // false
    println(d2 == d3) // true

    val d4 = d1.copy() // d4 get same property values of d1
    println(d1 == d4) // true

    val d5 = Decorations2("marble", "wood", "diver")

    // decomposition of data class
    val (rock, wood, diver ) = d5
    println("$rock, $wood, $diver")
}

data class Decorations(val rocks: String)

data class Decorations2(
    val rocks: String,
    val wood: String,
    val diver: String,
)