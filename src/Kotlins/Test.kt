package Kotlins

fun main() {
    var a: Int = 10000
    var b: Int? = 10000

    println("a === b: ${a === b}")
    println("a == b: ${a == b}")

    println()

    var collection = listOf(1, 2, 3, 4, 5)
    collection.iterator()
    for(item in collection)
        print(item)

    val array = arrayOf(1, 2, 3, 4, 5)
    array.iterator()
    for(i in array)
        println("$i: $array[i]")

}