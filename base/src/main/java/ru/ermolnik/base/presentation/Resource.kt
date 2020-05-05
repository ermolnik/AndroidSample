package ru.ermolnik.base.presentation

import ru.ermolnik.base.presentation.Status.EMPTY
import ru.ermolnik.base.presentation.Status.ERROR
import ru.ermolnik.base.presentation.Status.LOADING
import ru.ermolnik.base.presentation.Status.SUCCESS

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T? = null): Resource<T> {
            return Resource(SUCCESS, data, null)
        }

        fun <T> error(msg: String): Resource<T> {
            return Resource(ERROR, null, msg)
        }

        fun <T> loading(data: T? = null): Resource<T> {
            return Resource(LOADING, data, null)
        }

        fun <T> empty(msg: String): Resource<T> {
            return Resource(EMPTY, null, msg)
        }
    }
}
