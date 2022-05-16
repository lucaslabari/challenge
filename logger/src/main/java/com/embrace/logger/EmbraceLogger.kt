package com.embrace.logger

class EmbraceLogger: Logger {
    override fun log(message: String): Boolean {
        return false
    }
}