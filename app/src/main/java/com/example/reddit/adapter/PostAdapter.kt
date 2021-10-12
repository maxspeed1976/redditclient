package com.example.reddit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reddit.R

import com.example.reddit.adapter.PostAdapter.MyViewHolder
import com.example.reddit.domain.model.Post
import com.squareup.picasso.Picasso
import java.util.ArrayList

class PostAdapter : RecyclerView.Adapter<MyViewHolder?>() {
    private val list: ArrayList<Post> = ArrayList<Post>()
    private var listener: OnItemClickListener<Post>? = null
    private var limitListener: OnLastItemLimit? = null
    private var recyclerView: RecyclerView? = null

    fun addPosts(posts: Collection<Post?>?) {
        list.addAll(posts as Collection<Post>)
        notifyItemRangeInserted(list.size - posts.size, posts.size)
    }

    fun setItemClickListener(listener: OnItemClickListener<Post>?) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post: Post = list[position]
        holder.tvAuthor.text = post.author
        holder.tvTime.text = post.time
        holder.tvnumComments.text = post.numComments.toString()
        Picasso.get()
            .load(post.previewUrl)
            .resize(150, 150)
            .into(holder.img)
        holder.vgParent.setOnClickListener(View.OnClickListener {
            if (listener != null) {
                listener!!.onItemClick(post)
            }
        })
        if (position == list.size - 1 && limitListener != null) {
            limitListener!!.onLasItemLimit(position)
        }
    }



    fun setLastPositionListener(limitListener: OnLastItemLimit?) {
        this.limitListener = limitListener
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        this.recyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        this.recyclerView = null
    }

    fun create() {
        if (list.isEmpty() && limitListener != null) {
            limitListener!!.onLasItemLimit(list.size)
        }
    }


    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // each data item is just a string in this case
        var tvAuthor: TextView
        var tvTime: TextView
        var img: ImageView
        var vgParent: ViewGroup
        var tvnumComments: TextView

        init {
            vgParent = v.findViewById<ViewGroup>(R.id.llParent)
            tvAuthor = v.findViewById<TextView>(R.id.tvAuthor)
            tvTime = v.findViewById<TextView>(R.id.tvTime)
            tvnumComments = v.findViewById<TextView>(R.id.numComments)
            img = v.findViewById(R.id.image)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}