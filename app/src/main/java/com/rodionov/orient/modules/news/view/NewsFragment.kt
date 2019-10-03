package com.rodionov.orient.modules.news.view

import android.view.View
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.news.presenter.NewsPresenter
import com.rodionov.orient.modules.news.NewsAssembler
import com.rodionov.orient.modules.ui.item.DividerItem
import com.rodionov.orient.modules.ui.item.VKWallPostItem
import kotlinx.android.synthetic.main.news_fragment.*


class NewsFragment : BaseFragment<NewsPresenter>(), NewsView {

    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)
        .map<VKWallPostItem>(R.layout.component_vk_wall_post_item)
        .map<DividerItem>(R.layout.component_divider_item)


    override fun initPresenter() {
        NewsAssembler().assemble(this)
    }

    override fun requestData() {
        presenter?.requestData()
    }

    override fun initViews(view: View) {
        adapter.into(newsRecyclerView)
    }

    override fun updateView(data: List<Any>) {
        list.clear()
        list.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun getLayoutResource(): Int {
        return R.layout.news_fragment
    }

}