package com.example.reddit.domain.model

class Post {
    var time: String? = null
    var url: String? = null
    var previewUrl: String? = null
    var author: String? = null
    var numComments: Int? = null




    override fun toString(): String {
        return ("Post{"
                + "time='"
                + time
                + '\''
                + ", url='"
                + url
                + '\''
                + ", previewUrl='"
                + previewUrl
                + '\''
                + ", author='"
                + author
                + '\''
                + ", numComments="
                + numComments
                + '}')
    }
}