fun main(args: Array<String>) {
    foo0()

    println()

    foo2()

    println()

    foo3()

    println()

    foo4()
}

fun foo0() { //forEach
    var ints = listOf(0, 1, 2, 3)
    ints.forEach(
        fun(value: Int) {
            if(value == 1) return
            print(value)
        }
    )
    print("End")
}

fun foo2() { //위와 똑같은 forEach인데 람다임.
    var ints = listOf(0, 1, 2, 3)
    ints.forEach(
        {
            if(it == 1) return
            print(it)
        }

    )
    print("End")
}

fun foo3() { //레이블을 이용해서 return
    var ints = listOf(0, 1, 2, 3)
    ints.forEach label@ {
        if(it == 1) return@label
        print(it)
    }
    print("End")
}

fun foo4() {  //암시적 레이블
    var ints = listOf(0, 1, 2, 3)
    ints.forEach {
        if(it == 1) return@forEach
        print(it)
    }
    print("End")
}

fun foo(): List<String> { //레이블 return시 값을 반환할 경우
    var ints = listOf(0, 1, 2, 3)
    var result = ints.map {
        if(it == 0) {
            return@map "zero"
        }
        "number $it"
    }
    return result
}