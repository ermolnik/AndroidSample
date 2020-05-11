package ru.ermolnik.androidsample.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ru.ermolnik.androidsample.vm.ViewModelFactory

@Module(includes = [AppViewModelModule::class])
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory):
    ViewModelProvider.Factory
}
