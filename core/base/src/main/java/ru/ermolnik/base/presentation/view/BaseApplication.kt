package ru.ermolnik.base.presentation.view

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerApplication
import ru.ermolnik.base.util.TimberFactory
import javax.inject.Inject

abstract class BaseApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        injectDagger()
        TimberFactory.setupOnDebug()
    }

    abstract fun injectDagger()

}