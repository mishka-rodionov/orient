package com.rodionov.orient.app

import android.app.Application
import android.util.Log
import com.rodionov.orient.R
import com.rodionov.orient.app.settings.BottomNavigationViewSettings
import com.rodionov.orient.app.settings.MenuItem
import com.rodionov.orient.app.settings.ModuleTypes

/**
 * Created by rodionov on 24.09.2019.
 */
class OrientApp: Application() {

    companion object{
        val LIFECYCLE_TAG = "oLifeCycle"
        val BNV_TAG ="bnvTag"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(LIFECYCLE_TAG, "onCreate OrientApp")
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.news, ModuleTypes.NEWS, "Новости"))
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.personal, ModuleTypes.SCANNER, "Сканнер"))
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.team, ModuleTypes.START_LIST, "Стартлист"))
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.calendar, ModuleTypes.EVENT_CALENDAR, "Календарь"))
    }
}