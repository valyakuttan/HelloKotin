import java.util.*

fun main(args: Array<String>) {

    for (i in 1..10) println("$random1, ${random2()}")

    // Initialize with 10 random Int values
    val xs = List(10) { Random().nextInt(100)}
    println(xs)
}

val random1: Int = Random().nextInt(10)
val random2: () -> Int = {Random().nextInt(10)}

var dirty = 20

val waterFilter: (Int) -> Int = {dirty -> dirty / 2}

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    operation(dirty)

    return dirty
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)

    // passing a named function requires ::, to indicate that
    // we are passing a reference
    dirty = updateDirty(dirty, ::feedFish)

    // Last parameter call syntax, the last parameter can be passed
    // inside a curly braces
    dirty = updateDirty(dirty) {
        ditry -> dirty * 2
    }
}