package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Image {
    @SerializedName("source")
    @Expose
    var source: Source? = null

    @SerializedName("resolutions")
    @Expose
    var resolutions: List<Resolution>? = null

    @SerializedName("variants")
    @Expose
    var variants: Variants? = null

    @SerializedName("id")
    @Expose
    var id: String? = null
}