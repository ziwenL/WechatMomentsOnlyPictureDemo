package com.example.test.base

import android.app.Application
import com.example.test.utils.GlideUtil

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        GlideUtil.init(this)
    }
}