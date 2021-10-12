package com.example.reddit.data.mappers

import com.example.reddit.data.model.reddit.respdata.PostContext
import com.example.reddit.domain.IMapper
import com.example.reddit.domain.model.Post
import java.text.SimpleDateFormat
import java.util.*

class RemotePostMapper : IMapper<PostContext, Post> {
    private val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("HH")
    override fun map(postContext: PostContext?): Post {
        val post = Post()
        post.author = postContext?.getAuthor()
        post.numComments = postContext?.getNumComments()
        val timeposthours = postContext?.getCreatedUtc()
        val timenow = System.currentTimeMillis()
        val timeNow = simpleDateFormat?.format(Date(System.currentTimeMillis()))
        val timeago = timeposthours?.minus(timenow)
        val hoursAgo = (simpleDateFormat?.format(timeago?.let { Date(it) })  ) + " " + "HOURS AGO"
        post.time = hoursAgo

        val url = postContext?.getThumbnail()
        post.url = url

        val prv = postContext?.getPreview()
        var sourceUrl: String? = null
        if (prv?.images != null && prv.images!!.size > 0) {
            val redditSourceUrl = prv.images!![0]?.source?.url
            if (redditSourceUrl != null) {
                sourceUrl = redditSourceUrl.replace("webp&amp;", "webp&")
            }
        }
        post.previewUrl = sourceUrl
        return post
    }
}