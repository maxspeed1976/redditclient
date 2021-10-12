package com.example.reddit.data.model.reddit.respdata

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService private constructor() {
    private val mRetrofit: Retrofit?

    companion object {
        private val BASE_URL: String = "https://jsonplaceholder.typicode.com"
        private var mInstance: NetworkService? = null
        fun getInstance(): NetworkService? {
            if (mInstance == null) {
                mInstance = NetworkService()
            }
            return mInstance
        }
    }

    init {
        mRetrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}