package ru.ermolnik.androidsample.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.ermolnik.androidsample.App
import ru.ermolnik.androidsample.di.module.ViewModelModule
import ru.ermolnik.androidsample.di.module.ActivityBuilder
import ru.ermolnik.androidsample.di.module.ContextModule
import ru.ermolnik.base.presentation.di.BaseModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        BaseModule::class,
        ContextModule::class,
        ActivityBuilder::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    override fun inject(instance: App?)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}