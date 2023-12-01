package com.example.koinannotationdependencyissue

import android.app.Application
import com.example.moduleb.BModule
import com.example.modulec.CModule
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                BModule().module,
                CModule().module
            )
        }
    }
}