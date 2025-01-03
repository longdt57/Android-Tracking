package com.app.androidcompose

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupFirebase()
    }

    private fun setupFirebase() {
        FirebaseApp.initializeApp(this)
    }
}