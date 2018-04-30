package com.example.salim.smack.Controller

import android.app.Application
import com.example.salim.smack.Utilities.SharedPrefs

/**
 * Created by salimhaddad on 4/30/18.
 */
class App: Application() {



    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {


        prefs = SharedPrefs(applicationContext)

        super.onCreate()
    }
}