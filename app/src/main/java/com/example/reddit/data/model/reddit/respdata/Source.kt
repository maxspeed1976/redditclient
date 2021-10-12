package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Source {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("width")
    @Expose
    var width: Int? = null

    @SerializedName("height")
    @Expose
    var height: Int? = null
}