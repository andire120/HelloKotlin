package coroutines.Cancellation

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while(isActive) {
           if(System.currentTimeMillis() >= nextPrintTime) {
               println("job: I'm slepping ${i++} ...")
               nextPrintTime += 500L
           }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() //cancels the job and waits for its cmpletion
    println("main: Now I can quit.")
}