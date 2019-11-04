package com.keding.testsoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.keding.util.Tools

//import com.keding.nativeutil.BSDiffUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val stringFromJni = BSDiffUtil.getStringFromJni()
        Log.d("Main","11999999"+Tools.get())

    }
}
