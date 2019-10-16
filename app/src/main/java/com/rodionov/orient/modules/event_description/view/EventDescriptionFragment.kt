package com.rodionov.orient.modules.event_description.view

import android.view.View
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.event_description.presenter.EventDescriptionPresenter
import com.rodionov.orient.modules.event_description.EventDescriptionAssembler
import kotlinx.android.synthetic.main.event_description_fragment.*


class EventDescriptionFragment : BaseFragment<EventDescriptionPresenter>(), EventDescriptionView {

    companion object{
        fun newInstance(): EventDescriptionFragment{
            val fragment = EventDescriptionFragment()
            return fragment
        }
    }


    override fun initPresenter() {
        EventDescriptionAssembler().assemble(this)
    }

    override fun requestData() {

    }

    override fun initViews(view: View) {
        startProtocolLayout.setOnClickListener {
            presenter?.startProtocolClicked()
        }
    }

    override fun getLayoutResource(): Int {
        return R.layout.event_description_fragment
    }

}