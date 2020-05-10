package ru.ermolnik.base.util

import timber.log.Timber

object TimberFactory {
    fun setupOnDebug() {
        Timber.uprootAll()
//        if (DEBUG) {
            Timber.plant(Timber.DebugTree())
//        }
    }
}
