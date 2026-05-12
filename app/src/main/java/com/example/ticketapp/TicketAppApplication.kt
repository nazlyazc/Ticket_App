package com.example.ticketapp

import android.app.Application
import com.example.data.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import com.example.ticketapp.di.appModule

class TicketAppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@TicketAppApplication) //
            modules(
                dataModule, // dataModule olarak tanımlanan bağımlılıkları projemde aktif et.
                appModule
            )
        }
    }
}