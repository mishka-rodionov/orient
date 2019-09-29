package com.rodionov.orient.app.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rodionov.orient.R
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.app.presenter.AppPresenter
import com.rodionov.orient.app.presenter.AppPresenterImpl
import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.base.BaseView

open class MainActivity : AppCompatActivity(), BaseView<AppPresenter> {

    override var presenter: AppPresenter? = null
//        get() = field
//        set(value){/*this.presenter = value*/}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_bar)
        createMenu()
        initPresenter()
        Log.d(OrientApp.LIFECYCLE_TAG, "onCreate MainActivity")
    }

    override fun initPresenter() {}


    protected open fun createMenu() {}

}
