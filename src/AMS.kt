import java.util.*

fun main(args: Array<String>) {
    feedFish()
    println(canAddFish(10.0, listOf(3,3,3)) == false)
    println(
        canAddFish(8.0, listOf(2,2,2), hasDecorations = false) == true
    )
    println(canAddFish(9.0, listOf(1,1,3), 3) == false)
    println(
        canAddFish(10.0, listOf(), 7, true) == true
    )
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun feedFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday")

    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String) = when (day) {
    "Monday" -> "flakes"
    else -> "pellets"
}
