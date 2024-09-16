package Kotlins

fun main(args: Array<String>) {
    val myobj = object : Runnable {
        override fun run() {
            println("hello kotlin")
            }
        }
    val t = Thread(myobj)
    t.run()

    println()

    //객체 표현식 상속 없는 경우

    val data = object {}
    println(data)

    println()

    //객체 표현식의 제약 사항
    MyClass().print()
}

class MyClass {
    //public fun publicFun() = object {
    //    val x = 111
    //}

    private fun privateFun() = object {
        var x = 222
    }

    fun print() {
        //println(publicFun().x)
        println(privateFun().x)
    }
}

