package coroutines.nomagic

import kotlinx.coroutines.*

fun main(): Unit {
    GlobalScope.launch {
        val userData = fetchUserData()
        val userCache = cacheUserData(userData)
        updateTexView(userCache)
    }
}

suspend fun fetchUserData() = "user_name"

suspend fun cacheUserData(user: String) = user

fun updateTexView(user: String) = user