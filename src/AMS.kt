import java.util.*

fun main(args: Array<String>) {

 queryDayOfWeek("Kotlin")

}

fun queryDayOfWeek(name: String) {

    print("Hello ${name}, ")
    println("What day is today?")
    println("Today is " + dayOfWeek())

}

fun dayOfWeek(): String {

    return when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wedensday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Misterious Day"
    }

}