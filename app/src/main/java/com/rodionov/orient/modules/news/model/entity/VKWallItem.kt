package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallItem(
    val id: Int = 0,
    @SerializedName("from_id")
    val fromId: Int = 0,
    @SerializedName("owner_id")
    val ownerId: Int = 0,
    val date: Int = 0,
    @SerializedName("marked_as_ads")
    val markedAsAds: Int = 0,
    @SerializedName("post_type")
    val postType: String = "",
    val text: String = "",
    val attachments: List<VKWallAttachment>,
    @SerializedName("post_source")
    val postSource: VKWallPostSource = VKWallPostSource(),
    val comments: VkWallComment = VkWallComment(),
    val likes: VKWallLike = VKWallLike(),
    val reposts: VKWallRepost = VKWallRepost(),
    val views: VKWallView = VKWallView()
) {
}