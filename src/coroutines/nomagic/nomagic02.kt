package coroutines.nomagic

import kotlinx.coroutines.*
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

fun main() {
    println("[in] main")
    myCoroutine(MyContinuation())
    println("\n[out] main")
}

fun myCoroutine(cont: MyContinuation) {
    when(cont.label) {
        0 -> {
            println("\nmyCoroutine(), label : ${cont.label}")
            cont.label = 1
            fetchUserData1(cont)
        }
        1 -> {
            println("\nmyCprputine(). label: ${cont.label}")
            val userData = cont.result
            cont.label = 2
            cacheUserData1(userData, cont)
        }
        2 -> {
            println("\nmyCoroutine(). label: ${cont.label}")
            val userCache = cont.result
            updateTexView1(userCache)
        }
    }
}

fun fetchUserData1(cont: MyContinuation) {
    println("fetchUserData(), called")
    val result = "[서버에서 받은 사용자 정보]"

    println("fetchUserData(), 작업완료: $result")
    cont.resumeWith(Result.success(result))
}

fun cacheUserData1(user: String, cont: MyContinuation) {
    println("cachaUserData(), called")
    val result = "[캐쉬함 $user]"
    println("caheUserData(), 작업완료: $result")
    cont.resumeWith(Result.success(result))
}

fun updateTexView1(user: String) {
    println("updataTextView(), called")
    println("updataTextView(), 작업완료: [텍스트 뷰에 출력 $user]")
}

class MyContinuation(override val context: CoroutineContext = EmptyCoroutineContext)
    : Continuation<String> {
        var label = 0
        var result = ""

    override fun resumeWith(result: Result<String>) {
        this.result = result.getOrThrow()
        println("Continuation.resumeWith()")
        myCoroutine(this)
    }
}