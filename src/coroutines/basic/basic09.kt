package coroutines.basic

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        repeat(5) { i ->
            println("Coroutine A, $i")
        }
    }

    launch {
        repeat(5) { i ->
            println("Coroutine B, $i")
        }
    }

    println("Coroutine Outer")
}