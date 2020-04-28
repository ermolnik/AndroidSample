package ru.ermolnik.base.util.delegate

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.ermolnik.base.util.delegate.AdapterItem

interface DelegateAdapter {
    fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun bindViewHolder(holder: RecyclerView.ViewHolder, item: AdapterItem)
    fun isForViewType(item: AdapterItem): Boolean
}
