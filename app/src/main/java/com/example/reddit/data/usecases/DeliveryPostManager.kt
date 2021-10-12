package com.example.reddit.data.usecases

import android.util.Log
import com.example.reddit.JSONPlaceHolderApi
import com.example.reddit.data.model.reddit.RedditResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.reddit.data.model.reddit.respdata.PostContext
import com.example.reddit.domain.IDeliveryManager
import com.example.reddit.domain.IMapper
import com.example.reddit.domain.IPostCallback
import com.example.reddit.domain.model.Post
import com.example.reddit.data.mappers.RemotePostMapper

class DeliveryPostManager : IDeliveryManager<Post> {
    private val TAG: String = "DeliveryPostManager"
    private var after: String? = null
    private var before: String? = null
    private var api: JSONPlaceHolderApi? = null
    private var mapper: IMapper<PostContext, Post>? = null
    private var callback: IPostCallback<MutableCollection<Post>>? = null
    private val hashList = mutableListOf<String?>()
    private fun init() {
        mapper = RemotePostMapper()
        hashList.add(null)
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BASIC
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl("https://www.reddit.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(JSONPlaceHolderApi::class.java)
    }

    override fun setCallback(callback: IPostCallback<MutableCollection<Post>>) {
        this.callback = callback
    }

  //  override fun getPrevious() {
   //     delivery(false)
  //  }

    override fun getNext() {
        delivery(true)
   }

    private fun delivery(isNext: Boolean) {
        val call: Call<RedditResponse?>?
        var hash: String? = null
        hash = if (isNext) {
            hashList.lastOrNull()
        } else {
            if (hashList.size < 3) {
                null
            } else {
                hashList[hashList.size - 3]
            }
        }
        call = if (isNext) {
            api?.getPost(10, hash, null)
        } else {
            api?.getPost(10, hash, null)
        }
        call?.enqueue(object : Callback<RedditResponse?> {
            override fun onResponse(
                call: Call<RedditResponse?>?,
                response: Response<RedditResponse?>?
            ) {
                val resp = response?.body()
                after = resp?.responseData?.after
                Log.d(TAG, "after: $after")
                before = resp?.responseData?.before
                Log.d(TAG, "before: $before")
                if (isNext) {
                    hashList.add(after)

                } else {
                    if (hashList.size > 2) {
                        hashList.removeLast()
                    }
                }
                Log.d(TAG, "HashList: $hashList")
                val size = resp?.responseData?.children?.size ?: 0
                val posts = mutableListOf<Post>()
                for (i in 0 until size) {

                    // Add to response list
                    val post = resp?.responseData?.children?.get(i)?.data
                    post?.let {
                        mapper?.map(it)?.let {
                            posts.add(it)
                        }
                    }
                }
                callback?.onResult(posts)
            }

            //  Picasso.get().load("http://i.imgur.com/DvpvklR.png").into((Target) imageView);
            //                Log.d(TAG, String.valueOf(exp) + "ответ ");
            override fun onFailure(call: Call<RedditResponse?>?, t: Throwable?) {
                Log.d(TAG, "OnFailure: " + t?.message)
                t?.printStackTrace()
                callback?.onError(Exception(t?.message))
            }
        })
    }

    init {
        init()
    }
}