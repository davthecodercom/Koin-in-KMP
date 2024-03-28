package org.davthecoder.mobprogramming

import android.app.Application
import di.commonModule
import org.koin.core.context.startKoin

class MainApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(commonModule)
        }
    }
}