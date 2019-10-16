package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 02.10.2019.
 */
class VkWallComment(
    val count: Int = 0,
    @SerializedName("can_post")
    val canPost: Int = 0,
    @SerializedName("groups_can_post")
    val groupsCanPost: Boolean = false
) {
}