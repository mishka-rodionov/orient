package com.rodionov.orient.modules.news.view

import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.news.presenter.NewsPresenter
import com.rodionov.orient.modules.news.NewsAssembler


class NewsFragment : BaseFragment<NewsPresenter>(), NewsView {

    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)


    override fun initPresenter() {
        NewsAssembler().assemble(this)
    }

    override fun requestData() {
        presenter?.requestData()
    }

    override fun initViews(view: View) {

    }

    override fun getLayoutResource(): Int {
        return R.layout.news_fragment
    }

}