/*
 * Copyright 2019 nuhkoca.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobilemovement.kotlintvmaze.base.util.delegate

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.ermolnik.base.util.delegate.AdapterItem
import ru.ermolnik.base.util.delegate.DelegateAdapter
import javax.inject.Inject

class DelegateAdapterManager @Inject constructor(
    private val delegateAdapters: List<@JvmSuppressWildcards DelegateAdapter>
) {
    fun createViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder =
        delegateAdapters[type].createViewHolder(parent)

    fun bindViewHolder(type: Int, holder: RecyclerView.ViewHolder, item: AdapterItem) =
        delegateAdapters[type].bindViewHolder(holder, item)

    fun getViewType(item: AdapterItem): Int {
        return delegateAdapters.indexOfFirst { delegateAdapter ->
            delegateAdapter.isForViewType(item)
        }
    }
}
