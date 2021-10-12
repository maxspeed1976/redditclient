package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Child {
    @SerializedName("kind")
    @Expose
    var kind: String? = null

    @SerializedName("data")
    @Expose
    var data: PostContext? = null
}