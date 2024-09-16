package coroutines.basic

import kotlinx.coroutines.*

fun main() = runBlocking {
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm slepping $i ...")
            delay(500L)
        }
    }
    delay(1300L) //just quit after delay
}