package coroutines.compote

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = doSomethingUsefulOne1()
        val two = doSomethingUsefulTwo2()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne1(): Int {
    println("start> doSomethingUsefulOne 1")
    delay(2000L)
    println("end> doSomethingUsefulOne 1")
    return 13
}

suspend fun doSomethingUsefulTwo2(): Int {
    println("start> doSomethingUsefulTwo 2")
    delay(2000L)
    println("end> doSomethingUsefulTwo 2")
    return 29
}