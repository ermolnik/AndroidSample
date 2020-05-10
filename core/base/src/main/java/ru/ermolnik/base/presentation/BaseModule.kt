package ru.ermolnik.base.presentation

import dagger.Binds
import dagger.Module
import ru.ermolnik.base.util.DefaultErrorFactory
import ru.ermolnik.base.util.ErrorFactory

@Module
abstract class BaseModule {

    @Binds
    internal abstract fun provideErrorFactory(defaultErrorFactory: DefaultErrorFactory): ErrorFactory
}
