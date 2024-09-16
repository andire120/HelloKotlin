package Kotlins

fun main(array: Array<String>) {
    val obj = Customer("Kotlin")
    println(obj)
}

class Customer(name: String) {
    init {
        println("이름 : $name")
    }

}