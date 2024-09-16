package Kotlins

fun main(args: Array<String>) {
    val(name, age) = User("heeee", 1)
    println("$name, $age")

}
data class User(var name: String, var age: Int)