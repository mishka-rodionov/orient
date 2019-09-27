package com.rodionov.orient.modules.start_list.view

import com.rodionov.orient.base.BaseView
import com.rodionov.orient.modules.start_list.presenter.StartListPresenter
import com.rodionov.orient.modules.ui.item.StartListItem

/**
 * Created by rodionov on 26.09.2019.
 */
interface StartListView: BaseView<StartListPresenter> {
    fun updateView(data: List<StartListItem>)
}