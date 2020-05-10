package ru.ermolnik.base.util.ext

import androidx.databinding.ViewDataBinding

inline fun <reified T : ViewDataBinding> T.use(crossinline block: T.() -> Unit = {}) {
    block()
    executePendingBindings()
}
