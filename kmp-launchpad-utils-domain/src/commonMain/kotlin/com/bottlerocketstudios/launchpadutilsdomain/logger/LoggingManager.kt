package com.bottlerocketstudios.launchpadutilsdomain.logger

interface LoggingManager {
    fun v(tag: String? = null, message: String?, t: Throwable? = null)
    fun d(tag: String? = null, message: String?, t: Throwable? = null)
    fun i(tag: String? = null, message: String?, t: Throwable? = null)
    fun w(tag: String? = null, message: String?, t: Throwable? = null)
    fun e(tag: String? = null, message: String?, t: Throwable? = null)
    fun wtf(tag: String? = null, message: String?, t: Throwable? = null)
}

interface Loggable {
    val log: LoggingManager
}
