package coroutines.compote

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.*

suspend fun main() {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed is $time ms")
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethinUsefulOne11111() }
    val two = async { doSomethinUsefulTwo22222() }
    one.await() + two.await()
}

suspend fun doSomethinUsefulOne11111(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethinUsefulTwo22222(): Int {
    delay(1000L)
    return 29
}