package com.example.reddit.data.model.reddit.respdata

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllAwarding {
    @SerializedName("count")
    @Expose
    private var count: Int? = null

    @SerializedName("is_enabled")
    @Expose
    private var isEnabled: Boolean? = null

    @SerializedName("subreddit_id")
    @Expose
    private var subredditId: Any? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("end_date")
    @Expose
    private var endDate: Any? = null

    @SerializedName("award_sub_type")
    @Expose
    private var awardSubType: String? = null

    @SerializedName("coin_reward")
    @Expose
    private var coinReward: Int? = null

    @SerializedName("icon_url")
    @Expose
    private var iconUrl: String? = null

    @SerializedName("days_of_premium")
    @Expose
    private var daysOfPremium: Int? = null

    @SerializedName("is_new")
    @Expose
    private var isNew: Boolean? = null

    @SerializedName("id")
    @Expose
    private var id: String? = null

    @SerializedName("icon_height")
    @Expose
    private var iconHeight: Int? = null

    @SerializedName("resized_icons")
    @Expose
    private var resizedIcons: MutableList<ResizedIcon?>? = null

    @SerializedName("days_of_drip_extension")
    @Expose
    private var daysOfDripExtension: Int? = null

    @SerializedName("award_type")
    @Expose
    private var awardType: String? = null

    @SerializedName("start_date")
    @Expose
    private var startDate: Any? = null

    @SerializedName("coin_price")
    @Expose
    private var coinPrice: Int? = null

    @SerializedName("icon_width")
    @Expose
    private var iconWidth: Int? = null

    @SerializedName("subreddit_coin_reward")
    @Expose
    private var subredditCoinReward: Int? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null







}