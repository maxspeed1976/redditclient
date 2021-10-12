package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PostContext {
    @SerializedName("approved_at_utc")
    @Expose
    private var approvedAtUtc: Any? = null

    @SerializedName("subreddit")
    @Expose
    private var subreddit: String? = null

    @SerializedName("selftext")
    @Expose
    private var selftext: String? = null

    @SerializedName("author_fullname")
    @Expose
    private var authorFullname: String? = null

    @SerializedName("saved")
    @Expose
    private var saved: Boolean? = null

    @SerializedName("mod_reason_title")
    @Expose
    private var modReasonTitle: Any? = null

    @SerializedName("gilded")
    @Expose
    private var gilded: Int? = null

    @SerializedName("clicked")
    @Expose
    private var clicked: Boolean? = null

    @SerializedName("title")
    @Expose
    private var title: String? = null

    @SerializedName("link_flair_richtext")
    @Expose
    private var linkFlairRichtext: MutableCollection<LinkFlairRichtext?>? = null

    @SerializedName("subreddit_name_prefixed")
    @Expose
    private var subredditNamePrefixed: String? = null

    @SerializedName("hidden")
    @Expose
    private var hidden: Boolean? = null

    @SerializedName("pwls")
    @Expose
    private var pwls: Int? = null

    @SerializedName("link_flair_css_class")
    @Expose
    private var linkFlairCssClass: Any? = null

    @SerializedName("downs")
    @Expose
    private var downs: Int? = null

    @SerializedName("thumbnail_height")
    @Expose
    private var thumbnailHeight: Int? = null

    @SerializedName("hide_score")
    @Expose
    private var hideScore: Boolean? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("quarantine")
    @Expose
    private var quarantine: Boolean? = null

    @SerializedName("link_flair_text_color")
    @Expose
    private var linkFlairTextColor: String? = null

    @SerializedName("author_flair_background_color")
    @Expose
    private var authorFlairBackgroundColor: Any? = null

    @SerializedName("subreddit_type")
    @Expose
    private var subredditType: String? = null

    @SerializedName("ups")
    @Expose
    private var ups: Int? = null

    @SerializedName("total_awards_received")
    @Expose
    private var totalAwardsReceived: Int? = null

    @SerializedName("media_embed")
    @Expose
    private var mediaEmbed: MediaEmbed? = null

    @SerializedName("thumbnail_width")
    @Expose
    private var thumbnailWidth: Int? = null

    @SerializedName("author_flair_template_id")
    @Expose
    private var authorFlairTemplateId: Any? = null

    @SerializedName("is_original_content")
    @Expose
    private var isOriginalContent: Boolean? = null

    @SerializedName("user_reports")
    @Expose
    private var userReports: MutableCollection<Any?>? = null

    @SerializedName("secure_media")
    @Expose
    private var secureMedia: Any? = null

    @SerializedName("is_reddit_media_domain")
    @Expose
    private var isRedditMediaDomain: Boolean? = null

    @SerializedName("is_meta")
    @Expose
    private var isMeta: Boolean? = null

    @SerializedName("category")
    @Expose
    private var category: Any? = null

    @SerializedName("secure_media_embed")
    @Expose
    private var secureMediaEmbed: SecureMediaEmbed? = null

    @SerializedName("link_flair_text")
    @Expose
    private var linkFlairText: Any? = null

    @SerializedName("can_mod_post")
    @Expose
    private var canModPost: Boolean? = null

    @SerializedName("score")
    @Expose
    private var score: Int? = null

    @SerializedName("approved_by")
    @Expose
    private var approvedBy: Any? = null

    @SerializedName("thumbnail")
    @Expose
    private var thumbnail: String? = null

    @SerializedName("edited")
    @Expose //    private Integer edited;
    //    @SerializedName("author_flair_css_class")
    //    @Expose
    private var authorFlairCssClass: Any? = null

    @SerializedName("steward_reports")
    @Expose
    private var stewardReports: MutableCollection<Any?>? = null

    @SerializedName("author_flair_richtext")
    @Expose
    private var authorFlairRichtext: MutableCollection<Any?>? = null

    @SerializedName("gildings")
    @Expose
    private var gildings: Gildings? = null

    @SerializedName("post_hint")
    @Expose
    private var postHint: String? = null

    @SerializedName("content_categories")
    @Expose
    private var contentCategories: Any? = null

    @SerializedName("is_self")
    @Expose
    private var isSelf: Boolean? = null

    @SerializedName("mod_note")
    @Expose
    private var modNote: Any? = null

    @SerializedName("created")
    @Expose
    private var created: Int? = null

    @SerializedName("link_flair_type")
    @Expose
    private var linkFlairType: String? = null

    @SerializedName("wls")
    @Expose
    private var wls: Int? = null

    @SerializedName("banned_by")
    @Expose
    private var bannedBy: Any? = null

    @SerializedName("author_flair_type")
    @Expose
    private var authorFlairType: String? = null

    @SerializedName("domain")
    @Expose
    private var domain: String? = null

    @SerializedName("allow_live_comments")
    @Expose
    private var allowLiveComments: Boolean? = null

    @SerializedName("selftext_html")
    @Expose
    private var selftextHtml: Any? = null

    @SerializedName("likes")
    @Expose
    private var likes: Any? = null

    @SerializedName("suggested_sort")
    @Expose
    private var suggestedSort: Any? = null

    @SerializedName("banned_at_utc")
    @Expose
    private var bannedAtUtc: Any? = null

    @SerializedName("view_count")
    @Expose
    private var viewCount: Any? = null

    @SerializedName("archived")
    @Expose
    private var archived: Boolean? = null

    @SerializedName("no_follow")
    @Expose
    private var noFollow: Boolean? = null

    @SerializedName("is_crosspostable")
    @Expose
    private var isCrosspostable: Boolean? = null

    @SerializedName("pinned")
    @Expose
    private var pinned: Boolean? = null

    @SerializedName("over_18")
    @Expose
    private var over18: Boolean? = null

    @SerializedName("preview")
    @Expose
    private var preview: Preview? = null

    @SerializedName("all_awardings")
    @Expose
    private var allAwardings: MutableCollection<AllAwarding?>? = null

    @SerializedName("awarders")
    @Expose
    private var awarders: MutableCollection<Any?>? = null

    @SerializedName("media_only")
    @Expose
    private var mediaOnly: Boolean? = null

    @SerializedName("can_gild")
    @Expose
    private var canGild: Boolean? = null

    @SerializedName("spoiler")
    @Expose
    private var spoiler: Boolean? = null

    @SerializedName("locked")
    @Expose
    private var locked: Boolean? = null

    @SerializedName("author_flair_text")
    @Expose
    private var authorFlairText: Any? = null

    @SerializedName("visited")
    @Expose
    private var visited: Boolean? = null

    @SerializedName("removed_by")
    @Expose
    private var removedBy: Any? = null

    @SerializedName("num_reports")
    @Expose
    private var numReports: Any? = null

    @SerializedName("distinguished")
    @Expose
    private var distinguished: Any? = null

    @SerializedName("subreddit_id")
    @Expose
    private var subredditId: String? = null

    @SerializedName("mod_reason_by")
    @Expose
    private var modReasonBy: Any? = null

    @SerializedName("removal_reason")
    @Expose
    private var removalReason: Any? = null

    @SerializedName("link_flair_background_color")
    @Expose
    private var linkFlairBackgroundColor: String? = null

    @SerializedName("id")
    @Expose
    private var id: String? = null

    @SerializedName("is_robot_indexable")
    @Expose
    private var isRobotIndexable: Boolean? = null

    @SerializedName("report_reasons")
    @Expose
    private var reportReasons: Any? = null

    @SerializedName("author")
    @Expose
    private var author: String? = null

    fun getAuthor(): String? {
        return author
    }

    @SerializedName("discussion_type")
    @Expose
    private var discussionType: Any? = null

    @SerializedName("num_comments")
    @Expose
    private var numComments: Int? = null

    fun getNumComments(): Int? {
        return numComments
    }
    fun getThumbnail(): String? {
        return thumbnail
    }

    fun getPreview(): Preview? {
        return preview
    }
    fun getCreatedUtc(): Long? {
        return createdUtc
    }

    @SerializedName("send_replies")
    @Expose
    private var sendReplies: Boolean? = null

    @SerializedName("whitelist_status")
    @Expose
    private var whitelistStatus: String? = null

    @SerializedName("contest_mode")
    @Expose
    private var contestMode: Boolean? = null

    @SerializedName("mod_reports")
    @Expose
    private var modReports: MutableCollection<Any?>? = null

    @SerializedName("author_patreon_flair")
    @Expose
    private var authorPatreonFlair: Boolean? = null

    @SerializedName("author_flair_text_color")
    @Expose
    private var authorFlairTextColor: Any? = null

    @SerializedName("permalink")
    @Expose
    private var permalink: String? = null

    @SerializedName("parent_whitelist_status")
    @Expose
    private var parentWhitelistStatus: String? = null

    @SerializedName("stickied")
    @Expose
    private var stickied: Boolean? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("subreddit_subscribers")
    @Expose
    private var subredditSubscribers: Int? = null

    @SerializedName("created_utc")
    @Expose
    private var createdUtc: Long? = null

    @SerializedName("num_crossposts")
    @Expose
    private var numCrossposts: Int? = null

    @SerializedName("media")
    @Expose
    private var media: Any? = null

    @SerializedName("is_video")
    @Expose
    private var isVideo: Boolean? = null

    @SerializedName("link_flair_template_id")
    @Expose
    private var linkFlairTemplateId: String? = null

}