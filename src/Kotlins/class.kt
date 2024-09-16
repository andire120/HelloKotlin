package Kotlins

fun main(args: Array<String>) {
    val obj = CC()
    obj.f()
}

open class AA() {
    open fun f() {
        println("AAAAA")
    }
}

interface BB {
    fun f() {
        println("BBBBB")
    }
}

class CC() : AA(), BB {
    override fun f() {
        println("1")
        super <AA>.f()
        println("2")
        super <BB>.f()
        println("3")
    }
}