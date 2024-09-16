package coroutines.compote

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        val one = somethingUsefulOneAsync()
        val two = somethingUsefulTwoAsync()
        runBlocking {
            println("The answer is ${one.await() + two.await()}")
        }
    }
    println("Completed is $time ms")
}

fun somethingUsefulOneAsync() = GlobalScope.async { doSomethinUsefulOne1111() }

fun somethingUsefulTwoAsync() = GlobalScope.async { doSomethinUsefulTwo2222() }

suspend fun doSomethinUsefulOne1111(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethinUsefulTwo2222(): Int {
    delay(1000L)
    return 29
}