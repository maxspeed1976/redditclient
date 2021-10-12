package com.example.reddit.adapter


interface OnItemClickListener<T> {
    open fun onItemClick(item: T)
}