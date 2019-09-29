package com.rodionov.orient.modules.start_list.view

import android.os.Bundle
import android.util.Log
import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.app.presenter.AppPresenter
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.start_list.StartListAssembler
import com.rodionov.orient.modules.start_list.presenter.StartListPresenter
import com.rodionov.orient.modules.ui.item.StartListItem
import kotlinx.android.synthetic.main.start_list_fragment.*

/**
 * Created by rodionov on 23.09.2019.
 */
class StartListFragment: BaseFragment<StartListPresenter>(), StartListView {


    val list = mutableListOf<StartListItem>()
    val adapter = LastAdapter(list, BR.item)
        .map<StartListItem>(R.layout.start_list_item)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(OrientApp.LIFECYCLE_TAG, "onCreate StartListFragment")
    }

    override fun requestData() {
        Log.d(OrientApp.LIFECYCLE_TAG, "requestData StartListFragment")
        presenter?.requestParticipantsList()
    }

    override fun initPresenter() {
        StartListAssembler().assemble(this)
    }

    override fun initViews(view: View) {
        adapter.into(startListRecyclerView)
    }

    override fun updateView(data: List<StartListItem>) {
        Log.d(OrientApp.LIFECYCLE_TAG, "updateView StartListFragment")
        list.clear()
        list.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun getLayoutResource(): Int {
        return R.layout.start_list_fragment
    }
}