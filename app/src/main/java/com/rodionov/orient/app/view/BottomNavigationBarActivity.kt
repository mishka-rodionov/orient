package com.rodionov.orient.app.view

import android.os.Bundle
import android.util.Log
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseRouterImpl
import kotlinx.android.synthetic.main.activity_bottom_navigation_bar.*

/**
 * Created by rodionov on 08.09.2019.
 */
class BottomNavigationBarActivity: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("orientApp", "onCreate BottomNavigationBarActivity")

        bottomNavigationBar.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.news -> text.text = "news"
                R.id.total -> text.text = "total"
                R.id.account -> text.text = "account"
            }
        }

        val baseRouterImpl = BaseRouterImpl(fragmentManager = supportFragmentManager)
        baseRouterImpl.openFirstFragment()


    }


}