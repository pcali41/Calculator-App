package com.example.calculator

import android.app.Application
import timber.log.Timber

class CalculatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}