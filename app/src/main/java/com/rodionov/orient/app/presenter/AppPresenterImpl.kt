package com.rodionov.orient.app.presenter

import com.rodionov.orient.app.model.interactor.AppInteractor
import com.rodionov.orient.app.router.AppRouter
import com.rodionov.orient.app.settings.ModuleTypes
import com.rodionov.orient.app.view.BottomNavigationBarActivity
import com.rodionov.orient.base.BasePresenter

/**
 * Created by rodionov on 25.09.2019.
 */
class AppPresenterImpl(val router: AppRouter): BasePresenter<BottomNavigationBarActivity, AppInteractor>(), AppPresenter {

    override fun bottomNavigationItemClicked(type: Int) {

        when(type){
            ModuleTypes.START_LIST -> router.openStartList()
            ModuleTypes.SCANNER -> router.openScannerFragment()
            ModuleTypes.EVENT_CALENDAR -> router.openEventCalendarFragment()
            ModuleTypes.NEWS -> router.openNews()
        }
    }
}