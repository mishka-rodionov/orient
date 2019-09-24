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
        val TAG = "oLifeCycle"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate OrientApp")
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.news, ModuleTypes.NEWS, "Новости"))
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.personal, ModuleTypes.SCANNER, "Сканнер"))
        BottomNavigationViewSettings.item.add(MenuItem(R.drawable.team, ModuleTypes.START_LIST, "Стартовый протокол"))
    }
}