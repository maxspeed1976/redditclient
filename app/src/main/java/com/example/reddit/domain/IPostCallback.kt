package com.example.reddit.domain

interface IPostCallback<T> {
    open fun onResult(result: T?)
    open fun onError(e: Exception?)
}