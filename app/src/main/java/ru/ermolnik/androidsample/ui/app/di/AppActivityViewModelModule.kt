package ru.ermolnik.androidsample.ui.app.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.ermolnik.androidsample.ui.app.view.AppActivityViewModel
import ru.ermolnik.androidsample.vm.ViewModelKey

@Module
abstract class AppActivityViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AppActivityViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: AppActivityViewModel): ViewModel
}
