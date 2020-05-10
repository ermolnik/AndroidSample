package ru.ermolnik.base.util

import android.content.Context
import ru.ermolnik.base.R
import javax.inject.Inject

class DefaultErrorFactory @Inject constructor(val context: Context) : ErrorFactory {
    override fun createEmptyErrorMessage(): String = context.getString(R.string.empty_state_message)

    override fun createApiErrorMessage(e: Exception): String = e.message.toString()
}
