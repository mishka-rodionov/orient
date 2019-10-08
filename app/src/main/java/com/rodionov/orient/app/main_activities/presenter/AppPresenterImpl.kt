package com.rodionov.orient.app.main_activities.presenter

import com.rodionov.orient.app.main_activities.interactor.AppInteractor
import com.rodionov.orient.app.main_activities.router.AppRouter
import com.rodionov.orient.app.main_activities.settings.ModuleTypes
import com.rodionov.orient.app.main_activities.view.BottomNavigationBarActivity
import com.rodionov.orient.base.BasePresenter

/**
 * Created by rodionov on 25.09.2019.
 */
class AppPresenterImpl(val router: AppRouter): BasePresenter<BottomNavigationBarActivity, AppInteractor>(),
    AppPresenter {

    override fun bottomNavigationItemClicked(type: Int) {

        when(type){
            ModuleTypes.START_LIST -> router.openStartList()
            ModuleTypes.SCANNER -> router.openScannerFragment()
            ModuleTypes.EVENT_CALENDAR -> router.openEventCalendarFragment()
            ModuleTypes.NEWS -> router.openNews()
        }
    }

    override fun openFirstFragment() {
        router.openFirstFragment()
    }
}