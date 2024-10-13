package coroutines.context

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    println("My jpb is ${coroutineContext[Job]}")
}