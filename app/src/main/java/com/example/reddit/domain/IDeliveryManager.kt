package com.example.reddit.domain

interface IDeliveryManager<T> {
    fun setCallback(callback: IPostCallback<MutableCollection<T>>)
   // open fun getPrevious()
    fun getNext()
}