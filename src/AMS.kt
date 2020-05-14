fun main(args: Array<String>) {

    val xs = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // eagerly compute filtered list from the input
    val eagerList = xs.filter { it % 3 == 1 }

    // lazy computation of filtered list, compute the element
    // only when the element is accessed.
    val lasyList = xs.asSequence().filter { it % 3 == 1 }

    println("Eager list")
    println(eagerList)

    println("Lazy list")
    println(lasyList)

    println("For Lazy list we must access element one by one.")

    println(lasyList.toList())

}
