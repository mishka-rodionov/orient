package com.rodionov.orient.modules.event_calendar.view

import android.util.Log
import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.databinding.ComponenEventCalendarItemBinding
import com.rodionov.orient.modules.event_calendar.presenter.EventCalendarPresenter
import com.rodionov.orient.modules.event_calendar.EventCalendarAssembler
import com.rodionov.orient.ui.item.DividerItem
import com.rodionov.orient.ui.item.EventCalendarItem
import kotlinx.android.synthetic.main.event_calendar_fragment.*


class EventCalendarFragment : BaseFragment<EventCalendarPresenter>(), EventCalendarView {


    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)
        .map<EventCalendarItem, ComponenEventCalendarItemBinding>(R.layout.componen_event_calendar_item){
            onClick {
                presenter?.eventItemClicked()
            }
        }
        .map<DividerItem>(R.layout.component_divider_item)

    override fun initPresenter() {
        EventCalendarAssembler().assemble(this)
    }

    override fun initViews(view: View) {
        adapter.into(eventCalendarRecyclerView)
    }

    override fun requestData() {
        Log.d(OrientApp.LIFECYCLE_TAG, "requestData EventCalendarFragment")
        presenter?.requestEvents()
    }

    override fun updateView(data: List<Any>) {
        Log.d(OrientApp.LIFECYCLE_TAG, "updateView EventCalendarFragment")
        list.clear()
        list.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun getLayoutResource(): Int {
        return R.layout.event_calendar_fragment
    }

}