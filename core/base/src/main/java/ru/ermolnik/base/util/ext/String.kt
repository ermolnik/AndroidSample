package ru.ermolnik.base.util.ext

import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.text.Html
import android.text.Spanned

private const val HTTPS_PREFIX = "https://"
private const val HTTP_REGEX = "^http?://"

@Suppress("DEPRECATION")
fun String.fromHtml(): Spanned {
    return if (VERSION.SDK_INT >= VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(this)
    }
}

fun String.addHttpsPrefix(): String {
    return if (startsWith(HTTPS_PREFIX)) {
        this
    } else {
        replace(HTTP_REGEX.toRegex(), HTTPS_PREFIX)
    }
}
