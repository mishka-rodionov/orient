package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 04.10.2019.
 */
class VKWallVideo(
    val id: Int = 0,
    @SerializedName("owner_id")
    val ownerId: Int = 0,
    val title: String = "",
    val duration: Int = 0,
    val description: String = "",
    val date: Long = 0,
    val comments: Int = 0,
    val views: Int = 0,
    @SerializedName("local_views")
    val localViews: Int = 0,
    @SerializedName("photo_130")
    val photo130: String = "",
    @SerializedName("photo_320")
    val photo320: String = "",
    @SerializedName("photo_640")
    val photo640: String = "",
    @SerializedName("photo_800")
    val photo800: String = "",
    @SerializedName("access_key")
    val accessKey: String = "",
    val platform: String = "",
    @SerializedName("can_add")
    val canAdd: Int = 0,
    @SerializedName("track_code")
    val trackCode: String = ""
) {
}