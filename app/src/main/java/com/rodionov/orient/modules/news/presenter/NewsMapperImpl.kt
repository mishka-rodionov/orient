package com.rodionov.orient.modules.news.presenter

import com.rodionov.orient.modules.news.model.entity.VKWallResponse
import com.rodionov.orient.modules.ui.item.DividerItem
import com.rodionov.orient.modules.ui.item.VKWallPostItem

/**
 * Created by rodionov on 03.10.2019.
 */
class NewsMapperImpl: NewsMapper {

    override fun map(from: VKWallResponse): List<Any> {
        val list = mutableListOf<Any>()

        for (index in 0..8) {
            list.add(
                VKWallPostItem(
                    likes = from.response.items[index].likes.count.toString(),
                    comments = from.response.items[index].comments.count.toString(),
                    reposts = from.response.items[index].reposts.count.toString(),
                    views = from.response.items[index].views.count.toString()
                )
            )
            list.add(DividerItem())
        }

        return list
    }
}