package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Preview {
    @SerializedName("images")
    @Expose
    var images: List<Image>? = null

    @SerializedName("enabled")
    @Expose
    var enabled: Boolean? = null
}