package Kotlins

fun main(array: Array<String>) {
    var obj = Addrress()
    println(obj.data)
}

class Addrress {
    lateinit var data: String

    fun setUp() {
        data = "나중에"
    }
}