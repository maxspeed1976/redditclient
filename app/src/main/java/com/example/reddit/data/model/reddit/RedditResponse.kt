package com.example.reddit.data.model.reddit

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class RedditResponse {
    @SerializedName("kind")
    @Expose
    var kind: String? = null

    @SerializedName("data")
    @Expose
    var responseData: ResponseData? = null


    override fun toString(): String {
        return "RedditResponse{" +
                "kind='" + kind + '\'' +
                ", responseData=" + responseData +
                '}'
    }
}