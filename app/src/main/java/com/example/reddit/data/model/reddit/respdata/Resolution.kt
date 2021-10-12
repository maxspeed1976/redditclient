package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Resolution {
    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("width")
    @Expose
    private var width: Int? = null

    @SerializedName("height")
    @Expose
    private var height: Int? = null

}