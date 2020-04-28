package ru.ermolnik.base.util.ext

import android.content.Context
import android.view.LayoutInflater

inline val Context.inflater: LayoutInflater
    get() = LayoutInflater.from(this)
