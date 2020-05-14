package aquarium

fun main(args: Array<String>) {
    buildAquarium()
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
