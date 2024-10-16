package coroutines.Cancellation

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("job: I'm sleeoing $i ...")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                println("job: I'm running finally.")
                delay(1000L)
                println("job: And I've just delayed for I sec because I'm non-cancellable")
            }

        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() //waits for job's completion
    println("main: Now I can quit.")
}