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

        for (index in 0 until from.response.items.size) {
            list.add(
                VKWallPostItem(
                    text = from.response.items[index].text,
                    likes = from.response.items[index].likes.count.toString(),
                    comments = from.response.items[index].comments.count.toString(),
                    reposts = from.response.items[index].reposts.count.toString(),
                    views = from.response.items[index].views.count.toString(),
                    //may be forward to exception
                    image = from.response.items[index].attachments.filter { it.type == "photo" }[0].photo
//                        .sizes[3].url
//                            [2].photo.sizes[0].url
                )
            )
            list.add(DividerItem())
        }

        return list
    }
}