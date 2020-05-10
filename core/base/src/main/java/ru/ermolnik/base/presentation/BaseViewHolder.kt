package ru.ermolnik.base.presentation

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import ru.ermolnik.base.util.delegate.getBinding

abstract class BaseViewHolder<DB : ViewDataBinding, T : Any>(itemView: View) :
    ViewHolder(itemView) {

    protected val dataBinding: DB by getBinding(itemView)

    abstract fun bindTo(item: T)
}
