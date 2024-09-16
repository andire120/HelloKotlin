package coroutines.compote

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomethinUsefulOne111() }
        val two = async(start = CoroutineStart.LAZY) { doSomethinUsefulTwo222() }
        one.start()
        two.start()
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethinUsefulOne111(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethinUsefulTwo222(): Int {
    delay(1000L)
    return 29
}