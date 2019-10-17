package com.rodionov.orient.modules.start_list.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.start_list.model.interactor.StartListInteractor
import com.rodionov.orient.modules.start_list.view.StartListView
import com.rodionov.orient.ui.item.AddItem
import com.rodionov.orient.ui.item.DividerItem
import com.rodionov.orient.ui.item.StartListItem

/**
 * Created by rodionov on 23.09.2019.
 */
class StartListPresenterImpl: BasePresenter<StartListView, StartListInteractor>(), StartListPresenter {

    override fun requestParticipantsList() {
        val list = mutableListOf<Any>()
        for (item in 0..10){
            list.add(StartListItem(firstName = "Ivan $item", lastName = "Ivanov", clubName = "Balashov", startTime = item, positionNumber = (item + 1).toString()))
            list.add(DividerItem())
        }
        list.add(AddItem())
//        for (index in 0 until list.size){
//            Log.d(OrientApp.LIFECYCLE_TAG, "requestParticipantsList ${list[index].firstName}")
//        }
        view?.updateView(list)
    }

}