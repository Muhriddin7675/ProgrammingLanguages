package com.example.programminginfo.app

import android.app.Application
import com.example.programminginfo.data.MyShared
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp:Application(){
    override fun onCreate() {
        super.onCreate()
        MyShared.init(this)
    }
}