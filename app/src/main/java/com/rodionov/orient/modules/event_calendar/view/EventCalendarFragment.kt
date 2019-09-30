package com.rodionov.orient.modules.event_calendar.view

import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.event_calendar.presenter.EventCalendarPresenter
import com.rodionov.orient.modules.event_calendar.EventCalendarAssembler
import kotlinx.android.synthetic.main.event_calendar_fragment.*


class EventCalendarFragment : BaseFragment<EventCalendarPresenter>(), EventCalendarView {


    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)

    override fun initPresenter() {
        EventCalendarAssembler().assemble(this)
    }

    override fun initViews(view: View) {
        adapter.into(eventCalendarRecyclerView)
    }

    override fun requestData() {

    }

    override fun getLayoutResource(): Int {
        return R.layout.event_calendar_fragment
    }

}