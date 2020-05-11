package ru.ermolnik.androidsample.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.ermolnik.androidsample.vm.ViewModelKey
import ru.ermolnik.androidsample.vm.AppViewModel

@Module
abstract class AppViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AppViewModel::class)
    internal abstract fun bindAppViewModel(mainViewModel: AppViewModel): ViewModel
}
