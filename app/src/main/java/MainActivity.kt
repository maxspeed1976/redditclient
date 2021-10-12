import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reddit.R
import com.example.reddit.adapter.OnItemClickListener
import com.example.reddit.adapter.OnLastItemLimit
import com.example.reddit.adapter.PostAdapter
import com.example.reddit.data.usecases.DeliveryPostManager
import com.example.reddit.domain.IDeliveryManager
import com.example.reddit.domain.IPostCallback
import com.example.reddit.domain.model.Post

class MainActivity : Activity() {
    private var recyclerView: RecyclerView? = null
    private var deliveryManager: IDeliveryManager<Post>? = null
    private var postCallback: IPostCallback<MutableCollection<Post>>? = null
    private var adapter: PostAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        deliveryManager = DeliveryPostManager()
        postCallback = object : IPostCallback<MutableCollection<Post>> {
            override fun onResult(posts: MutableCollection<Post>?) {

                Log.d("TAG", "Posts size: " + posts?.size)
                Handler(Looper.getMainLooper()).post { adapter?.addPosts(posts) }
            }

            override fun onError(e: Exception?) {
                e?.printStackTrace()
            }

        }

        deliveryManager!!.setCallback(postCallback!!)

        adapter?.create()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView?.setLayoutManager(layoutManager)
        adapter = PostAdapter()
        recyclerView?.setAdapter(adapter)
        val listener = object : OnItemClickListener<Post> {
            override fun onItemClick(item: Post) {
                Log.d(TAG, "Click: $item")
                sendData(item)
            }
        }

        val limitListener: OnLastItemLimit = object : OnLastItemLimit {
            private var last = -1
            override fun onLasItemLimit(lastPosition: Int) {
                if (lastPosition > last) {
                    last = lastPosition
                    Toast.makeText(
                        this@MainActivity,
                        "Last item: $lastPosition",
                        Toast.LENGTH_SHORT
                    ).show()
                    deliveryManager?.getNext()
                }
            }
        }
        adapter?.setLastPositionListener(limitListener)
        adapter?.setItemClickListener(listener)
    }

    private fun sendData(post: Post?) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("url", post?.url)
        Log.d("sendData ", "URL " + post?.url)
        startActivity(intent)
    }

    companion object {
        private val TAG: String = "Main"
    }
}