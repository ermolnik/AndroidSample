package ru.ermolnik.base.util

import ru.ermolnik.base.BuildConfig.DEBUG
import timber.log.Timber

object TimberFactory {
    fun setupOnDebug() {
        Timber.uprootAll()
        if (DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
