fun main(arg: Array<String>) {
    val obj = Address()
    println(obj.name)
}

class Address {
    var name: String = "Kotlin"
        get() { return field + "!!!" }
        set(value)
        {
            field = value
        }
}