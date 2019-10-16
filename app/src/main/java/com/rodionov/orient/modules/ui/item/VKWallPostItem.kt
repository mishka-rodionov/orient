package com.rodionov.orient.modules.ui.item

import com.rodionov.orient.modules.news.model.entity.VKWallPhoto

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallPostItem(val text: String = "",
                     val likes: String = "",
                     val comments: String = "",
                     val reposts: String = "",
                     val views: String = "",
                     val image: VKWallPhoto = VKWallPhoto()) {
}