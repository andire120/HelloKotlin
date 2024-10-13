package coroutines.context

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val requset = launch {
        GlobalScope.launch {
            println("job1 : I run in GlobalScope and execute independently")
            delay(1000)
            println("job1: I am not affected by cancellation of the requset")
        }
        launch {
            delay(100)
            println("job2: I am a child of the request coroutine")
            delay(1000)
            println("job2: I will not execute this line if my parent requset is cancelled")
        }
    }
    delay(500)
    requset.cancel()
    delay(1000)
    println("main: who has survived request cancellation?")
}