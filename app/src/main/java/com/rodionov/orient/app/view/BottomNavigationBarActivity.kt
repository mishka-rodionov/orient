package com.rodionov.orient.app.view

import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.rodionov.orient.app.ApplicationAssembler
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.app.settings.BottomNavigationViewSettings
import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.base.BaseRouterImpl
import kotlinx.android.synthetic.main.activity_bottom_navigation_bar.*

/**
 * Created by rodionov on 08.09.2019.
 */
class BottomNavigationBarActivity: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(OrientApp.LIFECYCLE_TAG, "onCreate BottomNavigationBarActivity")

//        bottomNavigationBar.setOnNavigationItemReselectedListener {
//            when(it.itemId){
//                R.id.news -> text.text = "news"
//                R.id.total -> text.text = "total"
//                R.id.account -> text.text = "account"
//            }
//        }

        val baseRouterImpl = BaseRouterImpl(supportFragmentManager)
        baseRouterImpl.openFirstFragment()


    }

    override fun initPresenter() {
        ApplicationAssembler().assemble(this)
    }

    override fun createMenu(){
        BottomNavigationViewSettings.item.forEach {
            Log.d(OrientApp.BNV_TAG, "item name = ${it.name}")
            bottomNavigationBar.menu.add(Menu.NONE, it.type, Menu.NONE, it.name).setIcon(it.image)
        }

        bottomNavigationBar.setOnNavigationItemSelectedListener {

            return@setOnNavigationItemSelectedListener true
        }
    }


}