package com.example.reddit

import com.example.reddit.data.model.reddit.RedditResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JSONPlaceHolderApi {
    @GET("/r/all/top/.json")
    open fun getPost(
        @Query("limit") limit: Int,
        @Query("after") after: String?,
        @Query("before") before: String?
    ): Call<RedditResponse?>?
}