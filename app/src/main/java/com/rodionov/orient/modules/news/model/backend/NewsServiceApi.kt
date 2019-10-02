package com.rodionov.orient.modules.news.model.backend

import com.rodionov.orient.modules.news.model.entity.VKWallResponse
import io.reactivex.Observable
import org.json.JSONObject
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by rodionov on 02.10.2019.
 */
interface NewsServiceApi {

    @GET("/method/wall.get?access_token=9f5109c49f5109c49f5109c4d69f0c04b399f519f5109c4c60827f74439c6ac0b4b68a7&v=5.92")
    fun getWall(@Query("domain") domain: String, @Query("count") count: Int, @Query("offset") offset: Int): Observable<VKWallResponse>
}