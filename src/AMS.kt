import java.util.*

fun main(args: Array<String>) {
    feedFish()
}

fun shouldChangeWater(
    day: String,
    dirty: Int = 20,
    temperature: Int = 22
): Boolean {
    return true
}

fun feedFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) println("Change the water today.")
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
