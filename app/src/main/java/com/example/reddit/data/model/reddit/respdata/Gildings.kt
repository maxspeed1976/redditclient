package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Gildings {
    @SerializedName("gid_1")
    @Expose
    private var gid1: Int? = null

    @SerializedName("gid_2")
    @Expose
    private var gid2: Int? = null

    @SerializedName("gid_3")
    @Expose
    private var gid3: Int? = null

}