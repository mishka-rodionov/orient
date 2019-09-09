package com.rodionov.orient.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rodionov.orient.R

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_bar)
    }
}
