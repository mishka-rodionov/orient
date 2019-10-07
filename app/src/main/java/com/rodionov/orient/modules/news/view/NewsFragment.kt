package com.rodionov.orient.modules.news.view

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.github.nitrico.lastadapter.LastAdapter
import com.rodionov.orient.BR
import com.rodionov.orient.R
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.databinding.ComponentVkWallPostItemBinding
import com.rodionov.orient.modules.news.presenter.NewsPresenter
import com.rodionov.orient.modules.news.NewsAssembler
import com.rodionov.orient.modules.ui.item.DividerItem
import com.rodionov.orient.modules.ui.item.VKWallPostItem
import com.rodionov.orient.utils.UIUtils
import kotlinx.android.synthetic.main.component_vk_wall_post_item.*
import kotlinx.android.synthetic.main.news_fragment.*


class NewsFragment : BaseFragment<NewsPresenter>(), NewsView {

    val list = mutableListOf<Any>()
    val adapter = LastAdapter(list, BR.item)
        .map<VKWallPostItem, ComponentVkWallPostItemBinding>(R.layout.component_vk_wall_post_item){
            onBind {
                val width = UIUtils.getScreenSize(activity as Activity).x
                val params = it.binding.postImage.layoutParams as ViewGroup.MarginLayoutParams
                val sizes = (list[it.adapterPosition] as VKWallPostItem).image.sizes.sortedByDescending { width }
                val index = 3
                Log.d(OrientApp.NETWORK, "screen width = $width")
                Log.d(OrientApp.NETWORK, "sizes[1].width = ${sizes[index].width}")
                Log.d(OrientApp.NETWORK, "sizes[1].height = ${sizes[index].height * width / sizes[index].width}")
                params.width = width
                params.height = sizes[index].height * width / sizes[index].width
                it.binding.postImage.layoutParams = params
                Glide.with(context as Context)
                    .load((list[it.adapterPosition] as VKWallPostItem).image.sizes[3].url)
                    .into(it.binding.postImage)

            }
        }
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