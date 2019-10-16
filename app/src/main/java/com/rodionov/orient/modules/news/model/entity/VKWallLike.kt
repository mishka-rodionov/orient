package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallLike(
    val count: Int = 0,
    @SerializedName("user_likes")
    val userLikes: Int = 0,
    @SerializedName("can_like")
    val canLike: Int = 0,
    @SerializedName("can_publish")
    val canPublish: Int = 0
) {
}