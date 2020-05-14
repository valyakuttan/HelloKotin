package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int
    init {
        if (friendly) {
         size = volumeNeeded
        }
        else {
            size = volumeNeeded * 2
        }
    }
}

// Instead of secondary constructors use helper function to make custom
// objects
fun makeFriendlyFish(size: Int) = Fish(true, size)

fun fishExample() {
    val fish = Fish(true, 20)
    println("This ${if (fish.friendly) "friendly" else "unfriendly"}"+
            " fish occupies ${fish.size} volume")
}