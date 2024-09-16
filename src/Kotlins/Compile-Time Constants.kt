package Kotlins

const val MY_CONST = "CONST"

@Deprecated(MY_CONST)
fun main(args: Array<String>) {
     var obj = Addresss()
    println(obj.isEmpty)

}

class Addresss {
    val isEmpty: Boolean = false
        get() { return field }
}