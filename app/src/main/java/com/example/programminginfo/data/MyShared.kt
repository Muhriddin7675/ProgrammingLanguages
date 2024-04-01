package com.example.programminginfo.data

import android.content.Context
import android.content.SharedPreferences

object MyShared {
    private lateinit var myShared: SharedPreferences
    fun init(contex: Context) {
        myShared = contex.getSharedPreferences("MyShared", Context.MODE_PRIVATE)
    }

    fun setBoolean(bool: Boolean) {
        myShared.edit().putBoolean("Bool", bool).apply()
    }

    fun getBoolean(): Boolean {
        return myShared.getBoolean("Bool", false)
    }
}