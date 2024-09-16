package coroutines.compote

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async{ doSomethingUsefulOne11() }
        val two = async{ doSomethingUsefulTwo22() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne11(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo22(): Int {
    delay(1000L)
    return 29
}