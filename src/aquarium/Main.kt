package aquarium

fun main(args: Array<String>) {

    buildAquarium()

    val aquariumFishes = mkFishes()
    for (fish in aquariumFishes) {
        feedFish(fish)
    }
}

// restrict a function to those objects which
// implements a given interface
fun feedFish(fish: FishAction) {
    fish.eat()
}

fun mkFishes(): List<FishAction> {

    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\n" +
            "Pleco: ${pleco.color}")

    shark.eat()
    pleco.eat()

    return listOf(shark, pleco)

}

fun buildAquarium() {

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Aquarium for nine fishes")
    println("Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height}")

    println("Volume: ${myAquarium2.volume} liters")

    val myAquarium = Aquarium()

    println()
    println("Default aquarium")
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(10, 20, 40)

    println()
    println("For the small aquarium: ")
    println("Length: ${smallAquarium.length} " +
            "Width: ${smallAquarium.width} " +
            "Height: ${smallAquarium.height}")

    println("Volume: ${smallAquarium.volume} liters")

}
