package ru.ermolnik.base.util

interface ErrorFactory {
    fun createEmptyErrorMessage(): String

    fun createApiErrorMessage(e: Exception): String
}
