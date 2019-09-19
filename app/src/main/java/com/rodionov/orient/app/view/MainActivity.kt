package com.rodionov.orient.app.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rodionov.orient.R

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_bar)
        Log.d("orientApp", "onCreate MainActivity")
    }

}
