package com.example.programminginfo.presentation.util

import android.util.Log
import android.widget.Toast

fun String.myLog(tag: String = "TTT") {
    Log.d(tag, this)
}