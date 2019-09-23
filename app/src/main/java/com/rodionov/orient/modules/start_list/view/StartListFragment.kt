package com.rodionov.orient.modules.start_list.view

import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.start_list.StartListAssembler
import com.rodionov.orient.modules.start_list.presenter.StartListPresenter
import com.rodionov.orient.modules.ui.StartListItem

/**
 * Created by rodionov on 23.09.2019.
 */
class StartListFragment: BaseFragment<StartListPresenter>() {

    val list = mutableListOf<StartListItem>()
    val adapter = LastAdapter(list, BR.item)
        .map<StartListItem>(R.layout.start_list_item)

    override fun initPresenter() {
        StartListAssembler().assemble(this)
    }

    override fun getLayoutResource(): Int {
        return R.layout.start_list_fragment
    }
}