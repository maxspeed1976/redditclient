package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LinkFlairRichtext {
    @SerializedName("e")
    @Expose
    private var e: String? = null

    @SerializedName("t")
    @Expose
    private var t: String? = null

}