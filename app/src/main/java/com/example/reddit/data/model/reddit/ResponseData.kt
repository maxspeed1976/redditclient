package com.example.reddit.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.example.reddit.data.model.reddit.respdata.Child
import java.util.ArrayList

class ResponseData {
    @SerializedName("modhash")
    @Expose
    var modhash: String? = null

    @SerializedName("dist")
    @Expose
    var dist: Int? = null

    @SerializedName("children")
    @Expose
    var children: ArrayList<Child>? = null

    @SerializedName("after")
    @Expose
    var after: String? = null

    @SerializedName("before")
    @Expose
    var before: String? = null
    override fun toString(): String {
        return "ResponseData{" +
                "modhash='" + modhash + '\'' +
                ", dist=" + dist +
                ", after='" + after + '\'' +
                ", before=" + before +
                '}'
    }
}