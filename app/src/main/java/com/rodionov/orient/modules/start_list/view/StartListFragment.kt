package com.rodionov.orient.modules.start_list.view

import android.os.Bundle
import android.util.Log
import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.databinding.ComponentAddItemBinding
import com.rodionov.orient.modules.start_list.StartListAssembler
import com.rodionov.orient.modules.start_list.presenter.StartListPresenter
import com.rodionov.orient.ui.item.AddItem
import com.rodionov.orient.ui.item.DividerItem
import com.rodionov.orient.ui.item.StartListItem
import kotlinx.android.synthetic.main.start_list_fragment.*

/**
 * Created by rodionov on 23.09.2019.
 */
class StartListFragment: BaseFragment<StartListPresenter>(), StartListView {


    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)
        .map<StartListItem>(R.layout.component_start_list_item)
        .map<DividerItem>(R.layout.component_divider_item)
        .map<AddItem, ComponentAddItemBinding>(R.layout.component_add_item){
            onClick{
                Log.d(OrientApp.DEBUG_TAG, "onClick AddItem")
            }
        }

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

    override fun updateView(data: List<Any>) {
        Log.d(OrientApp.LIFECYCLE_TAG, "updateView StartListFragment")
        list.clear()
        list.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun getLayoutResource(): Int {
        return R.layout.start_list_fragment
    }
}