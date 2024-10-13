package coroutines.context

import kotlinx.coroutines.*

class Activity {
    private val mainScope = CoroutineScope(Dispatchers.Default)

    fun destory() {
        mainScope.cancel()
    }

    fun doSomething() {
        repeat(10) { i ->
            mainScope.launch {
                delay((i + 1) * 200L)
                println("Coroutine $i is done")
            }
        }
    }
}

fun main() = runBlocking<Unit> {
    val activity = Activity()
    activity.doSomething()
    println("Launched coroutine")
    delay(500L)
    println("Destroying acitity!")
    activity.destory()
    delay(1000)
}