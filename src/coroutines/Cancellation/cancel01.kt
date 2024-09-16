package coroutines.Cancellation

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeoing $i ...")
            delay(500L)
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() //waits for job's completion
    println("main: Now I can quit.")
}