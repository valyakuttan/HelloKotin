package spice

fun main(args: Array<String>) {

    val spices = spice.commonSpices
    val mildSpices = spices.filter { it.heat < 3 }

    for (s in mildSpices) {
        println(s)
    }


}